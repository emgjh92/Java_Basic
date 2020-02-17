package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;
	
	public SubTest() {
		super();
	}
	
	public SubTest(String name, String addr, int age, double score) {
		super(name,addr);

		this.age=age;
		this.score=score;
	}

	@Override
	public String toString() {
			
			return super.toString()+"\n"+"나이는 "+age+"세 이고 점수는 "+score+" 입니다";
		}
	
	public static void main(String[] args) {
		SubTest ob=new SubTest("크롱", "강남", 23, 85.4);
		//이름은 크롱이고 사는 곳은 강남 입니다.
		//나이는 23세이고 점수는 85.4점 입니다.
		System.out.println(ob.toString());
	}
	
}
