package overload;
/*
 *	 overload method(중복함수) : 같은 이름의 함수를 여러번 구현
 * 1. 반드시 함수 이름이 동일
 * 2. 매개변수의 타입이 다르거나 게ㅐ수가 달라야 함
 *
 */

public class OverloadEx {
	
	int x=17;   // 전역변수
	int y=15;   
	
	public int max() {
		return (x>y)?x:y;
	}
	public int min(int x, int y) {
		return (x<y)?x:y;
	}
	public float max(float x, float y) {
		return (x>y)?x:y;
	}
	public static void main(String[] args) {
		OverloadEx ob=new OverloadEx();
		System.out.println("큰수 : "+ob.max());
		System.out.println("작은수 : "+ob.min(75,100));
		System.out.println("큰수 : "+ob.max(75.5f,100.4f));
	}
}
