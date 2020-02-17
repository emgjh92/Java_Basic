package interfaceex;
/* class 와 interface 를 이용하여 성적처리
 * 클래스 : User
 * -name : String
 * +User()
 * +User(name: String)
 * +toString(): String
 * 
 * 인터페이스 Score
 * +sol:int (초기값 : 20) <-- 점수 // 배점
 * +getScore():int  //맞은 수 * sol 을 리턴
 * 
 * *인터페이스 Print
 * +toPaint() : String //
 * 
 * --출력화면
 * 이름 : 홍길동
 * 점수 : 60점
 */

class User{
	
	private String name;

	public User() {

	}
	
	public User(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "이름 : " + name;
	}

}

interface Score {
	
	public int sol=20;     //배점
	public int getScore(); //오버라이드 예정, 맞은 수 * sol을 리턴
}

interface Print {
	
	public String toPaint();
	
}
	



public class InterfaceEx4 extends User implements Score, Print {
	
	int s;
	public InterfaceEx4(String name, int s) {
		super(name);
		this.s=s;
	}
	
	public static void main(String[] args) {

		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toPaint());
		
		
	}

	@Override
	public int getScore() {
		return s*sol;
	}
	@Override
	public String toPaint() {
		
		return super.toString()+"\n점수 : "+getScore();
	}


}
