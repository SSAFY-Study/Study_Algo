package com.ssafy;

public class Car {
	private String num;
	private String model;
	private int price;

	public Car() {
		super();
	}

	public Car(String num, String model, int price) {
		super();
		this.num = num;
		this.model = model;
		this.price = price;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		String str = ("*차량번호: " + num + "\t모델명: " + model + "\t가격: " + price + "만원");
		return str;
	}

}
