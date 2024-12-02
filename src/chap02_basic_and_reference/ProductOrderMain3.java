package chap02_basic_and_reference;

import java.util.Scanner;

public class ProductOrderMain3 {
    /*
    * 요구 사항
    아래 입력, 출력 예시를 참고해서 다음 사항을 적용하자.
    주문 수량을 입력 받자
    예) 입력할 주문의 개수를 입력하세요:
    가격, 수량, 상품명을 입력 받자
    입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요." 라는 메시지를 출력하세요.
    입력이 끝나면 등록한 상품과 총 결제 금액을 출력하자.
    *
    * ex)
    * 입력할 주문의 개수를 입력하세요: 3
        1번째 주문 정보를 입력하세요.
        상품명: 두부
        가격: 2000
        수량: 2
        2번째 주문 정보를 입력하세요.
        상품명: 김치
        가격: 5000
        수량: 1
        3번째 주문 정보를 입력하세요.
        상품명: 콜라
        가격: 1500
        수량: 2
        상품명: 두부, 가격: 2000, 수량: 2
        상품명: 김치, 가격: 5000, 수량: 1
        상품명: 콜라, 가격: 1500, 수량: 2
        총 결제 금액: 12000
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int num = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[num];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();

            System.out.print("수량: ");
            int quantity = sc.nextInt();

            sc.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = productName;
        order1.price = price;
        order1.quantity = quantity;
        return order1;
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
