package hwjava05_����_12��_�輼��;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("################# TV- �ʱ� ��ǰ ���� ###############");
		TV tv = new TV("123456", "samsung", 1000000, 258, 100, "8k");
		System.out.println(tv.toString());
		System.out.println();
		
		System.out.println("################# TV- ����� ��ǰ ����###############");
		tv.setIsbn("999999");
		System.out.println(tv.toString());
		System.out.println();
		
		System.out.println("################# ����� -�ʱ� ��ǰ ����###############");
		Refrigerator ref = new Refrigerator("223366", "samsam", 1000000, 300, "80L");
		System.out.println(ref.toString());
		System.out.println();
		
		System.out.println("################# ����� -�ʱ� ��ǰ ����###############");
		ref.setRemain(10);
		System.out.println(ref.toString());
		System.out.println();
		
	}

}
