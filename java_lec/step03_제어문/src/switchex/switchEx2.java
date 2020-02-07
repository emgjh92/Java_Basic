package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 숫자를 입력하세요 : 5
 * 
 * 5는 홀수 입니다.
 * 
 * */
public class switchEx2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int num;
	
	System.out.printf("숫자를 입력하세요 :");
	num=Integer.parseInt(br.readLine());

	switch(num%2) {
	case 1:System.out.println(num+"는 홀수 입니다."); break;
	case 0:System.out.println(num+"는 짝수 입니다."); break;
	default : System.out.println("이용자의 상태가 정상이 아닙니다");
	}
	
	}
}
