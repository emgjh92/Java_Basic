/*
package inheritance;
//inheritance(상속)

class SuperEx{
	public void show1() {
		System.out.println("show1 method");
	}
} //부모 클래스

class SubEx extends SuperEx{
	public void show2() {
		System.out.println("show2 method");
	}
} //자식 클래스 //부모의 자원을 마음대로 사용 할 수 있다.

public class InheritanceEx1 {
	
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show1();
		ob.show2();
	}
}
*/
package inheritance;
//inheritance(상속)

class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
} //부모 클래스

class SubEx extends SuperEx{
	@Override //(오버라이드 된 메소드임을 알려주는 것)
	public void show() {
		super.show(); //부모 클래스의 메소드 우선 호출
		System.out.println("show2 method");
	}
} //자식 클래스 //부모의 자원을 마음대로 사용 할 수 있다.

public class InheritanceEx1 {
	
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show();
		ob.show();
	}
}
/*
 * 결과값 :
	show1 method
	show2 method
	show1 method
	show2 method
 * */
