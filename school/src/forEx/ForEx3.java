package forEx;

public class ForEx3 {
		public static void main(String[] args) {
			int dan = Integer.parseInt(args[0]);			//매퍼클래스
			System.out.println("args[0] = " + args[0] + 3); //결합 연산자로 된다. 논리적 오류가 생김.
			System.out.println("args[0] = " + (dan + 3));	//우선연산 안하면 결합연산이 진행되어서 우선연선이 가능하게 한다
			System.out.println("args[1] = " + args[1]);
			System.out.println("args[2] = " + args[2]);
			
			for(int i = 0; i < args.length; i++) {
				System.out.println("args[" + i  + "] = " + args[i]);
			}
			
			for(String str : args) {
				System.out.println(str);
			} 
	}

}
