package finalex;
//import java.lang.object;
import java.lang.String;

class Test {
	
	public Test() {
		
		super();
		
	}
	
	String name = "강호동";
	
	public void view() {
		
		System.out.println("이름 : " + this.name.toString()); //this. .toString() 생략이 되어있다.
	
	}
	
}


public class ObjectEx {

	
	
	public static void main(String[] args) {

		new Test().view();
		
		Test ob = new Test();
		
		ob.view();
		
	}

}
