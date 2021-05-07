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
		System.out.println("Sisteme ba�ar�yla kay�t oldunuz!");
		emailmanager.mailSend();
		}
		else 
			System.out.println("Kay�t ba�ar�s�z. �sim-Soyisim 2 harften fazla olmal�d�r."
					+ " Parola en az 6 harften olu�mal�d�r.");
		
		

	}

	@Override
	public void delete(entities.entity.User user) {
		_userDao.delete(user);
		System.out.println("Hesab�n�z� ba�ar�yla sildiniz."
                +"Aram�zdan ayr�ld���n�z i�in �ok �zg�n�z. :(");
			
	}

	@Override
	public void update(entities.entity.User user) {
		_userDao.update(user);	
		System.out.println("Ba�ar�yla g�ncellendi.");
	}
	
	public void userVerify(User user,int verificationCode){
		int result = emailmanager.mailSend();
		if (result == verificationCode) {
			
			System.out.println("Kullan�c� do�ruland�. �yeli�iniz Tamamland�!!! "+user.getName());
		}
		else {
			System.out.println("Do�rulama kodunuz yanl��!");
		}
	}
	
	

}
