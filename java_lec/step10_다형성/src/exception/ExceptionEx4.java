package exception;
//사용자 정의 예외처리 
class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		
		System.out.println("애들은 가라 ~");	
		
	}
	
}

public class ExceptionEx4 {
	
	public static void main(String[] args) throws MyException {

		int age = Integer.parseInt(args[0]);
		
		if(age < 19)
			throw new MyException();
		else
			System.out.println("어섭셔~");
	}

}
