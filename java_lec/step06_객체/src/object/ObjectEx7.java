package object;
//해당파일은 Trapezoid.java 와 연동해서 사용함

import java.util.Scanner;
/*
 *
 * **** 사다리꼴의 넓이 구하기  ****
 * 밑변을 입력하세요 : 5
 * 윗변을 입력하세요 : 4
 * 높이를 입력하세요 : 3
 * 
 * 넓이 : 13.5
 * 
 * 한 번 더 계산 할까요? (Y/y) n
 * ****수고하셨습니다****
 */

public class ObjectEx7 {
public static void main(String[] args) {
	//스캐너
	Scanner sc=new Scanner(System.in);
	Trapezoid tr=new Trapezoid();
	
	char d;
	//do-while 내부에서 입력 처리
	do {
		System.out.print("****사다리꼴의 넓이 구하기 ****\n");
		System.out.print("밑변을 입력하세요 : ");
		int a=sc.nextInt();	
		System.out.print("윗변을 입력하세요 : ");
		int b=sc.nextInt();	
		System.out.print("높이를 입력하세요 : ");
		int c=sc.nextInt();	
		
		tr.setTrapezoid(a, b, c);
		System.out.println(tr.toString());
		
		System.out.println("한 번 더 계산 할까요? (Y/y)");
		d=sc.next().charAt(0);
		}while(d=='y'||d=='Y');
		System.out.print("****수고하셨습니다****\n");
		
		sc.close();
	}
}
