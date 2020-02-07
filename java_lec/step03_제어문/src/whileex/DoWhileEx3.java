package whileex;
/*
 * do~while을 이용하여 65~90 사이의 난수 10 생성하기
 * 
 * 
 * */

import java.util.Random;


public class DoWhileEx3 {
public static void main(String[] args) {
	
	int i=0;
	int random_number;
	//Random클래스 이용
	Random rd=new Random();
	
//	int n1=rd.nextInt(101)+0; //0~100
//	int n2=rd.nextInt(31)+50; //50~80
//	int n3=rd.nextInt(41)+30; //30~70
	
	do {
		random_number=rd.nextInt(26)+65; 
		//random_number=(int)(Math.random()*26+65); //Math 클래스를 사용한 경우
		System.out.println(random_number);
		++i;
	}while(i<10);
}

}
