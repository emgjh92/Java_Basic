package P16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P16 {
public static void main(String[] args) throws NumberFormatException, IOException {
	/*
	16.intŸ���� ���� num �� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�. 
	���� ���� num�� ���� 12345���, ��1+2+3+4+5���� ����� 15�� ����϶�. 
	[����] ���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
	(API�� ������� �ʴ´�. �˰������θ� ó��)
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
