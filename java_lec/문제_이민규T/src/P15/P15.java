package P15;

public class P15 {
public static void main(String[] args) {
	
/*	15.������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10 �̴�.*/
	for(int i=0; i<=10; i++) {
		for(int j=0; j<=10; j++) {
			if(2*i+4*j==10) System.out.println(i+" "+j);
		}	
	}
	
	}
}
