package com.ssafy;

public class Truck extends Car {
	private int ton;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		// TODO Auto-generated constructor stub

		this.ton = ton;
	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public String toString() {
		String str = ("*������ȣ: " + getNum() + "\t�𵨸�: " + getModel() + "\t����: " + getPrice() + "����" + "\t�� : " + ton);
		return str;
	}
}
