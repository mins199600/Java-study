package shopping;

import java.util.Iterator;

public class ShoppingCart {
	
	private Item[] items = new Item[10];
	private int itemCount = 0;	//현재 아이템 수
	
	/*
	 * for(int i = 0; i.intArray.lenght; i++) { if(intArray[i]>max) { max =
	 * intarray(i); } }
	 * 
	 * System.out.println("최대 10개 까지만 담을 수 있습니다");
	 * 
	 * }
	 */
	
	//아이템 추가 메소드
	public void addItem(Item item) {
		if(itemCount < 10) {
			//현재 아이템수가 10보다 작은지 확인하고 10보다 작으면 아이템 추가
			items[itemCount++] = item;
		}else {
			System.out.println("최대 10개까지만 담을 수 있습니다");
		}
	}
	
	 // 총 금액 계산 메서드
    public int getTotalPrice() {
        int total = 0;	//총 금액 초기화
        for (int i = 0; i < itemCount; i++) {
        	//카트에 담긴 모든 아이템의 가격을 합산
            total += items[i].price * items[i].quantity;
            //각 아이템의 가격 * 수량
        }
        return total;
        //총 금액 반환
    }
	
	//아이템 목록 출력 메소드
	public void printItems() {
		System.out.println("구매한 아이템: ");
		for(int i = 0; i< itemCount; i++) {
			//카드에 담긴 정보 출력
			System.out.println(items[i].name + " : " + items[i].price + "원, 수량:" + items[i].quantity);
		}
		System.out.println("총 금액 : " + getTotalPrice() + "원");
	}
}
