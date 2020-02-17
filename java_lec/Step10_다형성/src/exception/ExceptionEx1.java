package exception;
//다형성 부모의 자료형으로 형변환 가능 데이터베이스에서 인터페이스 사용(?) 
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int var = 5;
		try { //unchecked exception
			
			int n = Integer.parseInt(args[0]);
			System.out.println(var/n);
		} catch(Exception e) {
			
			System.out.println("입력된 값에 문제가 있어요..");
		}

	}

}
		/* $ java ExceptionEx1 2 ==> 2
		 * $ java ExceptionEx1 0 ==> 0으로 나눌수 없어요 
		 * $ java ExceptionEx1 p ==> 숫자로 바꿀 수 없습니다 
		 * $ java ExceptionEx1   ==> 입력된 값이 없어요
		 * $ java ExceptionEx1 p ==>
		 * 
		 */
		
//		int var = 5;
//		try { 
//			
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var/n);
//		
//		} catch (ArithmeticException e) {
//			
//			System.out.println("0으로 나눌수 없어요" + e.getMessage());
//			
//		}
//		
//		catch (NumberFormatException e) {
//			
//			System.out.println("숫자로 바꿀 수 없습니다" + e.toString());
//			
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("입력된 값이 없습니다");
//			
//		} finally { //무엇이 입력되든 실행
//			
//			System.out.println("무조건 실행");
//			
//		}
//		
	