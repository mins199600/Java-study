package MapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.w3c.dom.Entity;

public class HashMapExample {
	public static void main(String[] args) {
		//맵 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	//키값이 같아서 마지막 저장된 값으로 덮어쓰기
		System.out.println("총 Entry 수 : " + map.size());
		//총 Entry 수 : 3
		
		//객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		//홍길동 , 95 출력
		
		//객체 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> ketIterator = keySet.iterator();
		while (ketIterator.hasNext()) {
			String key = ketIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
			// 홍길동 95 신용권 85 동장군 80
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		// 총 Entry 수 : 2
		
		//객체 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (ketIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
			//신용권 85 동장군 80 출력
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		//null >> 오답 왜냐면, 메소드를 호출한 후에 값이 0이기 때문에, 즉, 객체는 여전히 존재하지만 안에 값이 없기 때문에 0이 나옴
	}
}
