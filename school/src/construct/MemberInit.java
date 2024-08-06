package construct;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	//추가
	 void initMember(String name, int age, int grade) {
		this.name = name;	//저 매개 변수로 받은 값
		this.age = age;
		this.grade = grade;
	}
}
