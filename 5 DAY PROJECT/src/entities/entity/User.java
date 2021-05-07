package entities.entity;

import entities.abstracts.Entity;

public class User implements Entity{
		
	private String name;
	private String surname;
	private String eMail;
	private int age;
	private String password;
	
	public User(String name, String surname, String eMail, int age, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.age = age;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
