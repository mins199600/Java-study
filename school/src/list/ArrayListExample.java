package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");	//0
		list.add("JDBC");	//1
		list.add("Servlet/JSP");	//2
		list.add(2, "DataBase");	//3
		list.add("iBATIS");	//4
		
		int size = list.size();
		System.out.println("총 객체수: " + size);	//사이즈니까 5라고 출력되고, 인덱스 번호만 출력된다
		System.out.println();	//개행
		
		String skill = list.get(2);	//키 값으로 2를 가지고 있는 데이터 베이스를 출력한다. 
		System.out.println("2: " + skill);	//2 : 데이터베이스 출력
		System.out.println();	//개행
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			//리스트 크기를 출력하니까 1: 자바 이런식으로 총 5개의 객체를 출력한다.
		}
		System.out.println();
		//개행
		list.remove(2);	//서블릿 제이에스피 삭제
		list.remove(2);	//2번 데이터 베이스 삭제
		list.remove("iBATIS");	//아이바티스 삭제
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
			//자바 제이디비씨 출력
		}
	}

}
