package Exception_26;

public class MainClass001 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int r = 0;
		
		System.out.println("Ecexption BEFORE");
		
		try {
			r = i / j;
		} catch (Exception e) {
			e.printStackTrace(); //printStackTrace: 어떤 error인지 화면에 출력
			String msg = e.getMessage();//error을 간단히 메세지로 보여주는 것
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Ecexption AFTER");
		
	}
	
}
