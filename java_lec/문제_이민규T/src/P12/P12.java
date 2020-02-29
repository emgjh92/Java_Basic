package P12;

public class P12 {
	/*12. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
	            몇까지 더해야 총합이 100이상이 되는지 구하시오.*/
	public static void main(String[] args) {
		int sum=0;
		int i=1;
	while(sum<=100) {
			if(i%2==0) {i=i*(-1); sum=sum+i; System.out.println(i+"를 더함"); i=i*(-1);}
			else {sum=sum+i;System.out.println(i+"를 더함");}
			i++;
	}
		System.out.println("result : "+(i-1)+"까지 더했을 때 합이"+sum+"으로 된다");
	}
}
