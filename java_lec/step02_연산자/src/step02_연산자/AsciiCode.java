package step02_연산자;
/*
 * 7비트 정보교환용 2^7 개의 자료 표현
 * A : 65, a : 97, \n : 13, 1 : 49
 * */
public class AsciiCode {

	public static void main(String[] args) {
		System.out.println("A : "+(int) 'A');
		System.out.println("a : "+(int) 'a');
		
		System.out.println("65 : "+(char)65);
		System.out.println("97 : "+(char)97);
		
		System.out.println("----------------------");
		
		System.out.println('A'+1); // char + int = int
		System.out.println((char)('A'+1));
		
		System.out.println('a'-32); // char + int = int
		System.out.println((char)('a'-32));		
		
		System.out.println('A'+'B'); // char + char = int	
		
	}
/*BufferedReader ==> 사용자 정의 자료형 (엄밀히 말하면 라이브러리 사용한 것 이므로 사용자 정의는 아님)
 * ===> 구성요소 : 변수 / 함수
 * */
}
