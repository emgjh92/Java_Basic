package constructor;

import java.util.Scanner;

//생성자 : 객체 생성 (값 대입, 입력 처리)
/*
 * 생성자에서 두 수를 입력받아 큰수 작은 수를 출력하세요
 * show()메서드에서 maxValue(), minValue()를 호출할 것
 * 
 * 클래스 : Max
 * -a:int
 * -b:int
 * +Max()
 * +maxValue:int
 * +minValue:int
 * +show():void
 * 
 * --출력
 * Input a : 5
 * Input b : 3
 * 
 * 큰수 : 5
 * 작은수 : 3
 * 
 */

class Max{
	private int a;
	private int b;
	
	public Max() {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a : ");
		a=sc.nextInt();
		System.out.print("Input b : ");
		b=sc.nextInt();
		sc.close();
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int maxValue(int a, int b) {
	return (a>b)?a:b;
	}
	
	public int minValue(int a, int b) {
	return (a<b)?a:b;

	}
	
	public void show() {
	System.out.println("큰수 : "+maxValue(a,b)+"\n작은수 : "+minValue(a,b));	
	}
}
public class ConstructorEx6 {
	public static void main(String[] args) {
		new Max().show();
	}
}