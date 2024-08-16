package shoppingmall;

public class Buyer {
	public static void main(String[] args) {
		//상품 구매 및 반품 프로그램
		
		//1)상품 만들기
		//1-1) Product 클래스
		
		//2) 상품 진열
		SmartTV tv = new SmartTV();
		Notebook notebook = new Notebook();
		Handphone handphone = new Handphone();
		
		//3) 상품 구매하기
		//>> 바이어2 클래스
		
		Buyer2 kim = new Buyer2();
		kim.buy(tv);	//100
		kim.buy(notebook);	//200
		kim.buy(handphone);	//149
		
		//추가 구입
		kim.buy(notebook);
		kim.buy(notebook);
		kim.buy(notebook);
		kim.buy(notebook);
		kim.buy(notebook);
		
		
		kim.display();	//551 , 마일리지 44
		
	}

}
