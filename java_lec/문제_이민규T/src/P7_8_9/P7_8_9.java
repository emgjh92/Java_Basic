package P7_8_9;

public class P7_8_9 {
	public static void main(String[] args) {
		//7. 863�� �Ҽ� �ΰ�?

		System.out.println("863�� �Ҽ� �ΰ�?");
		int num=863;
		int flag=0;
		for(int i=1; i<=863; i++) {
			if(num%i==0) flag++;
			if(num%i==863) flag++;
		}
		
		if(flag==2) {
			System.out.println("863�� �Ҽ��̴�.");
		}
		System.out.println("=======================================");
		
		//8. 2~100������ �Ҽ��� ���غ���

		int flag2=0;
		int num2=2;
		
		for(int i=1; i<=100; i++) {
			for(int j=1; j<=100; j++) {
				if(num2%j==0) flag2++;
			}
		
		if(flag2==2) System.out.println(num2+" is �Ҽ�");
		num2++; flag2=0;
		}
		System.out.println("=======================================");
		
		//9. 1���� 200������ ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.

		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2!=0) {
				if(i%3!=0){
					sum=sum+i;
				}
			}
		}
		System.out.println("�հ� : "+sum);
		
		}
	
		
		
	}
