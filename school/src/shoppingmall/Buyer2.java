package shoppingmall;

import java.util.ArrayList;

//상품 구매 관련 클래스
class Buyer2 {
	
	private int myMoney = 1000;//나의 총재산
	private int MyMileage = 0; //나의 마일리지 점수 >> 포인트 누적, 반품시 포인트 누적된 것 없어짐
	public int i = 0;
	
	/*
	 * 					Product
        +------------+-------------+-------------+--
        |  SmartTV   |   Notebook  |  HandPhone  |  ~~
        +------------+-------------+-------------+--
          item[0]       item[1]       item[2]      ~~
          
          */
	
	//상품을 구매했을때 어떤 상품을 구매했는지 저장(나의 구매 상품 목록)
	  private ArrayList<Product> item = new ArrayList<>();	//다형성
	
	public Buyer2() {}

	//물건 사기
	//메소드 오버로드(함수명 중복정의)
	/* public void buy(SmartTV smartTV) {}
	public void buy(Notebook notebook) {}
	public void buy(Handphone handphone) {} */
	
	
	//다형성 이용
	public void buy(Product product) {
		//Product -> Smart TV, Notebook, Handphone 의 부모클래스를 매개변수로 받는다
		//만약에 내가 가진 금액보다 많이 살 경우에
		/*if(this.myMoney < 0) {
			System.out.println("상품을 구매할수 없습니다");
		}else {
			this.myMoney = this.myMoney - product.price;		//나의 재산은 감소
			this.MyMileage = this.MyMileage + product.point;	//나의 마일리지는 증가
		}*/
		
		if (this.myMoney < product.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		 	item.add(product); // 구매한 상품 저장
	        this.myMoney -= product.price; // 나의 재산 감소
	        this.MyMileage += product.point; // 마일리지 증가
		
	}

	public void refund(Product product) {
        if (item.remove(product)) {
            this.myMoney += product.price; // 환불 시 돈 반환
            this.MyMileage -= product.point; // 마일리지 차감
        } else {
            System.out.println("환불할 상품이 존재하지 않습니다.");
        }
    }

    public Product getPurchasedItem(int index) {
        return item.get(index);
    }

    public int getPurchasedItemCount() {
        return item.size();
    }
    
	public void display() {
		//문제) kim이 구매한 상품 목록과 총 지출액을 출력해주세요
		
		//구매한 상품의 목록
		StringBuilder shoplist = new StringBuilder();
		
		//총 지출금액
		int hap = 0;
		
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.MyMileage);
		System.out.println("=================================================");
		System.out.println("<구매한 상품 목록>");
		
		//상품 목록 출력
		   for (Product product : item) {
	            shoplist.append(product.toString()).append("\n");
	            hap += product.price; // 각 상품의 가격을 더함
	        }
		 System.out.println(shoplist.toString());
		 System.out.println("총 지출금액 : " + hap);
	
	}
}
