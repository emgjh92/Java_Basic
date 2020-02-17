package finalex;


class A {
	
	final int n = 100;
	
	final public void view() {
		
//		n = 200; // final 로 선언한 이후 값을 변경할 수 없음
	System.out.println("A class");
	
	
	}
	
}

class B extends A {
	
//	@Override
//	public void view() { //final 메서드는 오버라이드 불가.
//		
//	}
	
	
}


public class FinalTest {

	public static void main(String[] args) {

	}

}
