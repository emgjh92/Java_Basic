package methodex;

public class MethodEx2 {
	public static int view1() {
		
		return 10;
	}
	public static char view2() {
		
		return 'A';
	}
	public static float view3() {
		
		return 50.3f;
	}
	public static String view4() { 
		
		return "hello";
	}
	public static String view5() {
		
		return "100.4";
	}
	public static boolean view6() {
		
		return false;
	}
	public static void main(String[] args) {
		int a= view1(); System.out.println(a);
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c); //or System.out.println(view3());
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
	}
}
