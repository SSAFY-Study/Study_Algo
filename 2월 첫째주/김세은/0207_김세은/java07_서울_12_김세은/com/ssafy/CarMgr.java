package com.ssafy;

public class CarMgr {
	/** 차량정보를 저장하는 배열 */
	private Car[] cars = new Car[100];
	private int index;
	private static CarMgr instance;

	private CarMgr() {

	}

	public static CarMgr getInstance() {
		if (instance == null) {
			instance = new CarMgr();
		}
		return instance;
	}

	/** 파라메터로 전달된 차량 정보를 배열에 저장한다 */
	public void add(Car c) {
		cars[index++] = c;
	}

	/** 현재 저장된 모든 차량 정보를 리턴한다 */
	public Car[] search() {

		return cars;

	}

	/** 파라메터로 전달된 번호와 같은 차량 정보를 리턴한다 */
	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num))
				return cars[i];
		}
		return null;
	}

	/** 파라메터로 전달된 가격보다 작은 차량 정보들을 리턴한다 */
	public Car[] search(int price) {
		Car[] temp = new Car[100];
		for (int i = 0; i < index; i++) {
			if (cars[i].getPrice() < price) {
				temp[i] = cars[i];

			}

		}
		return temp;

	}

	/** 파라메터로 전달된 번호의 차량을 검색하여 가격을 수정한다. */
	public void update(String num, int price) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num))
				cars[i].setPrice(price);

		}

	}

	/** 파라메터로 전달된 번호의 차량을 삭제한다. */
	public void delete(String nume) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(nume))
				cars[i] = null;
			// --index;
		}

	}

	/** 배열에 저장된 차량 대수를 리턴한다. */
	public int size() {
		int cnt = 0;
		for (int j = 0; j < index; j++) {
			if (cars[j] != null)
				++cnt;
		}
		return cnt;
	}

	/** 배열에 저장된 차량의 금액 합계를 계산하여 리턴한다 */
	public int totalPrice() {
		int sum = 0;
		for (int i = 0; i <= index; i++) {

			if (cars[i] != null) {
				// System.out.println(sum);
				sum += cars[i].getPrice();
			}
		}
		return sum;
	}

}
