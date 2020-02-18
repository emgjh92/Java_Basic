package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1234
 * 
 * pororo님이 입장하셨습니다.
 * 현재 포인트는 89.97점 입니다.
 * 
 * [[BOOK의 정보보기]]
 * 책이름 : JAVA	책저자 : kim 페이지 : 100
 * 책이름 : orcle	책저자 : lee 페이지 : 200
 * 책이름 : html	책저자 : park 페이지 : 300
 * 
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1235
 * 
 * ID또는 PW가 틀리거나 존재하지 않는 ID입니다.
 * 
 */

public class UserMain {
public static void main(String[] args) {
	String id;
	String pw;
	
	//입력처리
	System.out.println("ID를 입력하세요 : ");
	Scanner sc=new Scanner(System.in);
	id=sc.next();
	System.out.println("PW를 입력하세요 : ");
	pw=sc.next();
	
	//입력값에 대한 검사
	UserProc up = new UserProc();
	User entity = up.getLoginUser(id,pw);
	
	//결과출력
	if(entity!=null) {
	//데이터가 있는 경우	
		System.out.println(entity.getName()+"님이 입장하셨습니다.");
		System.out.println("현재 포인트는"+entity.getPoint()+"점 입니다.");
		
		
		BookProc book=new BookProc();
		ArrayList<Book> list= book.getList();
		
		System.out.println("[[BOOK의 정보보기]]");
		for(Book ob:list) {
			System.out.print("책이름 : "+ob.getTitle()+"\t");
			System.out.print("책저자 : "+ob.getAuthor()+"\t");
			System.out.println("페이지 : "+ob.getPage());
			}
		
		}else { //데이터가 없는 경우
			System.out.println("ID또는 PW가 틀리거나 존재하지 않는 ID입니다.");
		}
	}
}
