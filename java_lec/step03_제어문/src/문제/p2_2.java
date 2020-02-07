package 문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2_2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [문제7]2개의 숫자와 연산자를 입력하여 계산하시오 
		 * 조건1) 실수인경우는 소수이하 2째자리까지 출력하시오 
		 * 조건2) 연산자가 +,-,*,/ 이외의 문자가 들어오면 "연산자error"출력하시오
		 * 
		 * [실행결과] x값을 입력하시오 : 25 y값을 입력하시오 : 36 연산자를 입력(+,-,*,/) : + 25 + 36 = 71
		 * 
		 * x값을 입력하시오 : 25 y값을 입력하시오 : 36 연산자를 입력(+,-,*,/) : / 25 / 36 = 0.69
		 * 
		 * x값을 입력하시오 : 25 y값을 입력하시오 : 36 연산자를 입력(+,-,*,/) : # 연산자 error
		 */
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int x,y;
	char yunsanja;
	
	System.out.println("x값을 입력하시오 :");
	x=Integer.parseInt(br.readLine());
	System.out.println("y값을 입력하시오 :");
	y=Integer.parseInt(br.readLine());
	System.out.println("연산자를 입력(+,-,*,/)하시오 :");
	yunsanja=br.readLine().charAt(0);
	float an;
	switch(yunsanja) {
	case '+':an=x+y; System.out.println(x+"+"+y+"="+(an));break;
	case '-':an=x-y; System.out.println(x+"-"+y+"="+(an));break;
	case '*':an=x*y; System.out.println(x+"*"+y+"="+(an));break;
	case '/':an=x/y; System.out.println(x+"/"+y+"="+(an));break;
	default : System.out.println("# 연산자 error");}
	
	
	
	}

}
