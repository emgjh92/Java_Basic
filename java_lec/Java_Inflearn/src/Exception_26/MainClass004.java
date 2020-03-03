package Exception_26;

public class MainClass004 {

	public static void main(String[] args) {
		
		MainClass004 mainClass004 = new MainClass004();
		
		try {
			mainClass004.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void firstMethod() throws Exception {
		secondMethod(); //throws 는 Exception 자체를 호출한 곳으로 던져버림
	}
	
	public void secondMethod() throws Exception {
		thirdMethod();
	}
	
	public void thirdMethod() throws Exception {
		System.out.println("10 / 0 = " + ( 10 / 0 ));
	}
	/*
	thirdMethod() ==> secondMethod() ==> firstMethod() ==> Exception e 
	로 예외처리가 throws 됨
	*/
	
}
