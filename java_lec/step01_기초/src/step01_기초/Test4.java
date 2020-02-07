package step01_기초;

public class Test4 {
public static void main(String[] args) {

	/*
		 *각각 변수에 대입하여 출력 하세요
		 *--결과
		 *이름 : 이순신 <-- println()
		 *나이 : 25세 <-- print()
		 *부서 : 개발부
		 *성적 : 87.5점 <-- printf() 부서 성적 한번에 출력 
		 * 
	*/
		String name="이순신";
		int age = 25;
		String depo="개발부";
		float score = 87.5f;
		
		System.out.println("이름 : "+name);
		System.out.print("나이 : "+age+"\n");
		System.out.printf("부서 : %s \n성적 : %.1f점",depo,score);
	}
}