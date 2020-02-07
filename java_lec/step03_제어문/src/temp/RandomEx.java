package temp;

import java.util.Random;

//난수 : 컴퓨터가 임의의 숫자를 발생 시키는 것, 의사난수, Pseudo random


public class RandomEx {

	public static void main(String[] args) {
	//	Math 클래스----
	System.out.println(Math.random()); //0~1 미만의 실수
	
	System.out.println((int)(Math.random()*10+1)); //1~11 미만
	System.out.println((int)(Math.random()*31+50)); //50~80 사이의 정수
	System.out.println((int)(Math.random()*30+51)); //51~80 사이의 정수
	
	//Random클래스 이용
	Random rd=new Random();
	
	int n1=rd.nextInt(101)+0; //0~100
	int n2=rd.nextInt(31)+50; //50~80
	int n3=rd.nextInt(41)+30; //30~70
	
	System.out.println(n1 +" "+n2+" "+n3);
	
	}

}
