package shoppingmall;

//상품을 중복해서 구매하지 않았다는 전제하 반품
public class Refund {
	private Buyer2 buyer;

    public Refund(Buyer2 buyer) {
        this.buyer = buyer;
    }

    public void processRefund(int productIndex) {
        if (productIndex < 0 || productIndex >= buyer.getPurchasedItemCount()) {
            System.out.println("유효하지 않은 상품 인덱스입니다.");
            return;
        }

        Product productToRefund = buyer.getPurchasedItem(productIndex);
        buyer.refund(productToRefund);
        System.out.println(productToRefund.toString() + " 환불 완료!");
    }
}


