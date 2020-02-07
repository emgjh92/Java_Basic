package forex;

public class ForEx2 {
	public static void main(String[] args) {
		
		//배열 : 동일한 자료형의 연속된 기억공간
		int [] num= {101, 102, 103, 104, 105}; //배열 선언
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		//향상된 for문
		for(int n : num) { // (무조건)'배열의 처음부터 끝까지'  참조
			System.out.println(n); //일부부만 필요한 경우엔 일반적 for 문 사용 
									// (전체를 다 참조할 때 보통 사용한다) 
		}
		//======================================================================
			String[] color= {"red","green","blue"};
			
			for(int j=0; j<color.length; j++) {
				
				System.out.println(color[j]);
			}
			
			for(String k : color) {
				
				System.out.println(k);
			}
			
			for(int a=1; a<=10; a++) {
				
				if(a==5) {
				//	break; //==> for문 루프 break	
					continue; // 출력 : 1 2 3 4 6 7 8 9 10 ==> 5가 빠진다.
				}
				System.out.println(a+" ");
			}
	}
	
}
