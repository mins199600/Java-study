package poly.ex3;

public class Cat extends AbstractAnimal{
	
	@Override
	public void sound() {
		System.out.println("냥냥");
	}

	@Override
	public void move() {
		System.out.println("초코랑 움직이다가 냥냥펀치!!");
		
	}
	
}
