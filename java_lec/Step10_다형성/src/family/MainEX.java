package family;
/*
 *	이름 : 홍길동 
 *  아빠는 나가서 일을 한다
 *  
 *  이름 : 소청
 *  엄마는 집안일을 한다
 * 
 * 	이름 : 홍준표
 *  아들은 공부를 한다
 * 
 * 
 */
//인터페이스 사용 : 응집도 를 올리고, 결합도를 떨어트린다.

public class MainEX {

	public static void main(String[] args) {
		Father fa=new Father("홍길동");
		Mother ma=new Mother("소천");
		Son so=new Son("홍준표");
		
		System.out.println(fa);
		System.out.println(ma.toString());
		System.out.println(so);
		System.out.println("=====================================");
		Family [] family=new Family[] {
				new Father("홍길동"),
				new Mother("소천"),
				new Son("홍준표")
		};
		for(Family ob:family) {
			System.out.println(ob);
		}
		
		Family fa1=new Family("홍길동");
		System.out.println(fa1);
	}

}
