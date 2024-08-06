package school;

public class Calculator {
	
	void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public int min(int a, int b) {
		int result = a - b;
		System.out.println(result);
		return result;
	}
	void mult(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	public void div(int a, int b) {
		int result = a / b;
		System.out.println(result);
	}
}
