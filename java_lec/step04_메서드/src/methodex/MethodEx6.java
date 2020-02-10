package methodex;

public class MethodEx6 {
	
	private static String rs(int total) {
		if(total >= 800) return "합격";
		else return "불합격";
	}

	private static int total(int toeic, int it) {
		return toeic+it;
	}
	
	public static void main(String[] args) {
		int toeic=750, it=65;
		System.out.println("입사총점 : "+total(toeic,it)+"점");
		System.out.println("입사결과 : "+rs(total(toeic,it))+"입니다");
		//입사총점 : 815점
		//입사결과 : 합격입니다. ==> 800 이상 합격, 미만 불합격
		
		/*
		 * 함수정의 
		 * 		접근지정자 		리턴타입(매계변수)		 함수명
		 * 
		 * 
		 * 함수호출 
		 * 						함수이름(매계변수)
		 */
	}
}