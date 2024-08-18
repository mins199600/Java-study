package Interface;

public class Cat implements InterfaceAnimal{

	@Override
	public void sound() {
		System.out.println("냐오오오옹");
		
	}

	@Override
	public void move() {
		System.out.println("슬쩍슬쩍");
	}
	
}
