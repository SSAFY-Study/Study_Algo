package com.ssafy;

public class Bus extends Car {

	private int seat;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(String num, String model, int price, int seat) {
		super(num, model, price);
		// TODO Auto-generated constructor stub
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String toString() {
		String str = ("*������ȣ: " + getNum() + "\t�𵨸�: " + getModel() + "\t����: " + getPrice() + "����" + "\t�¼� �� : "
				+ seat);
		return str;
	}
}
