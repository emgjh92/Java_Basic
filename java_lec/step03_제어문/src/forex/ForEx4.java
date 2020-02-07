package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEx4 {
/*
 * BufferedReader를 이용하여 작성
 * 
 * 1. 문자를 입력받기 (대문자)
 * 2. 랜덤하게 대문자 30개를 발생하여 화면에 출력
 * 3. 발생한 문자 중에 입력한 문자가 몇개인지 출력하기
 * 
 * ---결과
 * 문자입력 : K
 * X H G D H I U D R ...K W E R
 * 
 * K의 개수 : 5
 * 
 * 
 * 
 * */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char alph;
		char alph2='A';
		int count=0;
		System.out.print("문자입력 : ");
		alph=br.readLine().charAt(0);
		
		for(int i=1; i<=30; i++)
		{	
			alph2+=(Math.random()*26+0);
			System.out.printf(alph2+" ");
			if(alph2==alph) count++;
			alph2='A';
		}
		System.out.println("\n\n"+alph+"의 개수 : "+count);
		}
	}
