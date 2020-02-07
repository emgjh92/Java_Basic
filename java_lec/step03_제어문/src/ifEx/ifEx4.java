package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 중첩 if문 사용
 * 3개 과목의 점수를 입력 받아 합격 불합격 출력하기
 * 3개 과목이 전부 40 이상이여야 하고 평균이 60이상이여야 합격
 * 평균이 60이 넘지만 1개 과목의 과목이라도 40미만이라면 과락으로 불합격
 * 평균이 60 미만이면 "불합격" 출력
 * 
 * -----결과
 * 국어 점수 입력 : 35
 * 영어 점수 입력 : 80
 * 수학 점수 입력 : 100
 * 결과  = 과락으로 불합격
 * 
 * 국어 점수 입력 : 75
 * 영어 점수 입력 : 80
 * 수학 점수 입력 : 100
 * 결과  = 합격
 * 
 * 국어 점수 입력 : 35
 * 영어 점수 입력 : 30
 * 수학 점수 입력 : 20
 * 결과  = 불합격
 * */
public class ifEx4 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int k;
	int e;
	int m;
	
	System.out.print("국어 점수를 입력하세요 : ");
	k=Integer.parseInt(br.readLine());
	
	System.out.print("영어 점수를 입력하세요 : ");
	e=Integer.parseInt(br.readLine());
	
	System.out.print("수학 점수를 입력하세요 : ");
	m=Integer.parseInt(br.readLine());
	
	
	if((double)(k+e+m)/3.0>=60) {
		if(k<40||e<40||m<40) System.out.println("결과 = 과락으로 불합격");
		else System.out.println("결과 = 합격");
	}
	else {
		System.out.println("결과 = 불합격");
	}
	
	
			
			
	}
}
