package Extends;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		//부모 클래스의 생성자를 호출하는 메소드인 super 가 없으면 
		//부모의 기본생성자가 없으니 다른 생성자를 명시적으로 호출하라는 오류가 나옴
		this.studentNo = studentNo;
	}

}
