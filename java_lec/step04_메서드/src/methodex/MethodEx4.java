package methodex;

/*
 * ---출력
 * 총점 : 253점
 * 평균 : 84.33점
 * 학점 : B (90점 A, 80점 B ...)
 * 결과 : 합격
 * -----------------------------------------------
 * 학점 : switch 이용하여 구하기  
 * 결과 : if~else 	F면 불합격, 아니면 합격을 return
 * 
 * 
 * */

public class MethodEx4 {
	public static int total(int k, int e, int m) {
		
		return k+e+m; //return은 호출한 곳으로 되돌아감...(값을 가지고)
	}
	
	public static double avg(int tot) {
		
		return tot/3.0;
	}

	public static char grade(double av) {
		//switch 문 사용하기
		
		switch((int)(av/10)) {
		case 9: return 'A'; 
		case 8: return 'B'; 
		case 7: return 'C'; 	
		case 6: return 'D';
		default: return 'F';

		}
	}
	public static String result(char gr) {
		//합격, 불합격 리턴하기
		if(gr=='F') {
			return "불합격";
		}
		else return "합격";
		
	}
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		
		System.out.println("총점 : "+total(k,e,m));
		System.out.printf("평균 : %.2f\n",(avg(total(k,e,m))));
		System.out.println("학점 : "+grade(avg(total(k,e,m))));
		System.out.println("결과 : "+result(grade(avg(total(k,e,m)))));
	}

}
