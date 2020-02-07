package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader, InputStreamReader

public class InputTest6 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr=new InputStreamReader(System.in); 
	//System.in : 키보드 입력을 의미
	BufferedReader br=new BufferedReader(isr);
	
	int eno;
	String ename;
	char dept;
	double score;
	
	System.out.print("사원번호를 입력하세요 : ");
	eno=Integer.parseInt(br.readLine()); 
	//br.readLine으로 읽어들인 후 Integer로 파싱
	
	System.out.println("사원 이름을 입력하세요 :");
	ename=br.readLine();
	
	System.out.println("부서 코드를 입력하세요 :");
	dept=br.readLine().charAt(0);
	
	System.out.println("입사 성적을 입력하세요 :");
	score=Double.parseDouble(br.readLine());
	
	System.out.println("사원번호 : "+eno);
	System.out.println("사원이름 : "+ename);
	System.out.println("부서코드 : "+dept);
	System.out.printf("입사성적 : %.2f점 ",score);


	
	
}
}
