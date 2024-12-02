package list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));	//0
		list.add(new Board("제목2", "내용2", "글쓴이2"));	//1
		list.add(new Board("제목3", "내용3", "글쓴이3"));	//2
		list.add(new Board("제목4", "내용4", "글쓴이4"));	//3
		list.add(new Board("제목5", "내용5", "글쓴이5"));	//4
		//Board 객체를 저장
		
		list.remove(2);	//2번 삭제
		list.remove(3);	//4번 삭제 >> 2번이 삭제 되면서 4번이 > 3번으로 위치가 바뀜
		
		for(int i = 0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
			//인덱스 0번 1 , 3번 출력 제목1 제목 2 제목 4 출력
			
		}
	}


}
