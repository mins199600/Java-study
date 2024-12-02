package exception;

public class CatchByExceptionKindExample {
	
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다");
		} finally {
			System.out.println("다시 실행하세요");
		}
	
		//data1 과 data2의 값이 없기 때문에 실행 매개값의 수가 부족하다 라는 것이 출력
	}

}
