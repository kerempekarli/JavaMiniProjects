package Entities;

import java.sql.Date;

import Entities.Ýnterfaces.Entity;

public class Gamer implements Entity {
	
	private int id;
	private String name;
	private String surname;
	private Date birthDate;
	private String tcNo;
	private int money;
	private Game[] games;
	
	
	public Gamer(int id, String name, String surname, Date birthDate, String tcNo, int money) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.tcNo = tcNo;
		this.money = money;
	}
	
	
	//*********************************

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	//*********************************
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//*********************************
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	//*********************************
	
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	//*********************************
	
	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	//*********************************
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	//*********************************
	
	
	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}


	public String getIdentityNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
