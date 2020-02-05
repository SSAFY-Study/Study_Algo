package hwjava05_서울_12반_김세은;

public class Refrigerator {
	String isbn;
	String name;
	int price;
	int remain;
	String size;
	
	Refrigerator(){
		this.isbn="";
		this.name="";
		this.price=0;
		this.remain=0;
		this.size="";
		
		
		
	}
	Refrigerator(String isbn,	String name,	int price,	int remain,	String size){
		this.isbn=isbn;
		this.name=name;
		this.price=price;
		this.remain=remain;
		this.size=size;
	}
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public String toString() {
		String str = (isbn+"\t|"+name+"\t|"+price+"\t|"+remain+"\t|"+size);
		return str;
	
	}
}
