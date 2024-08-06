package school;

public class Practice {
	public static void main(String[] args) {
		//첫번째 문제
		char[] abc = new char[26];

		for (int i = 0; i < abc.length; i++) {
		    abc[i] = (char) (i + 65);
		}

		for (int i = 0; i < abc.length; i++) {
		    System.out.print(abc[i] + " ");
		    // 5개마다 줄바꿈
		    if ((i + 1) % 5 == 0) {
		        System.out.println();
		       
		    }
		   
		}
		
		System.out.println("=============================");
		
		
		//두번째 문제
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for(int j = 0; j < (5-i); j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("============================================");
	
		//세번째 문제
		 double sum = 0.0;

	        for (int i = 2; i <= 99; i++) {
	            sum += (double) i / 100;
	        }

	        System.out.println("1/2부터 99/100까지 더한 값: " + sum);	
	        
	        System.out.println("=========================================");
	
	        //네번째 문제
	        int i = 1;
	        int sum1 = 0;
	        
	        while (i<=10) {
				sum1 += i;
				i++;				
			}
	        System.out.println("1~10까지 더한 수: " +(double) sum1);
	
	        int i1 = 11;
			int sum2 = 0;
			while(i1 < 21) {
				sum2 += i1;
				i1++;
			}
			System.out.println("11~20까지 더한 수: " + (double) sum2);
			
			
			int i2 = 11;
			int sum3 = 0;
			while(i2 < 31) {
				sum3 += i2;
				i2++;
			}
			System.out.println("11~20까지 더한 수: " + (double) sum3);
	
			
			int i3 = 81;
			int sum4 = 0;
			while(i3 < 91) {
				sum4 += i3;
				i3++;
			}
			System.out.println("81~90까지 더한 수: " + (double) sum4);
			
			
			int i4 = 91;
			int sum5 = 0;
			while(i4 < 101) {
				sum5 += i4;
				i4++;
			}
			System.out.println("91~100까지 더한 수: " + (double) sum5);
			
			
			//네번째 문제
			int total = 13;
			double day = 3.0;
			double night = 2.5;
			//하루 올라간 높이
			double ClimbPerDay = day - night;
			
			 	int days = 0;
		        double currentHeight = 0;

		        while (currentHeight < total) {
		            days++; 
		            // 하루가 지남
		            currentHeight += day; 
		            // 낮에 올라감

		            if (currentHeight >= total) {
		                break; 
		                // 꼭대기에 도달했으면 루프 종료
		            }

		            currentHeight -= night; 
		            // 밤에 내려감
		        }

		        System.out.println("달팽이가 나무 꼭대기에 도달하는 데 걸리는 일수: " + days + "일");
		    }
		            
		
	}

