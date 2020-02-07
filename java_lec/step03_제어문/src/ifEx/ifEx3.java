package ifEx;
/*
 * a 변수에 55 또는 46을 대입한 후
 * 1. if 문을 이용하여 "55는 50보다 크거나 같다" 또는 "46은 50보다 작다"
 * 2. if~else문 이용 ==> a의 변수가 홀수인지 짝수인지 출력 ==> "55는 홀수입니다" 또는 "46은 짝수입니다"
 * 3. if~else~if문 이용, a의 값이 양수,음수,zero 인지 출력, "55는 양수입니다"...
 * */
public class ifEx3 {
	public static void main(String[] args) {
		int a = 0;
		if(a>=50)System.out.println(a+"은 50보다 크거나 같다");
		if(a<50)System.out.println(a+"은 50보다 작습니다.");
		
		if(a%2==0)System.out.println(a+"은 짝수입니다");
		else System.out.println(a+"은 홀수입니다");
		
		if(a>0)System.out.println(a+"은 양수입니다");
		else if(a<0)System.out.println(a+"은 음수입니다");
		else System.out.println(a+"은 ZERO 입니다");
	}
}
