package abstractEx;

public abstract class AbstractAnimal {
	//추상메소드 : 자식이 오버라이딩 해야할 목적으로 만듬
	public abstract void sound();
	
	//자식이 기능을 상속받아서 사용해야할 목적으로 만듬
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	//추상클래스가 된 이유 ? 추상 메소드가 하나라도 있기 때문에 추상 클래스가 되어야 한다
}
