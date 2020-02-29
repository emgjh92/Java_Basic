package P20;

public class P20 {
	/*
	20.	
	반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 
	1부터 시작하며 99까지만 한다. 

	실행 결과 예) 
	3 박수한번
	6 박수 한번
	9 박수 한번 
	.
	.
	.
	33 박수 두번
	.
	98 박수 한번
	99 박수 두번
	*/
	public static void main(String[] args) {
		boolean b1, b2;
		
		for(int i=1; i<100; i++) {
			if (i<10) {  // 입력값이 한자리 수인 경우
				if ((i %3) == 0)
					System.out.println(i + " 박수 한번");
			}
			else {  
	        	b1 = (i/10) %3 == 0;  
	        	b2 = (i%10) %3 == 0;  
	             
	        	if ((i%10) == 0) 
	        		b2 = false;
	        	if (b1 && b2)
	        		System.out.println(i + " 박수 두번");
	        	else if (b1 || b2)
	        		System.out.println(i + " 박수 한번");
	        }
		}
			
		}
	}


