package Book;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리 프로그램");
		String[] arrTitle = new String[10];
		String[] arrAuthor = new String[10];
		int[] arrPrice = new int[10];
		
		int bookCount = 0;
		
		boolean run = true;
		
		while (true) {
			String title = "";
			String author = "";
			int price = 0;
			
			System.out.println("====================");
			System.out.println("메뉴를 선택하세요. 1:책등록, 2:책목록, 0:종료");
			System.out.println(">>");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			switch (menu) {
			case 1: {
				System.out.println("책을 등록하세요");
				System.out.println("제목");
				title = scanner.nextLine();
				System.out.println("저자");
				author = scanner.nextLine();
				System.out.println("가격:");
				price = scanner.nextInt();
				System.out.printf("제목 : %s, 저자: %s, 가격: %d%n%n", title, author, price);
				
				arrTitle[bookCount] = title;
				arrAuthor[bookCount] = author;
				arrPrice[bookCount] = price;
				bookCount++;
				break;
				
			}
			case 2:
			}
		}
	}
}
