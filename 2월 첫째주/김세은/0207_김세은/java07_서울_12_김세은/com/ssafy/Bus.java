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
		String str = ("*차량번호: " + getNum() + "\t모델명: " + getModel() + "\t가격: " + getPrice() + "만원" + "\t좌석 수 : "
				+ seat);
		return str;
	}
}
