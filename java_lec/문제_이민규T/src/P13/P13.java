package P13;

public class P13 {
	/* 13. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�. */

public static void main(String[] args) {
	int sum=0;	
	for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum=sum+j;
			}
		}
		
}

}
