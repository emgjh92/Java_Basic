package JavaWorkshop_4_3;
//2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오. 
public class JavaWorkshop43 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5}, 
				{10,10,10,10,10}, 
				{20,20,20,20,20}, 
				{30,30,30,30,30} 
				};
		double average=0;
		int total=0;
		
		for(int i=0; i<arr2.length; i++) 
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				total=total+arr2[i][j];
			}
		}
		average=(double)total/(arr2.length*arr2[0].length);
		System.out.println("total = "+total);
		System.out.println("average = "+average);
		}
}
