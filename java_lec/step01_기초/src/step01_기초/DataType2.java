package step01_기초;

public class DataType2 {
	public static void main(String[] args) {
		String name="홍길동";
		char gender='남';
		double score=85.3;
		int age=25;
		double tall = 183.4;
		
		System.out.printf("이름 : %s\n",name);
		System.out.printf("성별 : %c\n",gender);
		System.out.printf("점수 : %-10.1f\n",score);
		System.out.printf("나이 : %10d\n",age);
		System.out.printf("점수 : %.2f\n",tall);
	}
}
