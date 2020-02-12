package JavaWorkshop_4_1;

public class JavaWorkshop41 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int sum=0;
		double avg=0;
		
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		
		System.out.println("sum = "+sum);
		System.out.printf("avg = %.0f",avg);
	}
}
