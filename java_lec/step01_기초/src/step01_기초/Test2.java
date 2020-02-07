package step01_기초;

public class Test2 {
public static void main(String[] args) {
	/*
	 * 변수 4개 (이름, 국어, 영어, 수학)를 만들고
	 * 대입 후 결과 와 같이 완성하세요
	 * 
	 * --결과
	 * 이름 : 강호동
	 * 국어 : 85
	 * 영어 : 73
	 * 수학 : 68
	 * 총점 : 226점
	 * */
	
	String name = "강호동";
	int a=85,b=73,c=68;
	int d=a+b+c;
	System.out.printf("이름:%s\n국어:%d\n영어:%d\n수학:%d\n총점:%d\n",name,a,b,c,d);
	}

}
