package abstractEx;



public class AbstractMain {
	public static void main(String[] args) {
		chick chick = new chick();
		chicken chicken = new chicken();
		
		
		chick.sound();
		chick.move();
		
		soundAnimal(chicken);
		soundAnimal(chick);
	}
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 테스트 종료");
	}

}
