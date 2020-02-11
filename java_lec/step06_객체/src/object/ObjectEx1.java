package object;

/* 
 * https://hongjinhyeon.tistory.com/25 참조
 *  - (private)     + (public)    # (protected) // ===>접근지정자라 부른다
 * 
 *  클래스명 : Person
 *  +name:String
 *  +age:int
 *  +score:float
 *  +setPerson(name:String, a:int, s:float) : void
 *  +viewPerson():void
 *  
 */

class Person{
	public String name; //맴버(field) 변수 선언
	public int age;
	public float score;
	/*
	  	String name; 
		int age;
		float score;
		도 가능
	 * */
	public void setPerson(String name, int age, float score) {
		//맴버 함수 정의, method
		this.name=name; //this ==> 자신의 객체 꺼를 의미한다.
		this.age=age;
		this.score=score;
	}
	public void viewPerson() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("점수 : "+score);
	}
}

public class ObjectEx1 {
public static void main(String[] args) {
	
	Person ps=new Person(); // new Person : 힙 영역에 메모리를 할당하는 인스턴스
	ps.setPerson("홍길동", 23, 73.5f); //ps:객체 (필드와 메서드의 조합)
	ps.viewPerson();
	//System.out.println(ps.hashCode());

	ps=new Person();
	ps.setPerson("민들래", 25, 90.5f);
	ps.viewPerson();
	//System.out.println(ps.hashCode());
	
	}
}
