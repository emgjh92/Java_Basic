package abstract_추상화1_22;

public class ClassEx extends AbstractClassEx {

	public ClassEx() {
		System.out.println("ClassEx constructor");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}
	
	@Override
	public void fun2() {
		System.out.println(" -- fun2() START -- ");
	} // 클래스 상속과 마찬가지로 extends 키워드를 이용해서 상속하고 abstract(추상) 메서드를 구현한다

}
