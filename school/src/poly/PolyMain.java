package poly;

public class PolyMain {
	public static void main(String[] args) {
		//부모 변수가 부모 인스턴스 참조
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		//자식 변수가 자식 인스턴스 참조
		System.out.println("Child > child");
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		//부모 변수가 자식 인스턴스 참조
		System.out.println("P > ch");
		Parent poly = new Parent();
		poly.parentMethod();
	}
}