package com.ssafy;

public class CarMgr {
	/** ���������� �����ϴ� �迭 */
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

	/** �Ķ���ͷ� ���޵� ���� ������ �迭�� �����Ѵ� */
	public void add(Car c) {
		cars[index++] = c;
	}

	/** ���� ����� ��� ���� ������ �����Ѵ� */
	public Car[] search() {

		return cars;

	}

	/** �Ķ���ͷ� ���޵� ��ȣ�� ���� ���� ������ �����Ѵ� */
	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num))
				return cars[i];
		}
		return null;
	}

	/** �Ķ���ͷ� ���޵� ���ݺ��� ���� ���� �������� �����Ѵ� */
	public Car[] search(int price) {
		Car[] temp = new Car[100];
		for (int i = 0; i < index; i++) {
			if (cars[i].getPrice() < price) {
				temp[i] = cars[i];

			}

		}
		return temp;

	}

	/** �Ķ���ͷ� ���޵� ��ȣ�� ������ �˻��Ͽ� ������ �����Ѵ�. */
	public void update(String num, int price) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(num))
				cars[i].setPrice(price);

		}

	}

	/** �Ķ���ͷ� ���޵� ��ȣ�� ������ �����Ѵ�. */
	public void delete(String nume) {
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum().equals(nume))
				cars[i] = null;
			// --index;
		}

	}

	/** �迭�� ����� ���� ����� �����Ѵ�. */
	public int size() {
		int cnt = 0;
		for (int j = 0; j < index; j++) {
			if (cars[j] != null)
				++cnt;
		}
		return cnt;
	}

	/** �迭�� ����� ������ �ݾ� �հ踦 ����Ͽ� �����Ѵ� */
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
