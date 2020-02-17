package instance;
class A{}
class B extends A{}
class C extends A{}
class D extends B{}

public class InstanceofEx1 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		D d=new D();
		//참조 변수가 참조하는 인스턴스의 실제 타입을 알아보기 위한 연산자
		
		System.out.println(b instanceof A);//true
		System.out.println(a instanceof C);//false
		System.out.println(d instanceof A);//true (D는 A의 손자)
		
//		System.out.println(b instanceof C); //error

	}

}
