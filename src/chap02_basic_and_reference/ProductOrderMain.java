package chap02_basic_and_reference;

public class ProductOrderMain {
    public static void main(String[] args) {
    /*문제: 상품 주문 시스템 개발 - 리팩토링
문제 설명
앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
class1.ex.ProductOrderMain
당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
 ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
상품명 ( productName )
가격 ( price )
주문 수량 ( quantity )

// 여러 상품의 주문 정보를 담는 배열 생성
 // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
 // printOrders()를 사용해서 상품 주문 정보 출력
*/
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " +
                    order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
