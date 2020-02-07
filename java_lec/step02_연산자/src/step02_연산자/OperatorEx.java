package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {
		
		//변수의 초기화
		
		String a=null;//無의 상태 //String a=""; 의 경우엔 null을 할당 후 기억공간에 아무것도 안 넣은 상태
		int b=0; //정수 데이터의 경우 int b; 만 할 경우 error 처리 (다른 언어는 쓰레기값을 넣어준다)
		float c=0.0f;
		char d='\0'; //널문자 (null과는 다르다!)
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	
		char code='남'; 
		//JAVA, Python 의 경우엔 한글도 한 글자 (char)로 취급 (c언어에선 에러 떠서 string 사용)
		
		String gender;
		gender=(code=='M'|| code=='남')?"man":"woman";
		//3항 연산자
		//(code=='M'|| code=='남') 의 결과가 True 면 man, False 면 woman
		System.out.println("성별 : "+gender);
		
		boolean ck=true;
		System.out.println(!ck);
		
//======================================================================================
		int k = 5;
		
		System.out.println(k++); //5 (연산 후 증가 - 화면엔 5를 찍고 그 후 1 증가 시켜 6이 메모리에 저장)
		System.out.println(++k); //7 (위에서 k 가 6이 되므로 ++k 가 6+1 = 7 이 된다)
		System.out.println(k);   //7
		System.out.println(--k); //6 (후위 연산자 : 감소 후 연산 ==>7-1=6)
		System.out.println(k--); //6 (연산 후 감소 : 화면에 일단 6을 찍고 메모리엔 6-1=5 를 저장)
		
		
		int p=3;
		p+=2; // p=p+2
		p*=3; // p=p*3
		p-=2; // p=p-3
		p%=3; // p=p%3 (나머지 1)
		
		
//--------------------------------------------------------------------------------
		
		int score2=17;
		boolean sw = (score2>=70 && score2 <90);
		//boolean 자료형 : True, False 를 판단하는 연산

		System.out.println(sw);

		
//--------------------------------------------------------------------------------
		System.out.println(5/3); // 결과값 : 1 (몫)
		System.out.println(5%3); // 결과값 : 2 (나머지)
		
		int a2=5;
		
		System.out.println(a2==5); //a가 5인가? 결과값 : True //좌변을 기준으로 판단
		
		System.out.println(a2>=5); //a가 5보다 크거나 같은가
		System.out.println(a2!=5); //a가 5가 아닌가? 결과값 : false
		
		String str="korea";
		System.out.println(str=="korea"|| str=="KOREA" );
		//앞 값이 True 가 나오면 뒤에껀 수행하지 않는다 (OR 연산)
		
		int	 score=57;
		System.out.println(score>=70&&score<90);
		//AND 연산
		
	}

}
