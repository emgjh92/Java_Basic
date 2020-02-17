package objectArry;

public class UserEx1 {
	public static void main(String[] args) {
		User ob1=new User("kim","010-123-4567");
		User ob2=new User("lee","010-123-4567");
		User ob3=new User("park","010-123-4567");
		System.out.println(ob1.getName()+"\t"+ob1.getPhone());
		System.out.println(ob2.getName()+"\t"+ob2.getPhone());
		System.out.println(ob3.getName()+"\t"+ob3.getPhone());
	}
}
