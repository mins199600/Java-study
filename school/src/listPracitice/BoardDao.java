package listPracitice;

import java.util.*;

public class BoardDao {

	public List<Board> getBoardList() {
		//Board 객체의 리스트를 반환하는 메서드 정의
		List<Board> list = new ArrayList<Board>();
		//Board 객체를 저장할 ArrayList 생성

		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		return list;
	}


}
