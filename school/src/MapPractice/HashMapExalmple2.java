package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapExalmple2 {
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student,Integer>();
		
			map.put(new Student(1, "김문수"), 100);
			map.put(new Student(1, "김문수"), 100);
			
			System.out.println("총 Entry 수 : " + map.size());
			//1개 
	}

}
