package methodex;

public class MethodEx1 {
	
	public static void view() {
		System.out.println("hello");
		return; //생략가능 (void 타입일 경우에만 생략 가능)
	}//맴버 메소드
	//void = return 타입이 없다 란 의미
	
	public static void star() {
		System.out.println("********"); 
		return;
		
	}
	public static void main(String[] args) {
		view();
		star();
		view();
		star();	
	}
}
