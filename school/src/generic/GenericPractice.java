package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Mountain{
	String name;
	int height;
	
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
}

public class GenericPractice {
	public static void main(String[] args) {
		HashSet<Double> set = new HashSet<Double>();
		set.add(2.4);
		set.add(new Double(5.6));
		//set.add(7); int형이라서 에러
		
		HashMap<String, Character> map = new HashMap<String, Character>();
		map.put("one", 'R');
		map.put("two", new Character('n'));
		System.out.println(map.get("one"));
		
		//오버라이딩
		Mountain m1 = new Mountain("한라산",1950);
		Mountain m2 = new Mountain("관악산",1500);
		Mountain m3 = new Mountain("북한산",1000);
		
		ArrayList<Mountain> item = new ArrayList<Mountain>();
		item.add(m3);
		item.add(m1);
		item.add(m2);
		System.out.println(item.add(m3));
		
		
		
	}

}
