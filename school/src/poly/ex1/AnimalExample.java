package poly.ex1;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		//강아지 소리
		System.out.println("동물소리 테스트 시작");
		dog.sound();
		System.out.println("동물소리 테스트 종료");
		
		//고양이 소리
		System.out.println("동물소리 테스트 시작");
		cat.sound();
		System.out.println("동물소리 테스트 종료");
				
		//소 소리
		//sound(cow);
		
	}
	//클래스가 다 다른데 중복된 코드를 제거 하려면?
	/*private static void sound(Cow cow) {
		System.out.println("동물소리 테스트 시작");
		cow.sound();
		System.out.println("동물소리 테스트 종료");
	}*/
	//저렇게 하면 코드를 매번 추가해야함

}
