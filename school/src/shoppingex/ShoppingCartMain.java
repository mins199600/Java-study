package shoppingex;

import shopping.Item;
import shopping.ShoppingCart;

public class ShoppingCartMain {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("사과",1000,1);
		cart.addItem(item1);
		
		Item item2 = new Item("바나나",9000,1);
		cart.addItem(item2);
		
		 cart.printItems(); // 아이템 목록 및 총 금액 출력
		
	}
	

}
