package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import collection1.Book;

public class MapEx4 {
	public static void main(String[] args) {
		Book bk1=new Book("java","kim",100);
		Book bk2=new Book("oracle","lee",200);
		Book bk3=new Book("html","park",300);
	
		Map<String, Book> mapu=new HashMap<String,Book>();
		mapu.put(bk1.getTitle(), bk1);
		mapu.put(bk2.getTitle(), bk2);
		mapu.put(bk3.getTitle(), bk3);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("찾는 도서명을 입력 : ");
		String title=sc.next();
		
		if(mapu.get(title)==null) {
			System.out.println("찾는 도서가 없어요...");
			
		}else {
				System.out.println(mapu.get(title).getTitle());
				System.out.println(mapu.get(title).getAuthor());
				System.out.println(mapu.get(title).getPage());

		}
		sc.close();
	}
}
