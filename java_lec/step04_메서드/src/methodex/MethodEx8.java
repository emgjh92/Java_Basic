package methodex;

public class MethodEx8 {
	public static void view1() {
		System.out.println("static method");
		
	}
	public void view2() {
		//static 키워드가 빠진 method
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
		
		view1(); //클래스 메서드(class method) : 객체없이 호출 가능
		MethodEx8.view1(); // 요거로도 호출 가능
		//========> view1(); 처럼 자신의 메서드에 접근할때는 클래스 이름 생략 가능
		
		//클래스의 오브젝트는 인스턴스
					//교재 191p 참조 
		//클래스의 인스턴스가 오브젝트
		
		// view2(); ==> 오류발생
		MethodEx8 ob = new MethodEx8(); //객체생성
		ob.view2(); //인스턴스 메서드 (instance method)
		//반드시 객체를 생성하고 메서드를 호출해야 함

	}
}
