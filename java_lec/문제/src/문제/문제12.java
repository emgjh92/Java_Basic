package 문제;
/*                
 [문제12]메인메서드에서 값을 입력받고  compute메서드를 호출하여 처리하시오
(1)입력받은 값을  compute(item, qty, price)메서에서 처리할것
(2)계산방법은  금액 = 수량 * 단가 로 하시오

[입력화면]
품명을 입력하시오 : apple
수량를 입력하시오 : 10
단가를 입력하시오 : 1200

[출력화면]
품명 : apple
금액 : 12000원
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제12 {
public static void compute(String item1, int qty, int price) {
	System.out.println("품명 : "+item1);
	System.out.println("금액 : "+(qty*price)+"원");
	
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String item1;
		int qty1;
		int price1;
		
		System.out.print("품명을 입력하세요 : ");
		item1=br.readLine();
		
		System.out.print("수량을 입력하세요 : ");
		qty1=Integer.parseInt(br.readLine());
		
		System.out.print("단가를 입력하세요 : ");
		price1=Integer.parseInt(br.readLine());
		
		compute(item1,qty1,price1);
	}
}
