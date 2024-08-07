package static2;

public class DecoData {
	
	private int instanceValue;
	private static int staticValue;
	
	public static void staticCall() {
		staticValue++;
		//정적 변수 접근
		staticMethod();
	}
	
	public void instanceCall() {
		instanceValue++;
	}
	
	
	private void instanceMethod() {
		System.out.println("instanceValue = " + instanceValue);
	}
	private static void staticMethod() {
		System.out.println("staticValue = " + staticValue);
	}
}
