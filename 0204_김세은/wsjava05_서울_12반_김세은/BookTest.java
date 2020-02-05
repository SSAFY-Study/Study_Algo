package wsjava05_서울_12반_김세은;


public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book();
		bk1.setIsbn("21424");
		bk1.setTitle("Java Pro");
		bk1.setAuthor("김하나");
		bk1.setPublisher("Jaen.kr");
		bk1.setPrice(15000);
		bk1.setDesc("Java 기본  문법");

		Book bk2 = new Book();
		bk2.setIsbn("35355");
		bk2.setTitle("분석설계    ");
		bk2.setAuthor("소나무");
		bk2.setPublisher("Jaen.kr");
		bk2.setPrice(30000);
		bk2.setDesc("SW 모델링");

		Magazine mg = new Magazine();
		mg.setIsbn("35335");
		mg.setTitle("Java World");
		mg.setAuthor("편집부");
		mg.setPublisher("Java.com");
		mg.setPrice(7000);
		mg.setDesc("첫걸음");
		mg.setYear(2018);
		mg.setMonth(2);

		System.out.println("***************도서목록***************");
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());

		System.out.println(mg.toString());

	}

}
