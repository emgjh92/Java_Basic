package step02_연산자;
//콘솔 : 표준 입출력 장치

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class InputTest1 {
		
	public static void main(String[] args) throws IOException {
		//throws IOException ==> 예외 던지기(throws)처리
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//new 를 쓰는 이유 : 객체 자료형 초기화
		//1. 키보드에서 입력을 받고
		BufferedReader br = new BufferedReader(isr);
		//2. 버퍼에 그 값을 저장
		// 이걸 하는 이유 : 속도 개선을 위해
		
		String name;
		char gender;
		int age;
		float weight;
		double tall;
		
		System.out.print("이름을 입력하세요 : ");
		name=br.readLine();
		//readLine의 두가지 의미  1.포함의 의미, 2.입력의 의미
		
		
		System.out.print("성별을 입력하세요 : ");
		gender=br.readLine().charAt(0); 
		//gender를 읽어와서(readLine) 캐릭터의 첫번째에 저장 (charAt(0))
		
		//charAt(i) : 문자 1개 추출, i는 추출하고자 하는 값의 인덱스
		//입력은 charAt(i) 앞에 기술 
		// 예시 : System.out.println("한글과컴퓨터".charAt(3));
		
		System.out.print("나이를 입력하세요 : ");
		age=Integer.parseInt(br.readLine());
		System.out.print("체중을 입력하세요 : ");
		weight=Float.parseFloat(br.readLine());
		System.out.print("신장을 입력하세요 : ");
		tall=Double.parseDouble(br.readLine());
		

		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("체중 : "+weight);
		System.out.println("신장 : "+tall);
	}

}
