package 문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[문제8]성적처리프로그램
중간고사,기말고사,레포트,출석점수를 입력받아서 계산하시오

조건1) (중간+기말)/2      ---> 60%
  과제                   ---> 20%
  출석                   ---> 20%

조건2)  90이상 'A'학점     (3)A,B학점  ---->"excellent"
   80이상 'B'학점        C,D학점  ---->"good"
   70이상 'C'학점        F학점    ---->"poor"
   60이상 'D'학점        (switch문이용) 
   나머지 'F'학점
   (if~else if문이용)

[입력화면]
중간고사를 입력하시오 : 90
기말고사를 입력하시오 : 89
과제점수를 입력하시오 : 99
출석점수를 입력하시오: 100

[출력화면]
성적=93.20      <---소수이하 2째자리까지
학점=A              System.out.printf("성적 : %.2f", avg);
평가=excellent
------------------------------------------------------------------------
*/
public class 문제8 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int middle,finalt,report,attendence;
	float score=0;
	
	System.out.print("중간고사를 입력하세요 : ");
	middle=Integer.parseInt(br.readLine());
	System.out.print("기말고사를 입력하세요 : ");
	finalt=Integer.parseInt(br.readLine());
	System.out.print("과제점수를 입력하세요 : ");
	report=Integer.parseInt(br.readLine());
	System.out.print("출석점수를 입력하세요 : ");
	attendence=Integer.parseInt(br.readLine());
	
	score=(float) ((int)((middle+finalt)/2)*0.6+(report*0.2)+(attendence*0.2));
	
	if(score>=90) System.out.printf("\n성적 : %.2f \n학점=A\n평가=excellent",score);
	else if(score>=80)System.out.printf("\n성적 : %.2f \n학점=B\n평가=excellent",score);
		else if(score>=70)System.out.printf("\n성적 : %.2f \n학점=C\n평가=good",score);
			else if(score>=60)System.out.printf("\n성적 : %.2f \n학점=D\n평가=good",score);
				else System.out.printf("\n성적 : %.2f \n학점=F\n평가=poor",score);



	
	}
}
