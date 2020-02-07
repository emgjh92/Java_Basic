package 문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [문제9] for문을 이용하여 제곱값을 구하시오
	
	x의 값을 입력하시오 : 3
	y의 값을 입력하시오 : 3
	3의 3승은 27
 * */
public class 문제9 {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	 
	int x, y, answer=1;
	
	System.out.print("x값을 입력하세요 : ");
	x=Integer.parseInt(br.readLine());
	System.out.print("y값을 입력하세요 : ");
	y=Integer.parseInt(br.readLine());
	
	for(int i=0; i<y; i++)
	{
		answer=answer*x;
	}
	System.out.println(x+"의"+y+"승은 "+answer);
	}
}
