package step05_배열;

public class ArryEx6 {
	public static void main(String[] args) {
		
		int [][] num=new int[][] {
								 {10,40,70,100},
								 {20,50,80,110},
								 {30,60,90,120}
								 };
								 
	for(int i=0; i<num.length; i++) // 외부의 for 문이 행 순회
	{
		for(int j=0; j<num[i].length; j++) // 내부의 for 문은 열 순회
		{
			System.out.print(num[i][j]+"\t");
		}
		System.out.println(" "); //줄 바꿈
	}
}
}
