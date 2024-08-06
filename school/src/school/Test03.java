package school;

public class Test03 {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			//1~5행까지 행이 증가할수록 별이 증가
			for(int j = 0; j < i;  j++) {
				System.out.println("*");
			}
			System.out.println();
			}
	}

}
