package shoppingmall;

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
	private Product[] item = new Product[10];	//다형성
	
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
		item[i++] = product;
		this.myMoney = this.myMoney - product.price;
		this.MyMileage = this.MyMileage - product.point;
		
	}

	
	public void display() {
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.MyMileage);
	}
}
