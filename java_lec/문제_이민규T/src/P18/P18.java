package P18;

public class P18 {
public static void main(String[] args) {
	/*18.�ڿ��� 1���� �����ؼ� ��� Ȧ���� 3�� ����� ¦���� ���� ������. 
	 * �� ���� ����(���� ������ ��) 1000�� �Ѿ���� , 
	 * �׸��� 1000�� �Ѿ ���� �󸶰� �Ǵ��� ����Ͽ� ����ϴ� ���α׷��� �ۼ��� ����.
	 */
	int i = 1;
	int sum=0;
	while(sum<1000) {
		if(i%2!=0||(i%3==0&&i%2==0)) {
			sum=sum+i;
			System.out.println(i+"�� ���ؼ� "+sum);
		}
		
		i++;
		
	}
}
}
