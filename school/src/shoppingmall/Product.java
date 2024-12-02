package shoppingmall;

class Product extends Object{
	
	public int price;		//상품가격
	public int point;		//마일리지
	public int i = 0;
	

	/*
	 * 					Product
        +------------+-------------+-------------+--
        |  SmartTV   |   Notebook  |  HandPhone  |  ~~
        +------------+-------------+-------------+--
          item[0]       item[1]       item[2]      ~~
          
          */
	
	public Product() {}		//기본 생성자
	public Product(int price) {
		this.price = price;			//this.멤버변수 = 지역변수
		this.point = (int)(price * 0.1);		//상품가격의 10프로 보너스 점수 책정
	}
	
}

class SmartTV extends Product {
    public SmartTV() {
    	super(100);
    	//super.price = 100;
    	//super.point = (int)(100 * 0.1)
    }
    
    @Override
    public String toString() {
    	return "스마트TV";
    }
    
}

class Notebook extends Product {
    public Notebook() {
    	super(200);
    }
    
    @Override
    public String toString() {
    	
    	return "맥북 프로 14인치";
    }
}

class Handphone extends Product {
    public Handphone() {
    	super(150);
    }

    @Override
    public String toString() {
    
    	return "아이폰14";
    }
}