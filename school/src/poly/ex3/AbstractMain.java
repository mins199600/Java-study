package poly.ex3;


public class AbstractMain {
	public static void main(String[] args) {
		
	}
	//변하지 않은 부분
		private static void soundAnimal(AbstractAnimal animal) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
		}
		
	//변하지 않은 부분
	private static void moveAnimal(AbstractAnimal animal) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종료");
		}	

}
