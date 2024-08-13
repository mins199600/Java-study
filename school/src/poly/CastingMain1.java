package poly;

public class CastingMain1 {
	
	public static void main(String[] args) {
		//부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child();
		//단 자식의 기능은 호출 할수 없다
		//poly.childMethod();
		
		//다운 캐스팅
		//Child child = (Child)poly;
		//child.childMethod();
		
		//일시적 다운 캐스팅 - 해당 메소드를 호출하는 순간만 다운캐스팅
		//1.poly.childMethod();
		((Child) poly).childMethod();
	}

}
