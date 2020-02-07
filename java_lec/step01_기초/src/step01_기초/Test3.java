package step01_기초;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * float 변수를 만들고 75.3
		 * double 변수를 만들고 89.53을 각각 대입 한 후
		 * System.out.println();를 한번만 사용하여 출력하세요.
		 * 
		 * --결과
		 * 국어점수는 75.3점이고
		 * 수학점수는 89.53점 입니다.
		 * 
		 * */
		float num1=75.3f;
		double num2=89.53;
		
		System.out.printf("국어 점수는 %.2f 이고\n수학점수는 %.2f점 입니다.",num1,num2);
		System.out.println("\n점수 : "+String.format("%-10.1f", num1));
		// println 에서 소숫점을 끊어서 표현하는 방법
		

	}

}
