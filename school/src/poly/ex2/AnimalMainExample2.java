package poly.ex2;

public class AnimalMainExample2 {
	public static void main(String[] args) {
		//1. 배열로 만들기 
		Animal[] animals = {new Dog(), new Cat(), new Rabbit(), new Duck()};
		//변하지 않은 부분
		for(Animal animal : animals) {
			soundAnimal(animal);
		}
	}
	//변하지 않은 부분
	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}

}
