package P19;

public class P19 {
public static void main(String[] args) {
	/*
	19.
	별찍기 문제
	다음과 같이 출력해보자

	*
	**
	***
	****
	*****
	*/
	for(int i=0; i<5; i++) { 
		for(int j=0; j<=i; j++) { 
			System.out.print('*'); 
			} 
		System.out.println(); 
		}

	}
}
