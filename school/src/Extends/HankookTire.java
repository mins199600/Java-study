package Extends;

public class HankookTire extends Tire{
	private int accumlatedRotation;
	//필드
	
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumlatedRotation;
		if(accumlatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명: " + (maxRotation-accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire펑크***");
			return false;
		}
	}

}
