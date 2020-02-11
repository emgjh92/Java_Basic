package object;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	
	System.out.print("문자열 : ");
	String str=sc.nextLine(); //버퍼비우기 	  \r\n
	
	
	System.out.print("정수 : ");
	int a=sc.nextInt();
	
	System.out.print("실수 : ");
	double b=sc.nextDouble();
	
	System.out.print("문자 : ");
	char c=sc.next().charAt(0);
	
	System.out.println(str);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	sc.close();
	}
}
