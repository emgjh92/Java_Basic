package P21;

public class P21 {
public static void main(String[] args) {
	//21.1~10000사이에 8이 몇번 나오는가?
	
	int count=0;
	
	for(int i=1; i<10000; i++) {
		if(i%10 == 8){
			count +=1;
		}
		if((i/10) %10 == 8){
			count +=1;
		}
		if((i/100) %10 == 8){
			count +=1;
		}
		if((i/1000) %10 == 8){
			count +=1;
		}

	
		}
	System.out.println(count);
	}


}

