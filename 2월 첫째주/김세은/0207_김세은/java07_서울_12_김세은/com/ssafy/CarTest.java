package com.ssafy;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarMgr cc = CarMgr.getInstance();

		cc.add(new Car("34오0101", "티볼리", 3000));
		cc.add(new Car("32오1111", "렉스턴", 4500));
		cc.add(new Car("24오0221", "k5", 4000));
		cc.add(new Car("14오3301", "k7", 5000));
		cc.add(new Car("38오0551", "m4", 7000));
		cc.add(new Bus("38오0551", "삼화고속", 7000, 55));
		cc.add(new Truck("38오0551", "화물트럭", 9000, 5));
		// 전체 조회
		System.out.println("***************전체 차량 정보 조회**************");
		Car[] carlist = cc.search();
		for (int i = 0; i < carlist.length; i++) {
			if (carlist[i] == null)
				continue;
			System.out.println(carlist[i].toString());
		}
		System.out.println();
		// 차량 번호로 조회
		System.out.println("**************차량번호로조회**************");
		System.out.println(cc.search("34오0101").toString());
		System.out.println();
		// 지정된 가격보다 작은 차량 정보 검색
		System.out.println("**************지정된 가격보다 작은 차량 정보 검색**************");
		carlist = cc.search(4500);
		for (int i = 0; i < carlist.length; i++) {
			if (carlist[i] == null)
				continue;
			System.out.println(carlist[i].toString());
		}
		System.out.println();
		// 전달된 번호의 차량을 검색하여 가격을 수정

		System.out.println("**************전달된 번호의 차량을 검색하여 가격을 수정**************");
		carlist = cc.search();
		cc.update("38오0551", 2000);
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			System.out.println(carlist[j].toString());
		}
		System.out.println();
//전달된 번호의 차량을 삭제

		System.out.println("**************전달된 번호의 차량을 삭제하고 남은 리스트**************");
		cc.delete("32오1111");
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			System.out.println(carlist[j].toString());
		}
		System.out.println();
		System.out.println();
		// 저장된 차량 수
		System.out.println("**************저장된 차량 수**************");
		cc.size();
		int cnt = 0;
		for (int j = 0; j < carlist.length; j++) {
			if (carlist[j] == null)
				continue;
			++cnt;

		}
		System.out.println(cnt + "대");

		System.out.println();
		// 저장된 차량의 금액 합.
		System.out.println("**************저장된 차량의 금액 합**************");
		System.out.println(cc.totalPrice() + "만원");

	}

}
