package Extends;

public class CarMain {
	public static void main(String[] args) {
		ElectroicCar electroicCar = new ElectroicCar();
		electroicCar.move();
		electroicCar.charge();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}
