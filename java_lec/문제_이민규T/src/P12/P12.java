package P12;

public class P12 {
	/*12. 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, 
	            ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.*/
	public static void main(String[] args) {
		int sum=0;
		int i=1;
	while(sum<=100) {
			if(i%2==0) {i=i*(-1); sum=sum+i; System.out.println(i+"�� ����"); i=i*(-1);}
			else {sum=sum+i;System.out.println(i+"�� ����");}
			i++;
	}
		System.out.println("result : "+(i-1)+"���� ������ �� ����"+sum+"���� �ȴ�");
	}
}
