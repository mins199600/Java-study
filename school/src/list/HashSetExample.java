package list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("Java");
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		//4
		System.out.println("==================================");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
			//Java JDBC Servlet/JSP ibatis
		}
		set.remove("JDBC");
		set.remove("iBatis");
		
		System.out.println("총 객체수 : " + set.size());
		//2개
		System.out.println("==================================");
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
			//Java , Servlet/JSP
			
		}
		System.out.println("==================================");
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
			//비어있음
		}
	}

}
