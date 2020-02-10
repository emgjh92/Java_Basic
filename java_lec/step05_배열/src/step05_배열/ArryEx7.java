package step05_배열;

public class ArryEx7 {
	public static void main(String[] args) {
		
		int [][] num=new int[3][4];
		num[0]=new int [] {10,20};
		num[1]=new int [] {30,40,50,60};
		num[2]=new int [] {70,80,90};

	for(int i=0; i<num.length; i++) // 외부의 for 문이 행 순회
	{
		for(int j=0; j<num[i].length; j++) // 내부의 for 문은 열 순회
		{
			System.out.print(num[i][j]+"\t"); 
			// 3행, 4열 식으로 직접 i,j 값을 넣을 경우 실제 할당값이 없어 Exception 발생한다.
			// ex. 1행 3열~1행 4열의 경우 값이 없다 ==> Exception 발생
		}
		System.out.println(" "); //줄 바꿈
		}
	}
}
