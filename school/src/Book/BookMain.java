package Book;

public class BookMain {
	public static void main(String[] args) {
		/*
		 * Book book = new Book(); book.displayInfo(0); book.displayInfo("Hello Java",
		 * "Seo"); book.displayInfo("JPA프로그래밍", "kim", 700);
		 */
		
		Book book = new Book();	//제목 : , 저자 : , 페이지 : 0
		book.displayInfo();
		System.out.println("===============================");
		Book book1 = new Book("Hello Java", "Seo");	//제목 : HEllo Java , 저자 : Seo	, 페이지 : 0
		book1.displayInfo();
		System.out.println("===============================");
		Book book2 = new Book("JPA 프로그래밍", "kim", 700);	//제목 : JPA 프로그래밍 , 저자 : kim , 페이지 : 700 
		book2.displayInfo();
		
	}

}
