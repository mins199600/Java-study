package final1;

public class FinalLocalMain {
	
	public static void main(String[] args) {
		//final 지역변수
		final int data1;
		data1 = 10;	//최초 한번만 할당
		
		//final 지역변수2
		final int data2 = 8;
		//data2 = 20; 컴파일 오류
		
		method(10);
	}
	static void method(final int parameter) {
		//컴파일 오류 >> 메소드 내부에서 값을 변경할 수 없다.
	}

}
