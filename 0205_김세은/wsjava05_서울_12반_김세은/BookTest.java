package wsjava05_����_12��_�輼��;


public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book();
		bk1.setIsbn("21424");
		bk1.setTitle("Java Pro");
		bk1.setAuthor("���ϳ�");
		bk1.setPublisher("Jaen.kr");
		bk1.setPrice(15000);
		bk1.setDesc("Java �⺻  ����");

		Book bk2 = new Book();
		bk2.setIsbn("35355");
		bk2.setTitle("�м�����    ");
		bk2.setAuthor("�ҳ���");
		bk2.setPublisher("Jaen.kr");
		bk2.setPrice(30000);
		bk2.setDesc("SW �𵨸�");

		Magazine mg = new Magazine();
		mg.setIsbn("35335");
		mg.setTitle("Java World");
		mg.setAuthor("������");
		mg.setPublisher("Java.com");
		mg.setPrice(7000);
		mg.setDesc("ù����");
		mg.setYear(2018);
		mg.setMonth(2);

		System.out.println("***************�������***************");
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());

		System.out.println(mg.toString());

	}

}
