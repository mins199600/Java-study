package poly.practice;

public class CarMain0 {
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		K3Car kCar = new K3Car();
		
		driver.setK3Car(kCar);
		driver.drive();
	}

}
