package constructor;

public class Member {
		private String name;
		private int age;
		
		public Member() {
		// default 생성자 
		//이게 없으면 ConstructorEx7 의 Member ob2=new Member(); 이 오류가 난다.
	
			name="패티";
			age=22;
		}
		public Member(String name, int age) { //생성자
			this.name=name;
			this.age=age;
		}
		public void view() {
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
		}
		
}
