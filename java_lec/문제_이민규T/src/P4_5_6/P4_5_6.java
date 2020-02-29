package P4_5_6;

public class P4_5_6 {
	public static void main(String[] args) {
		//4.구구단 7단을 출력해보자

		int ga = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga+"x"+i+"="+(ga*i));
		}	
		System.out.println("=======================================");
		//5.구구단을 출력해보자
		int ga2 = 1;
		while(ga2<10) {
		for(int i=1; i<=9; i++) {
			System.out.println(""+ga2+"x"+i+"="+(ga2*i));
		}
		ga2++;}
		System.out.println("=======================================");

		//6.구구단을 출력을 하되 7단과 6단을 제외하고 출력하자.
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
