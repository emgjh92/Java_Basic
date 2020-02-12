package constructor;
// 생성자 : 클래스이름과 동일한 메서드의 형태, 리턴자료형이 없음
//        객체 생성 담당, 생성자를 만들지 않을 경우 디폴트 생성자가 자동 생성 호출

public class ConstructorEx1 {
	public ConstructorEx1() { //혹은 그냥 ConstructorEx1() {} 로 public 빼고 만들수도 있음
		System.out.println("default constructor");
		return;
	}	
	public ConstructorEx1(String str) { //매계변수 하나짜리 생성자
		System.out.println(str+" constructor");
	}
	public ConstructorEx1(String str,int n) { //매계변수 하나짜리 생성자
		System.out.println(str+" "+n+" constructor");
	}
	//결국 생성자도 함수의 하나 이므로 Overloading이 가능하다
	
	
	
	
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1("가나다");
		new ConstructorEx1("가나다",10);
	}

}
