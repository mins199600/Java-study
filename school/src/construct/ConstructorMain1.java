package construct;

public class ConstructorMain1 {
	public static void main(String[] args) {
		MemberConstructor member1 = new MemberConstructor("dltnals", 24, 90);
		MemberConstructor member2 = new MemberConstructor("rlaanstn", 23, 100);
		
		MemberConstructor[] memberConstructors = {member1, member2};
		
		for(MemberConstructor members : memberConstructors) {
			System.out.println("이름: " + members.name + " 나이: " + members.age + " grade : " + members.grade);
		}
	}

}
