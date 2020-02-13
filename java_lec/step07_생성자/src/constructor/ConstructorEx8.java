package constructor;

public class ConstructorEx8 {
	public static void main(String[] args) {
		Book bk1=new Book();
		bk1.setTitle("자바의정석");
		bk1.setAuthor("김자바");
		bk1.setPage(500);
		
		System.out.println(bk1.toString());
		
		Book bk2=new Book("jsp 일주일만 하면 전유성 만큼 한다","전유성",200);
		System.out.println("책이름 : "+bk2.getTitle());
		System.out.println("책저자 : "+bk2.getAuthor());
		System.out.println("페이지 : "+bk2.getPage());
		
	}
}
