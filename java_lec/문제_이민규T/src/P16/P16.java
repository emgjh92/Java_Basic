package P16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16 {
public static void main(String[] args) throws NumberFormatException, IOException {
	/*
	16.int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
	만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
	[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
	(API를 사용하지 않는다. 알고리즘으로만 처리)
	*/
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int num=0;
	
	System.out.print("input number: ");
	num=Integer.parseInt(br.readLine());
	
	int sum = 0;
	while (num > 0) {
		sum += num % 10; 
		num /= 10; 
		System.out.println("num=" + num);
	}
	System.out.println("sum=" + sum);
}

	
}
