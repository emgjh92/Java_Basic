package P4_5_6;

public class P4_5_6 {
	public static void main(String[] args) {
		//4.������ 7���� ����غ���

		int ga = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga+"x"+i+"="+(ga*i));
		}	
		System.out.println("=======================================");
		//5.�������� ����غ���
		int ga2 = 1;
		while(ga2<10) {
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga2+"x"+i+"="+(ga2*i));
		}
		ga2++;}
		System.out.println("=======================================");

		//6.�������� ����� �ϵ� 7�ܰ� 6���� �����ϰ� �������.
		int ga3 = 1;
		while(ga3<10) {
			if(ga3!=7) {
				if(ga3!=6) {
				for(int i=1; i<=9; i++) {
					System.out.println(""+ga3+"x"+i+"="+(ga3*i));
				}
				}
		}
		ga3++;}
	}
}
