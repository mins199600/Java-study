package poly.ex2;

public class AnimalMainExample {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Rabbit rabbit = new Rabbit();
		Duck duck = new Duck();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(rabbit);
		soundAnimal(duck);
	}
	private static void soundAnimal(Animal animal) {
		System.out.println("동물소리 테스트 시작");
		animal.sound();
		System.out.println("동물소리 테스트 종료");
	}

}
