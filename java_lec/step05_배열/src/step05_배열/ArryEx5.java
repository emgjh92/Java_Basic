package step05_배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 크키가 5개인 정수형 배열을 잡고 배열에 데이터를 입력받아서 출력하고 최대,
 * 최소값을 구하세요
 * 
 * ===결과
 * ar[0]의 값을 입력 : 25
 * ar[1]의 값을 입력 : -34
 * ar[2]의 값을 입력 : 10
 * ar[3]의 값을 입력 : 16
 * ar[4]의 값을 입력 : 8
 * 
 * 25 -34 10 16 8
 * 
 * 최대값 : 25
 * 최소값 : -34
 * 
 * */
public class ArryEx5 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
	int [] ar = new int[5];
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	for(int i=0; i<5; i++)
	{
		System.out.print("ar["+i+"]를 입력하세요 : ");
		ar[i]=Integer.parseInt(br.readLine());
	}
	
	
	int max=ar[0];
	int min=ar[0];
	
	for(int i=1; i<ar.length; i++) {
		if(ar[i] > max) max=ar[i];
		if(ar[i] < min) min=ar[i];
	}
	System.out.println("max : "+max);
	System.out.println("min : "+min);
	
}
	

}

