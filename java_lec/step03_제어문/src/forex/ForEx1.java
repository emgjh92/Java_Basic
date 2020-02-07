package forex;
// for(초기값; 조건식; 증감식) {}==> for(int i=0; i<10; i++){}
public class ForEx1 {

public static void main(String[] args) {
	//A B C ... Y Z
	char alpha='A';
	
	for(int i=100; i>=80; i-=3)
	{
		System.out.print(i+" ");
	}
	System.out.println(" ");
	for(char i='A'; i<='Z'; i++)
	{
		System.out.print(i+" ");
	}
	System.out.println(" ");
	for(int i=1; i<=26; i++)
	{
		System.out.print(alpha+" ");
		alpha+=1;
	}
	
	
	/*
	int sum=0, odd=0, even=0;

	
	for(int i=1; i<=10; i++){
		sum+=i;
		}
	for(int i=1; i<=10; i++) {
		odd=odd+i; 
		switch(i%2) {
		case 1 : odd+=i; break;
		case 0 : even+=i; break;
		}
	}

	System.out.println("합계 : "+sum);
	System.out.println("홀수합 : "+odd);
	System.out.println("짝수합 : "+odd);
*/
	}
}
