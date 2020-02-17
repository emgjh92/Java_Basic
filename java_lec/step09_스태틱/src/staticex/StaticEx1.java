package staticex;

class Test {
	
	int x;
	int y;
	static int z; //접근횟수 (누적을 시켜야되는 경우) static(전역변수) 사용
	
	static {
		
		System.out.println("static 초기화 영역");
		
	}
	
	public Test(int x, int y, int z1) {
		
		this.x = x;
		this.y = y;
		z = z1;
		System.out.println("객체 초기화 영역");
		
	}
	
	public void view() {
		
		System.out.println(x + " " + y + " " + z);
	
	}
	
}

public class StaticEx1 {

	public static void main(String[] args) {

		Test ob1 = new Test(1, 2, 3); 
		Test ob2 = new Test(4, 5, 6);
		
		ob1.view();
		ob2.view();
		
		
		
	}

}
