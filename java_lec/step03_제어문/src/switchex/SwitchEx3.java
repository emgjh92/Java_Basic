package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * args로 입력된 month로 일수를 구하세요
 * $java SwitchEx3 3
 * 
 * 3달은 31일까지 있습니다.
 * 
 * */
public class SwitchEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int month;
		

		System.out.print("Month : ");
		month=Integer.parseInt(br.readLine());


		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:System.out.println(month+"월은 31일까지 있습니다.");break;
		default : System.out.println(month+"월은 30일까지 있습니다.");break;
		}

		
	}

}
