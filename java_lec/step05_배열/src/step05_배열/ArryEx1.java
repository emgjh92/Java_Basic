package step05_배열;
//1차원 배열
//String name="홍길동"

//배열 : 동일한 자료형의 연속된 기억공간

public class ArryEx1 {
public static void main(String[] args) {
	int[] num=new int[5]; //new 연산자 : 객체생성 ---참조자료형 (원본 데이터에 엑세스 가능)
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	
	for(int i=num.length-1; i>=0; i--) {
		
		System.out.println(num[i]);
	}
	
	//향상된 for문을 이용하여 출력하세요
	for(int n : num) { // 10 20 30 40 50
		System.out.printf("%d ",n); 

	}
}

}
