package ifEx;

public class ifEx1 {

	public static void main(String[] args) {

		int score0=90;
		char grade0='\0';
		
		if(score0>=90 && score0<=100) grade0='A';
		if(score0>=80 && score0<=90) grade0='B';
		if(score0>=70 && score0<=80) grade0='C';
		if(score0>=60 && score0<=70) grade0='D';
		if(score0>=0 && score0<=60) grade0='F';

		System.out.println("점수는 "+ score0+ "점이고, 학점은"+grade0+"입니다");
//==========================================================================
		//if~else~if문
		int jumsu=95;
		char grade;
		
		if(jumsu>=90) grade='A';
		else if(jumsu>=80) grade='B';
		else if(jumsu>=70) grade='C';
		else if(jumsu>=60) grade='D';
		else grade='F';
		
		System.out.println("점수는 "+ jumsu+ "점이고, 학점은"+grade+"입니다");
//=======================================================		
		
		//if~else 문
		int score=45;
		if(score>=60) {
			System.out.println("합격");
			System.out.println("점수는 "+score+"점 입니다.");
		}
		else
		{
			System.out.println("불합격");
			System.out.println("점수는 "+score+"점 이며, 다음 기회에....");
		}
//=======================================================		
		String str="korea";
		
		if(str=="korea") {
			System.out.println("대한민국");
		}
		System.out.println("********");
	

	}

}
