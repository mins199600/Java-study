package school;

import java.util.Iterator;

public class Mission02 {
	public static void main(String[] args) {
		
		//구구단 출력 (중첩반복문의 대한 것 행렬로 분류해서 출력할 수 있게)
		//가로출력
		for(int i = 2; i < 10; i++) {	
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}
		//세로출력
		for(int i = 2; i < 10; i++) {	
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i,j, i * j);
			} 
			System.out.println("\n");
		}
		//보기) int[] array = { 1, 5, 3, 8, 2 }; 의 MAX 값을 구하시오
		int[] number = { 1, 5, 3, 8, 2 };
		int max = number[0];
		
		for(int i = 0; i < number.length; i++) {
			if(number[i] > max) {
				max = number[i];
			}
			System.out.println("max : " + max);
		}

		
		int[][]arr ={{95, 86}, {85, 92, 96}, {78, 83, 87, 88}}; //의 총합, 평균값을 구하시오
		
		//합의 계산
		int sum = 0;
		int count = 0;
		
		//평균 계산
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		double avg = (double)sum / count;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

		//연습문제
		//보기) String[] name = {"홍길동", "만득이"};
		//		int[][] arr3 = {{10, 20, 30}, {30, 40, 50}}
		
		//결과) 홍길동  : 	10점		20점		30점
		//	   만득이  : 	30점		40점		50점
		
		String[] name = {"홍길동", "만득이"};
		int[][] arr3 = {{10, 20, 30}, {30, 40, 50}};

		for (int i = 0; i < name.length; i++) {
		    System.out.print(name[i] + " : \t");
		    for (int j = 0; j < arr3[i].length; j++) {
		        System.out.print(arr3[i][j] + "점\t");
		    }
		    System.out.println();
		}

	
			
		/*	*
			**
			****
			******
			********
			**********
			*/
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
			}
		}
}
