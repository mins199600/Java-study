package MapPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		//평균점수 : 91
		//최고점수 : 96
		//최고 점수 받은 아이디 : blue
		
		int sum = 0;
		for(int value: map.values()) {
			sum += value;
		}
		int avg = sum/map.size();
		System.out.println("평균점수 : " + avg);
	
		Integer maxValue = Collections.max(map.values());
		System.out.println("최고점수 : " + maxValue);
	
		List<String> keyList = new ArrayList<>(); // keyList 초기화
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                keyList.add(entry.getKey());
            }
        }
        
        // 최고 점수 받은 아이디 출력
        System.out.println("최고 점수 받은 아이디 : " + String.join(", ", keyList));
    }
}
				
		
		
	


