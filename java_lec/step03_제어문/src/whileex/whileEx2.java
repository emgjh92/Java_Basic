package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 단을 입력받아 구구단을 출력하세요
 * 
 * --결과
 * 단을 입력하세요 : 7
 *  7*1 = 7
 *  7*2 = 7
 *  7*3 = 7
 *  7*4 = 7
 *  7*5 = 7
 *  7*6 = 7
 *  7*7 = 7
 *   .
 *   . 
 * */
public class whileEx2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// ==> 이런식도 가능
	
	int dan;
	int dan2=1;
	System.out.print("단을 입력하세요 : ");
	dan=Integer.parseInt(br.readLine());

	
	while(dan2<10)
	{
		System.out.println(dan+"*"+dan2+"="+(dan*dan2));
		dan2++;
		}
	}
}
