package Super;

public class Child extends Parent{
	
	public String value = "child";
	
	@Override
	public void method2() {
		System.out.println("Child-method2");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

}
