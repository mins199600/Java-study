package school;

public class Mission {
	
	public static void main(String[] args) {
		
		//구구단 출력하기 (배열사용)
		int[] dan = new int[2];
		dan[0] = 2;
		dan[1] = 3;
		int[] dan2 = {7,9};
			for(int i = 1; i < 9; i++) {
				System.out.println(dan[0] + "*" + i + "=" + (dan[0] * i));
			}
			for(int i = 1; i < 9; i++) {
				System.out.println(dan[1] + "*" + i + "=" + (dan[1] * i));
			}
			for(int i = 0; i < dan2.length; i++) {
				for(int j = 1; j < 9; j++) {
					System.out.println(dan2[i] + "*" + i + "=" + (dan[i] * j));
				}
			
			}
			for(int i = 0; i < dan2.length; i++) {
				for(int j = 1; j < 9; j++) {
				System.out.println(dan2[i] + "*" + j + "=" + (dan[i] * j));
				}
			}
		}

	}

