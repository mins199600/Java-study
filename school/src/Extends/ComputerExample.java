package Extends;

public class ComputerExample {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		Sumin sumin = new Sumin();
		
		int r = 10;
		int c = 50;
		
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println("원 면적 : " + computer.areaCircle(r));
		System.out.println("수민의 면적 : " + sumin.areaCircle(c));
	}

}
