package poly.practice;

public class Driver {
	
	private K3Car k3Car = null;
	
	public void setK3Car(K3Car k3Car) {
		this.k3Car = k3Car;
	}
	
	public void drive() {
		System.out.println("운전 시작");
		k3Car.start();
		k3Car.pressAccleator();
		k3Car.off();
	}
}
