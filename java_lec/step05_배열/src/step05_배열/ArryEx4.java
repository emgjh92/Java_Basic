package step05_배열;

public class ArryEx4 {

	public static void main(String[] args) { 
		//main 함수는 운영체제가 호출
		
		int [] num = new int[3];
		/*
		new 연산자 ==> 인스턴스 생성, Heap 메모리 공간 할당, 객체에게 참조값 리턴
		인스턴스(instance)는 해당 클래스의 구조로 컴퓨터 저장공간에서 할당된 실체를 의미
		즉, new 연산자가 하는 일은 class 의 변수와 함수의 기억공간을 할당해 주는 역할을 한다 (class에서 파생된 객체 포함)
		*/
		
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
		
		// 최대값, 최소값 구하기
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) max=num[i];
			if(num[i] < min) min=num[i];
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		/*
		 * Math.max(a, b) 도 사용 가능
		 * 
		 */

	}	
}
