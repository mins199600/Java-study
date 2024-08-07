package oop1;

public class RetangleProcedura {
	int width;
	int height;
	
	//넓이
	int calculateArea(int width, int height) {
		int result = width * height;
		System.out.println("넓이: " + result);
		return result;
	}
	//둘레
	int calculatePerimeter(int width, int height) {
		int result = 2*(width + height);
		System.out.println(result);
		return result;
	}
	
	//정사각형 여부
	boolean isSquare(int width, int height) {
		return this.width == this.height;
	}

}
