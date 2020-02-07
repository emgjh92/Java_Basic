package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 반지름을 입력하세요 : 5
 * 
 * 원의 넓이 : 78.5 (반지름 *반지름 *3.14)
 * 원의 둘레 : 31.4 (2*3.14*반지름)
 * 
 * */

public class inputTest4 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int half; 
		double scale, round;
		
		System.out.print("반지름을 입력하세요 : ");
		half=Integer.parseInt(br.readLine());
		
		scale = half*half*3.14;
		round = 2*half*3.14;
		
		System.out.printf("원의 넓이 : %.1f",scale);
		System.out.printf("\n원의 둘레 : %.1f\n",round);	
	}
}
