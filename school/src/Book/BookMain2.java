package Book;

public class BookMain2 {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println(book.author); //null
		System.out.println(book.page); //0
		System.out.println(book.title);//null
		
		Book book1 = new Book(33);
		System.out.println(book1.author); //null
		System.out.println(book1.page); //33
		System.out.println(book1.title);//null
		
		System.out.println("=========================================");
		Book book3 = new Book("이수민", 500, "원피스");
		System.out.println(book3.author); //이수민
		System.out.println(book3.page); //500
		System.out.println(book3.title);//원피스
	}
}
