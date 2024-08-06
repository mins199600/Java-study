package array;

public class ArrayEx2 {
	
	public static void main(String[] args) {
		
		//다차원 배열
		int[][] arr = new int[2][2];
		arr[0][0] = 10;
		arr[0][0] = 10;
		arr[0][0] = 10;
		arr[0][0] = 10;
		System.out.println("arr[" + 0 + "][" + 0 + "] = " + arr[0][0]);
		System.out.println("arr[" + 0 + "][" + 1 + "] = " + arr[0][1]);
		System.out.println("arr[" + 1 + "][" + 0 + "] = " + arr[1][0]);
		System.out.println("arr[" + 1 + "][" + 1 + "] = " + arr[1][1]);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] =" + arr[i][j]);
			}
		}
		
		int[][] arr2 = {{10, 20}, {30, 40}};
		System.out.println("arr2[" + 0 + "][" + 0 + "] = " + arr2[0][0]);
		System.out.println("arr2[" + 0 + "][" + 1 + "] = " + arr2[0][1]);
		System.out.println("arr2[" + 1 + "][" + 0 + "] = " + arr2[1][0]);
		System.out.println("arr2[" + 1 + "][" + 1 + "] = " + arr2[1][1]);
	}

}
 