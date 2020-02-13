package inheritance;
class ParentEx{
	public ParentEx() {
		System.out.println("parent class");
	}
	
}
class ChildEx extends ParentEx{
	public ChildEx() {
		super(); //생략가능
		System.out.println("child class");
	}
	
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx(); //1
	}
}
/*
 * this.변수
 * this.매서드()
 * this()
 * this(인자,인자,...) --------> 자기자신의 생성자 호출
 
 
 * super.변수
 * super.매서드()
 * super()
 * super(인자,인자,...) --------> 부모의 생성자 호출
 * 
 * */
 