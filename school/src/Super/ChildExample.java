package Super;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		//자동타입변환
		parent.method1();
		parent.method2();
	}

}
