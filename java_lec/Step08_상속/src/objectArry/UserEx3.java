package objectArry;
//오브젝트 배열 -2

public class UserEx3 {
	public static void main(String[] args) {
		User[] ob=new User[] {
				new User("kim","010-123-4567"),
				new User("lee","010-123-4567"),
				new User("park","010-123-4567")
		};
		
		
		for(User m:ob) { //향상된 for문
		 System.out.println(m.getName()+"\t"+m.getPhone());
		} //Object Arry                  
	}
}
