package hwjava05_서울_12반_김세은;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("################# TV- 초기 제품 정보 ###############");
		TV tv = new TV("123456", "samsung", 1000000, 258, 100, "8k");
		System.out.println(tv.toString());
		System.out.println();
		
		System.out.println("################# TV- 변경된 제품 정보###############");
		tv.setIsbn("999999");
		System.out.println(tv.toString());
		System.out.println();
		
		System.out.println("################# 냉장고 -초기 제품 정보###############");
		Refrigerator ref = new Refrigerator("223366", "samsam", 1000000, 300, "80L");
		System.out.println(ref.toString());
		System.out.println();
		
		System.out.println("################# 냉장고 -초기 제품 정보###############");
		ref.setRemain(10);
		System.out.println(ref.toString());
		System.out.println();
		
	}

}
