package methodex;

public class MethodEx5 {
	public static void show1() { //call by value (값에 의한 전달)
		System.out.println("안녕하세요");
		return; //생략가능 
	} // ***실 매계 변수***
	
	public static String show3() {
		return "hello";
	}
	
	private static void show2(char c, int i) {
		System.out.println("타입 : "+c);
		System.out.println("코드 : "+i);
	}
	public static float show4(int a, int b, int c) {
		
		return (a+b+c)/3.0f; 
		
	}
	
	public static void main(String[] args) { //call by reference (참조에 의한 전달)
		show1(); 																    //----
		show2('A',25);																//   : 	***형식 매계변수***	
		String s=show3(); System.out.println("show3의 리턴값 : "+s);					//	 :
		float k=show4(15, 45, 77); System.out.printf("show4의 리턴값 : %.2f\n",k);		//----
	}

}

