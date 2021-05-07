package Entities;

import Entities.Ýnterfaces.Entity;

public class Game implements Entity {
	private String name;
	private int price;
	private String detail;
	private int discount;
	private String type;
	private int unitPriceAfterDiscount;
	
	public Game(String name, int price, String detail, String type) {
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {	
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUnitPriceAfterDiscount() {
		return this.price-((this.price*this.discount)/100);
	}
	
	
}