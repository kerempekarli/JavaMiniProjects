package manager.abstracts;

import entities.entity.User;

public interface Valid {
	boolean isValid(User user);
	boolean isValidName(User user);
	boolean isValidSurname(User user);
	boolean isValidEmail(User user);
		
}
