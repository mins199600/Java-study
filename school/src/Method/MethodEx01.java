package Method;

import java.lang.reflect.Method;
import java.util.Iterator;
import javax.sql.rowset.JoinRowSet;

public class MethodEx01 {
	public static void main(String[] args) {
		
		/*메소드 두가지로 나눠짐*/
		
		/* 기타 제어자
		 * [접근 제어자] [수정자] [반환형 = 반환타입] 메소드명(인자들){
		 * 		실행구문;
		 * }
		 * 
		 * 반환형 : 자바 데이터 자료형 전부 사용가능
		 * void : 반환형이 없는 메소드 정의시 사용 = 반환 없이 그대로 끝남
		 * 메소드명 : 식별자로 임의의 이름 정의
		 * 인자 = 파라미터 = arguments : 매개변수, 전달값 이라고도 함 메소드 호출시 데이터 전달을 위해 사용 >> 받는 기준에서 받는 이름을 결정해서 불러주면 됨
		 * 인자 : 함수 호출시 실제로 사용되는 값
		 * 파라미터 : 함수 호출시 전달되는 값을 저장하는 변수
		 * arguments : 함수 호출시 사용되는 값을 전부 포함*/
		
		
		/*표현
		 * 
		 * 
		 * 표현1)
		 * public int intA(){
		 * 		구현;
		 * 		return n; 	>> 자료형에 맞게 데이터를 전달할 수 있다.
		 * }
		 * 
		 * 
		 * public void intB(int a, int b, int c, String s ... ){
		 * 		구현;
		 * 		return 구문은 사용하지 않음
		 *
		 *}
		 **/
		MethodEx01 methodEx01 = new MethodEx01();
		//int result = methodEx01.a();
		//System.out.println(result);
		//methodEx01.intB(result);
		methodEx01.intB(0,"수민");
		//구구단을 출력하시오
		methodEx01.gugudan();
		//1~100까지 합을 구하는 함수를 정의하고 결과를 받아 출력하시오
		methodEx01.add();
		methodEx01.add(3, 3);
		methodEx01.min(5, 3);
		
		
	}
	int a() {
		return 10;
	}

	void intB(int a, String b) {
		System.out.println("실행 : " + a);
		System.out.println("이수민");
	}
	public int gugudan() {
		int result = 0;
		for(int i = 2; i < 10; i++) {	
			for(int j = 1; j < 10; j++) {
				 System.out.println(i + " x " + j + " = " + (i*j));
		            result += (i*j); //result 변수에 더하면서 대입한다.
			}
		}
		return result;
	}
	public void add() {
			int i = 1;
			int sum = 0;
			for(i = 1; i < 101; i++) {
				sum += i;
			}
			System.out.println("1 ~ 100까지 합 : "+ sum);
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
			
	}
	public int min(int a, int b) {
		int result = a - b;
		System.out.println(result);
		return result;
 	}
	
}

