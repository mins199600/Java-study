package array;

public class ArrayEx {
	
	public static void main(String[] args) {
		//int arr; 일반 선언
		int[] arr = new int[3]; //배열을 7개 까지 선언
			arr[0] = 10;	//쪼개진 일곱개 공간을 구분짓는 개념은 [0]이거임 = 인덱스 개념이라고 함
			arr[1] = 20;
			arr[2] = 30;
			System.out.println("arr[" + 0 + "] =" + arr[0]);
			arr[1] = 50;
			System.out.println("arr[" + 1 + "] =" + arr[1]);
			System.out.println("arr[" + 2 + "] =" + arr[2]);
			System.out.println(arr.length);
			
			for(int i = 0; i < 3; i++) {
				System.out.println("arr[" + i + "] =" + arr[i]);
			}
			
			int[] arr2 = {10, 20, 30};
			System.out.println("arr[" + 0 + "] =" + arr[0]);
			System.out.println("arr[" + 1 + "] =" + arr[1]);
			System.out.println("arr[" + 2 + "] =" + arr[2]);
			System.out.println(arr2.length);
			
			for(int i = 0; i < arr2.length; i++) {
				System.out.println("arr2[" + i + "] =" + arr2[i]);
			}
			
			String[] arr3 = new String[3];
			System.out.println("arr3[" + 0 + "] =" + arr3[0]);
			System.out.println("arr3[" + 1 + "] =" + arr3[1]);
			System.out.println("arr3[" + 2 + "] =" + arr3[2]);
			
			arr3[0] = "A";
			arr3[1] = "B";
			arr3[2] = "C";
			System.out.println("arr3[" + 0 + "] =" + arr3[0]);
			System.out.println("arr3[" + 1 + "] =" + arr3[1]);
			System.out.println("arr3[" + 2 + "] =" + arr3[2]);
			
			String[] arr4 = {"A", "B", "C"};
			System.out.println("arr4[" + 0 + "] =" + arr4[0]);
			System.out.println("arr4[" + 1 + "] =" + arr4[1]);
			System.out.println("arr4[" + 2 + "] =" + arr4[2]);
			}
	
	
		
}
