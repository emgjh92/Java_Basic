package step02_연산자;

public class CastingEX {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033; // 혹은	 int tax=(int)0.033
		int rPay=pay-(int)(pay*tax); 
		// 실수 - 정수 = 정수 이므로 Error 발생, (int) 로 casting(=형변환)
		
		System.out.println("실수령액 : "+rPay);

//=====================================================================================
		
		int k=87, e =88, m=75;
		int total = k+e+m;
	//	double avg = total/3;    // (실수 / 정수) ==> 정수
	//	double avg = (double)total/3;  // 자동형변환  
	    double avg = total/3.0;    // 자동형변환

		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
		
		byte a = 100;
		int b = a; //자동 형변환
		
		double c = 73.45;
		int d = (int) c; //강제 형변환
				
		System.out.println(a + " " + b);
		System.out.println(c + " " + d); //지수, 가수 부분 중 지수 부분(실수 부분) 만 출력 됨

	}

}
