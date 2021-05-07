package manager.concrete;

import manager.abstracts.Valid;

import java.util.regex.Pattern;

import entities.entity.User;

public class IsValidInformation implements Valid {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean isValid(User user) {
		boolean result=BusinessRules.Run(
				isValidName(user),
				isValidSurname(user),
				isValidPassword(user),
				isValidEmail(user));
		return result;
	}


	public boolean isValidName(User user) {
		if(user.getName().length()<2) {
			System.out.println("Ýsim en az 2 harften oluþmalýdýr");
			return false;
		}
		return true;
	}

	@Override
	public boolean isValidSurname(User user) {
		if(user.getSurname().length()<2) {
			System.out.println("Soyadý en az 2 harften oluþmalýdýr");
			return false;
		}
		return true;
	}
	
	public boolean isValidPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Parola en az 6 harften oluþmalýdýr");
			return false;
		}
		return true;
	}
	

	@Override
	public boolean isValidEmail(User user) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(user.geteMail()).find();
	}




}
