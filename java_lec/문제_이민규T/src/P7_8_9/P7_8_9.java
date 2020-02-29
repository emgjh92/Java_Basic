package P7_8_9;

public class P7_8_9 {
	public static void main(String[] args) {
		//7. 863은 소수 인가?

		System.out.println("863은 소수 인가?");
		int num=863;
		int flag=0;
		for(int i=1; i<=863; i++) {
			if(num%i==0) flag++;
			if(num%i==863) flag++;
		}
		
		if(flag==2) {
			System.out.println("863은 소수이다.");
		}
		System.out.println("=======================================");
		
		//8. 2~100사이의 소수를 구해보자

		int flag2=0;
		int num2=2;
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(num2%j==0) flag2++;
			}
		
		if(flag2==2) System.out.println(num2+" is 소수");
		num2++; flag2=0;
		}
		System.out.println("=======================================");
		
		//9. 1부터 200까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				if(i%3!=0){
					sum=sum+i;
				}
			}
		}
		System.out.println("합계 : "+sum);
		
		}
	
		
		
	}
