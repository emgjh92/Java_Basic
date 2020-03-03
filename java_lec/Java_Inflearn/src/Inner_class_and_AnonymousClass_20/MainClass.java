package Inner_class_and_AnonymousClass_20;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 내부 (inner) 클래스 : 클래스 안에 또 다른 클래스를 선언하는 것(두 클래스의 멤버에 쉽게 접근할 수 있다)
		 * ==> 내부 클래스는 요즘엔 잘 안씀 (코드가 너무 장황해져서)
		 * 익명 (anonymous) 클래스 : 이름이 없는 클래스로 주로 메서드를 재정의 하는 목적으로 사용된다
		 * ==> 쉽게 말해 일회성으로 한번 쓰고 버리는 것 
		 * ==> 예제코드에선 일회성으로 오버라이딩 해서 썼다.
		 * */
		OuterClass oc = new OuterClass();
		System.out.println("oc.num : " + oc.num);
		System.out.println("oc.str1 : " + oc.str1);
		
		System.out.println();
		
		// 멤버 inner 클래스
		OuterClass.InnerClass in = oc.new InnerClass();
		System.out.println("in.num : " + in.num);
		System.out.println("in.str2 : " + in.str2);
		
		System.out.println();
		
		// static inner 클래스
		OuterClass.SInnerClass si = new OuterClass.SInnerClass();
		System.out.println("si.num : " + si.num);
		System.out.println("si.str3 : " + si.str3);
		
		System.out.println();
		
		// 익명(anonymous) 클래스
		new AnonymousClass() {
			
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			};
		}.method();
	
	}

}
