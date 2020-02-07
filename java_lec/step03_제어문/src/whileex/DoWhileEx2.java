package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * 다시 한번 실행할까요(y/Y) ? Y 
 * 다시 한번 실행할까요(y/Y) ? y
 * 다시 한번 실행할까요(y/Y) ? n
 * 
 * ***수고요***
 *
 */

public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char qu;
		
		do {
			System.out.print("다시한번 실행할까요(y/Y) ? : ");
			qu=br.readLine().charAt(0);
			
		}while(qu=='y'||qu=='Y');
		System.out.println("***수고요***"); 
		System.exit(0);
		}
	}