package ProductOrder;

import java.util.Iterator;

public class ProductOrderMain {
	
	public static void main(String[] args) {
	//	PrductOrder[] prductOrders = new PrductOrder[3];
		
/*		PrductOrder oliplx = new PrductOrder();
		oliplx.productName = "올라플렉스";
		oliplx.price = 45000;
		oliplx.quentity = 1;
		
		System.out.println("상품명 : " + oliplx.productName + " 가격: " + oliplx.price + " 주문수량: " + oliplx.quentity);
	}*/
	
/*
 * //첫번째 상품 주문정보 입력 PrductOrder oliplx = new PrductOrder(); oliplx.productName =
 * "올라플렉스"; oliplx.price = 45000; oliplx.quentity = 1; prductOrders[0] = oliplx;
 * 
 * //두번째 상품 주문정보 입력 PrductOrder sunStick = new PrductOrder();
 * sunStick.productName = "노세범썬스틱"; sunStick.price = 11000; sunStick.quentity =
 * 1; prductOrders[1] = sunStick;
 * 
 * //세번째 상품 주문정보 입력 PrductOrder watch = new PrductOrder(); watch.productName =
 * "카시오"; watch.price = 17000; watch.quentity = 1; prductOrders[2] = watch;
 * 
 * int total = 0; for(PrductOrder prductOrder : prductOrders) {
 * System.out.println("상품명: " + prductOrder.productName + " 가격: " +
 * prductOrder.price + " 주문수량: " + prductOrder.quentity ); total +=
 * prductOrder.price * prductOrder.quentity; } System.out.println("총 금액: " +
 * total);
 */
		
		
	
	
/*
 * PrductOrder[] orders = new PrductOrder[3];
 * 
 * PrductOrder order1 = new PrductOrder(); 
 * order1.productName = "헤어오일";
 * order1.price = 45000; 
 * order1.quentity = 2; orders[0] = order1;
 * 
 * PrductOrder order2 = new PrductOrder(); order2.productName = "탄산수";
 * order2.price = 1800; order2.quentity = 20; orders[1] = order2;
 * 
 * PrductOrder order3 = new PrductOrder(); order3.productName = "에어팟 케이스";
 * order3.price = 19900; order3.quentity = 2; orders[2] = order3;
 * 
 * int total = 0; for(PrductOrder order : orders) { System.out.println("상품명 : "
 * + order.productName + " 가격 : " + order.price + " 주문수량 : " + order.quentity);
 * total += order.price * order.quentity; } System.out.println("총 금액 : " +
 * total);
 */
	PrductOrder[] orders = new PrductOrder[3];
		
	PrductOrder water = new PrductOrder();
	water.productName = "탄산수";
	water.price = 1900;
	water.quentity = 20;
	orders[0] = water;
	
	PrductOrder candy = new PrductOrder();
	candy.productName = "민티";
	candy.price = 3500;
	candy.quentity = 23;
	orders[1] = candy;
	
	PrductOrder cream = new PrductOrder();
	cream.productName = "킁카킁카";
	cream.price = 5000;
	cream.quentity = 1;
	orders[2] = cream;
	
	int total = 0;
//	for("타입" "변수명" : "컬렉션 또는 배열") {
//	  변수명.... 	
//	}
	for(PrductOrder shop: orders) {
		System.out.println(shop.productName);
	}
	
	for(PrductOrder order : orders) {
		System.out.println("상품명: " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quentity);
		 total += order.price * order.quentity;	
	}
	System.out.println("총금액 : " + total);
	}
}
