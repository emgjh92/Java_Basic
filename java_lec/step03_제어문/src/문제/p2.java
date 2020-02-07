package 문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [문제4] 다음을 입력받아 계산하시오
		 * 
		 * [입력화면] Input name : 민들래 kor : 90 eng : 70 mat : 75
		 * 
		 * [출력화면] 이름 : 민들래 합계점수 : 235점 평균점수 : 78.3 <-- 소수 1자리까지출력하시오
		 */
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	String name;
	int kor,eng,mat;
	
	System.out.print("input name: ");
	name=br.readLine();
	System.out.print("kor: ");
	kor=Integer.parseInt(br.readLine());
	System.out.print("eng: ");
	eng=Integer.parseInt(br.readLine());
	System.out.print("mat: ");
	mat=Integer.parseInt(br.readLine());

	System.out.println("이름 : "+name+" 평균점수 : "+(kor+eng+mat)/3+" 합계점수 : "+(kor+eng+mat));
//==============================================================================================
		/*
		 * [문제5] 다음을 입력받아 계산하시오 (삼각형넓이 = (밑변 * 높이)/2)
		 * 
		 * [입력화면] 삼각형의 넓이 구하기 **** 밑변 : 10 높이 : 3
		 * 
		 * 
		 * [출력화면] 넓이 : 15.00 <--- 소수 2자리까지출력하시오
		 */
	int bottom, height;
	
	System.out.print("밑변 : ");
	bottom=Integer.parseInt(br.readLine());
	System.out.print("높이 : ");
	height=Integer.parseInt(br.readLine());
	
	System.out.println("넓이 : "+(bottom*height)/2);
//==========================================================================
		/*
		 * [문제6] 4개의 값을 콘솔에서 입력받아 처리하시오 조건) 성별 : M 이면 "남자", 나머지 "여자" (if문 이용)
		 * 
		 * [입력화면] Input name: 장미란 Input gender: F Input age: 25 Input tall: 173.3
		 * 
		 * [출력화면] 이름 : 장미란 성별 : 여자 나이 : 25세 신장 : 173.3cm
		 */ 
	String name3;
	char gender;
	int age;
	double tall;
	
	System.out.print("input name: ");
	name3=br.readLine();
	System.out.print("input gender: ");
	gender=br.readLine().charAt(0);
	System.out.print("input age: ");
	age=Integer.parseInt(br.readLine());
	System.out.print("input tall: ");
	tall=Double.parseDouble(br.readLine());
	
	if(gender=='M')
	System.out.println("이름 : "+name3+" 성별 : 남자  나이 : "+age+"세  신장 :"+tall+"cm");

	else
		System.out.println("이름 : "+name3+" 성별 : 여자  나이 : "+age+"세  신장 :"+tall+"cm");

}

}
