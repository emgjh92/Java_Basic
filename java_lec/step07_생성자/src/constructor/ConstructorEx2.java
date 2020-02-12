/*
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { //default constructor //4번째로 호출
		System.out.println("default constructor");
	}
	public ConstructorEx2(String str){
		this(); //3번쨰로 호출
		System.out.println(str+" constructor"); //5번째로 호출
	}
	public ConstructorEx2(String str, int n) {
		this();		//default constructor 를 불러오는것 //2번째로 호출
		System.out.println(str+" "+n+" constructor"); //6번째로 호출
	}

	public static void main(String[] args) {
		new ConstructorEx2("가나다",10); //1번째로 호출 //7번째로 돌아옴
		
	}
}
*/
/*
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { 
		this("가나다",10); //2번째로 호출
		System.out.println("default constructor"); // 6번째로 호출
	}
	public ConstructorEx2(String str){
		System.out.println(str+" constructor"); // 4번째로 호출
	}
	public ConstructorEx2(String str, int n) {
		this(str); // 3번째로 호출	
		System.out.println(str+" "+n+" constructor"); // 5번째로 호출
	}

	public static void main(String[] args) {
		new ConstructorEx2(); // 1번째로 호출
		new ConstructorEx2("ㅇㅇㅇ"); // 7번째로 호출
	} 
}
*/
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { 
		System.out.println("default constructor"); // 4
	}
	public ConstructorEx2(String str){
		this(str,10); //2
		System.out.println(str+" constructor"); //6
	}
	public ConstructorEx2(String str, int n) {
		this(); //3
		System.out.println(str+" "+n+" constructor"); //5
	}

	public static void main(String[] args) {
		new ConstructorEx2("가나다"); // 1
		new ConstructorEx2("ㅇㅇㅇ"); // 7
	} 
}