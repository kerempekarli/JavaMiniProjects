package manager.concrete;

import java.util.Random;

public class EmailManager {
	
	int verificationCode;
	
	public EmailManager() {
		
		Random a = new Random();
		
		this.verificationCode= a.nextInt(1000)*10;
	}
	
	
	public int mailSend() {		
		return this.verificationCode;
	}

}
