package manager.concrete;

import dataAccess.abstracts.UserDao;
import entities.entity.User;
import manager.abstracts.Manager;
import manager.abstracts.Valid;

public class UserManager implements Manager {

	private UserDao _userDao;
	private Valid isValidInformation;
	private EmailManager emailmanager;

	public UserManager(UserDao userDao,Valid isValidInformation,EmailManager emailmanager) {
		super();
		this._userDao = userDao;
		this.isValidInformation = isValidInformation;
		this.emailmanager = emailmanager;
	}


	@Override
	public void singUp(entities.entity.User user) {
		if(isValidInformation.isValid(user)) {_userDao.add(user);
		System.out.println("Sisteme baþarýyla kayýt oldunuz!");
		emailmanager.mailSend();
		}
		else 
			System.out.println("Kayýt baþarýsýz. Ýsim-Soyisim 2 harften fazla olmalýdýr."
					+ " Parola en az 6 harften oluþmalýdýr.");
		
		

	}

	@Override
	public void delete(entities.entity.User user) {
		_userDao.delete(user);
		System.out.println("Hesabýnýzý baþarýyla sildiniz."
                +"Aramýzdan ayrýldýðýnýz için çok üzgünüz. :(");
			
	}

	@Override
	public void update(entities.entity.User user) {
		_userDao.update(user);	
		System.out.println("Baþarýyla güncellendi.");
	}
	
	public void userVerify(User user,int verificationCode){
		int result = emailmanager.mailSend();
		if (result == verificationCode) {
			
			System.out.println("Kullanýcý doðrulandý. Üyeliðiniz Tamamlandý!!! "+user.getName());
		}
		else {
			System.out.println("Doðrulama kodunuz yanlýþ!");
		}
	}
	
	

}
