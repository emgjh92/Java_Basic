package 문제;

import java.util.Scanner;



/*
[문제25] 추상클래스를 이용하여 다음 프로그램을 완성하시오

(1)추상클래스:  Height 
   필드명 : INCH:double                      ==> final변수, 초기값:2.54 
   메소드 : getInch(double cm):double  ==> 추상메서드
            

(2)처리조건
   Test42클래스에서 Height를 상속받아 getInch()를 재정의 

(3)입.출력
입력(cm) : 5.08
결과 : 2인치
*/
abstract class Height{ //추상 (미완성) 클래스
	
	abstract public double getInch(double cm);
}
class Test42 extends Height{

	private static final double INCH = 2.54;

	@Override
	public double getInch(double cm) {
		return cm*INCH;
	}
	
}
public class 문제25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("입력 : ");
		int a=sc.nextInt();
		
		Height hi=new Test42();
		System.out.println("결과 :"+hi.getInch(a));
		sc.close();
	}
}
