package exception;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];		//null
			String data2 = args[1];		//null
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다");
		}finally {
			System.out.println("다시 실행하세요");
		}
		//catch문 에 있는 실행 매개값의 수가 부족하다 라는 문구가 출력이 되면서 하위 catch블록은 실행이 되지 않음
		//그래서 finally 가 실행이 되면서 다시 실행하세요가 출력이 된다
	}
}
