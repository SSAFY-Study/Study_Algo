package hwjava05_서울_12반_김세은;

public class TV {
	String isbn;
	String name;
	int price;
	int remain;
	int inch;
	String display;

	TV() {
		this.isbn = "";
		this.name = "";
		this.price = 0;
		this.remain = 0;
		this.inch = 0;
		this.display = "";

	}

	TV(String isbn, String name, int price, int remain, int inch, String display) {
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.remain = remain;
		this.inch = inch;
		this.display = display;
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String toString() {
		String str = (isbn + "\t|" + name + "\t|" + price + "\t|" + remain + "\t|" + inch + "\t|" + display);
		return str;
	}

}
