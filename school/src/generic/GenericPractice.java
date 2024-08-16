package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
		System.out.println(item);
		
		//인덱스로 요소 접근 : 데이터 베이스가 몇개가 있는지 알때
		for(int i = 0; i<item.size(); i++) {
			item.get(i);
		}
		
		//커서로 요소 접근 : 외부에 있는 정보를 가져올때 사용, 데이터 베이스의 값이 몇개인지 모를때
		Iterator<Mountain> cursor = item.iterator();
		//mountain객체를 순회하기 위해 Iterator를 생성
		while (cursor.hasNext()) {
			//커서가 다음 요소가 있으면 루프 진행
			Mountain m = cursor.next();
			//커서 다음 요소를 변수 m에 저장
			System.out.println(m.name);
			System.out.println(m.height);
			
		}
		
		
	}

}
