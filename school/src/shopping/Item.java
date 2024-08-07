package shopping;

public class Item {
	String name;
	int price;
	int quantity;
	
	//기본생성자 : 객체를 생성할때 초기값을 생성하지 않고도 객체를 만들수 있다
	public Item() {}
	
	public Item(String name, int price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
	}

}
