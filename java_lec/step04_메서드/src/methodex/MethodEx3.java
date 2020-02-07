package methodex;
//call by value : 복사에 의한 전달

public class MethodEx3 {
	
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	public static int show2(int a, int b, int c) {
		return a+b+c;
		
	}
	public static double show3(int a, int b, int c) {
		
		return a+b+c/3.0;
	}
	public static String show4(int a, int b, int c) {
		
		String temp;
		temp = ((a+b+c/3.0)>=60)?"합격":"불합격"; //3항연산자 표현
		return temp;
		/*
		if((a+b+c/3.0)>60) {
			return "합격";
		}
		else {
		return "불합격";
		}
		*/
	}
	
	public static void main(String[] args) {
		show1(10,'A',100.4,50.3f);
		
		int sum=show2(95,85,73);
		System.out.println("합계 : "+sum);
		System.out.println("합계 : "+show2(100,200,300));
		
		double svg=show3(95,85,73);
		System.out.println("평균 :"+svg);
		System.out.printf("\n평균 : %.2f",svg);
		
		String result = show4(95,85,73);
		System.out.println(" \n\n\n"+result);
		
	}
}
