package construct;

public class MethodInitMain1 {
	public static void main(String[] args) {
		
		MemberInit member1 = new MemberInit();
		member1.name = "user1";
		member1.age = 15;
		member1.grade = 90;
		
		MemberInit member2 = new MemberInit();
		member1.name = "user2";
		member1.age = 16;
		member1.grade = 80;
		
		MemberInit[] mebers = {member1, member2};
		
		for(MemberInit s : mebers) {
			System.out.println("이름:" + s.name + "나이: " + s.age + "성적: " + s.grade);
		}
		
	}
}
