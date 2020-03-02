package Object_And_Memory;

public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass();
		ObjectClass obj2 = new ObjectClass();
		ObjectClass obj3 = new ObjectClass();
		
		System.out.println();
		
		System.out.println("obj1 ----> " + obj1);
		System.out.println("obj2 ----> " + obj2);
		System.out.println("obj3 ----> " + obj3);
		
		System.out.println();
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		
		if(obj2 == obj3) {
			System.out.println("obj2 == obj3");
		} else {
			System.out.println("obj2 != obj3");
		}
		
		if(obj1 == obj3) {
			System.out.println("obj1 == obj3");
		} else {
			System.out.println("obj1 != obj3");
		}
		
		System.out.println();
		
		System.out.println("obj1 ----> " + obj1);
		obj1.getInfo();
		
		obj1 = null;
		System.out.println("obj1 ----> " + obj1);
		obj1.getInfo(); 
		/*Exception in thread "main" java.lang.NullPointerException
		at Object_And_Memory.MainClass.main(MainClass.java:44)*/
		
	}
	
}
