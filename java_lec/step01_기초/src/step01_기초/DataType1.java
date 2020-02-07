package step01_기초;

public class DataType1 {
	public static void main(String[] args) {
		String name = "홍길동"; // 문자열 자료형
		int age = 23; //4바이트 정수 자료형 +2147483647 ~ -2147483648
		char gender='남';
		float weight=63.4f; //4바이트 실수 자료형 (float 형으로 만들기 위해 뒤에 f를 붙여야 한다)
		double tall=175.5;
		System.out.println("이름 : "+name);
		System.out.println("나이 :"+age+"세");
		System.out.println("성별 : "+gender);
		System.out.println("체중 : "+weight+"kg");
		System.out.println("신장 : "+tall+"cm");
		
		
		/*
		 * System.out.println("이름 : 홍길동"); System.out.println("나이 : 23세");
		 * System.out.println("성별 : 남"); System.out.println("체중 : 63.4");
		 * System.out.println("신장 : 175.5");
		 */
		/*
		범위지정 주석 지정 : ctrl + shift + / 
		범위지정 주석 해제 : ctrl + shift + \
		 범위 지정 후 ctrl + shift + F  : 인덴테이션(자동정렬)
		 */
	}
}
