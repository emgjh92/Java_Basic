package P3;

public class P3 {
	public static void main(String[] args) {
		/*
		3.

		for 문을 이용해서 

		1부터 76까지의 합을 구하는 코드를 작성하자.
		*/
		int sum=0;
		for(int i=1; i<=76; i++) {
			//System.out.println(sum+"더하기"+i);
			sum=sum+i;
		}
		System.out.println("result is "+sum);
	}
}
