package P1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
public static void main(String[] args) throws NumberFormatException, IOException {
/*
1.

임의의 시험 점수를 입력(혹은 랜덤으로)받아 

90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 

60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

​*/
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int jumsu=0;
	
	System.out.print("input score: ");
	jumsu=Integer.parseInt(br.readLine());

	if(jumsu >=90) System.out.println("you score is A");
	else if(jumsu >=80) System.out.println("you score is B");
	else if(jumsu >=70) System.out.println("you score is C");
	else if(jumsu >=60) System.out.println("you score is D");
	else System.out.println("you score is F");

	
	}
}
