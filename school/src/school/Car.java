package school;

public class Car {
	private int maxSpeed;
	
	public Car(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void MaxSpeed() {
		if(maxSpeed > 200) {
			System.out.println("최대 속력 입니다");
		}else {
			System.out.println("멈춥니다.");
		}
	}
}
