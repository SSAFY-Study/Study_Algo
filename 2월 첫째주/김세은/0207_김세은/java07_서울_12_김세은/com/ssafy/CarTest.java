package com.ssafy;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarMgr cc = CarMgr.getInstance();

		cc.add(new Car("34��0101", "Ƽ����", 3000));
		cc.add(new Car("32��1111", "������", 4500));
		cc.add(new Car("24��0221", "k5", 4000));
		cc.add(new Car("14��3301", "k7", 5000));
		cc.add(new Car("38��0551", "m4", 7000));
		cc.add(new Bus("38��0551", "��ȭ���", 7000, 55));
		cc.add(new Truck("38��0551", "ȭ��Ʈ��", 9000, 5));
		// ��ü ��ȸ
		System.out.println("***************��ü ���� ���� ��ȸ**************");
		Car[] carlist = cc.search();
		for (int i = 0; i < carlist.length; i++) {
			if (carlist[i] == null)
				continue;
			System.out.println(carlist[i].toString());
		}
		System.out.println();
		// ���� ��ȣ�� ��ȸ
		System.out.println("**************������ȣ����ȸ**************");
		System.out.println(cc.search("34��0101").toString());
		System.out.println();
		// ������ ���ݺ��� ���� ���� ���� �˻�
		System.out.println("**************������ ���ݺ��� ���� ���� ���� �˻�**************");
		carlist = cc.search(4500);
		for (int i = 0; i < carlist.length; i++) {
			if (carlist[i] == null)
				continue;
			System.out.println(carlist[i].toString());
		}
		System.out.println();
		// ���޵� ��ȣ�� ������ �˻��Ͽ� ������ ����

		System.out.println("**************���޵� ��ȣ�� ������ �˻��Ͽ� ������ ����**************");
		carlist = cc.search();
		cc.update("38��0551", 2000);
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			System.out.println(carlist[j].toString());
		}
		System.out.println();
//���޵� ��ȣ�� ������ ����

		System.out.println("**************���޵� ��ȣ�� ������ �����ϰ� ���� ����Ʈ**************");
		cc.delete("32��1111");
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			System.out.println(carlist[j].toString());
		}
		System.out.println();
		System.out.println();
		// ����� ���� ��
		System.out.println("**************����� ���� ��**************");
		cc.size();
		int cnt = 0;
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			++cnt;

		}
		System.out.println(cnt + "��");

		System.out.println();
		// ����� ������ �ݾ� ��.
		System.out.println("**************����� ������ �ݾ� ��**************");
		System.out.println(cc.totalPrice() + "����");

	}

}
