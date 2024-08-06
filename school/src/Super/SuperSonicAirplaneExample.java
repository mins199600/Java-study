package Super;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SuperSonicAirplane sc = new SuperSonicAirplane();
		sc.takeOff();
		sc.fly();
		sc.flyMode = SuperSonicAirplane.SUPERSONIC;
		sc.fly();
		sc.flyMode = SuperSonicAirplane.NOMAL;
		sc.fly();
		sc.land();
		
		
	}

}
