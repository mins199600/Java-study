package school;

public class Test04 {
	public static void main(String[] args) {
		int[][] dan = new int[9][9];
		for(int i=0; i<dan.length; i++) {
		    for(int j=0; j<dan.length; j++) {
		        dan[i][j] = (i+1) * (j+1);
		    }
		}

		for(int i=2; i<dan.length; i++) {
		    for(int j=1; j<dan.length; j++) {
		        System.out.println(i + "*" + j + "=" + dan[i][j]);
		    }
		}

	}

}
