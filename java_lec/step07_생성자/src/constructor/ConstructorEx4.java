package constructor;

import java.util.Scanner;

/*
 * 클래스명 : ConstructorEx4
 * x:int
 * y:int
 * 
 * +ConstructorEx4()	--입력처리 (스캐너)
 * +calc():int			--x*y를 리턴
 * +display():void		--출력하기
 * */

/*
 * 가로를 입력 : 5
 * 세로를 입력 : 4
 * 
 * 사각형의 넓이 : 20
 * 
 */

//메소드=함수=프로시져=펑션

public class ConstructorEx4 {
	int x;
	int y;
	
	public ConstructorEx4(){
		Scanner sc=new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		this.x=sc.nextInt();
		System.out.print("세로를 입력 : ");
		this.y=sc.nextInt();
		sc.close();
	}
	public void display() {
		System.out.println("사각형의 넓이 : "+calc());
	}
	public int calc() {
		return x*y;
	}
	public static void main(String[] args) {
		new ConstructorEx4().display();
	}
}