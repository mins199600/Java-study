package Book;

public class Book {
	//필드
	String title;	//제목
	String author;	//저자
	int page;		//페이지
	
	public Book() {}
	
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public void displayInfo() {
		System.out.println("제목 : " + title + " , " + "저자 : " + author + " , " + "페이지 : " + page);
	}
}