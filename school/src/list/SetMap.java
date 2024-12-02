package list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class SetMap {
	
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(3);
		set.add(2.4);
		set.add('R');
		set.add("Busan");
		set.add(new Integer(7));
		
		
		//System.out.println(set.size());
		//인덱스 전부 몇개인지 출력해줌 = 5
		
		Iterator cursor = set.iterator();
		//System.out.println(cursor.hasNext());
		
		while (cursor.hasNext()) {
			Object object = cursor.next();
			System.out.println(object.toString());
			
		}
	
		HashMap map = new HashMap();
		map.put("one", 3);
		map.put("two", 2.4);
		map.put("three", 'R');
		map.put("four", "손흥민");
		
		System.out.println(map.size());
		System.out.println(map.get("one"));
		System.out.println(map.get("four"));
		
		map.put("four", "박지성");
		System.out.println("four");	//박지성
		
		Properties db = new Properties();
		
		db.put("url", "http://localhost:1021");
		db.put("username", "greenIt");
		db.put("password", "123456");
		
		System.out.println(db.get("url"));
		System.out.println(db.get("username"));
		System.out.println(db.get("password"));
		
		
		//문제1) commmand 변수값에서 = 문자를 기준으로 문자열을 분리
		// key = value 로 구분하기
		
		HashSet<String> command = new HashSet();
		command.add("list.do=net.bbs.List");
		command.add("read.do=net.bbs.Read");
		command.add("write.do=net.bbs.Write");
		
		System.out.println(command.size());		//3	
		
		
		HashMap<String, String> hm = new HashMap<>();
		
		// command를 분리하여 HashMap에 저장
        for (String entry : command) {
            String[] parts = entry.split("=");
            if (parts.length == 2) {
                hm.put(parts[0], parts[1]);
            }
        }
        
        //결과 출력
        for (String key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
		
        }
	}

}
