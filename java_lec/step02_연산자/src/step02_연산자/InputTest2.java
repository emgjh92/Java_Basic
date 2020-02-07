package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A값을 입력하세요 : 15
 * B값을 입력하세요 : 10
 * 
 * 15+10 = 25
 * 
 * 
 */
public class InputTest2 {
public static void main(String[] args) throws NumberFormatException, IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int value_a;
	int value_b;
	
	System.out.print("A를 입력하세요 : ");
	value_a=Integer.parseInt(br.readLine());
	
	System.out.print("B를 입력하세요 : ");
	value_b=Integer.parseInt(br.readLine());
	
	System.out.println(value_a+ "+"+ value_b+ "="+(value_a+value_b));
	
   }
}