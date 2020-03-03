package stringClass_24;

public class MainClass {

	public static void main(String[] args) {
		
		// String
//		String str = "java";
		String str = new String("java");
		str = str + " world";
		System.out.println("str : " + str);
		//!!!!!"java"와 "java world"의 주소값은 서로 다르다!!!!!
		
		System.out.println();
		
		// StringBuffer
		StringBuffer sf = new StringBuffer("java");
		System.out.println("sf : " + sf);
		
		System.out.println("sf.length() : " + sf.length());
		
		sf.append(" world");//문자열 이어 붙이기
		System.out.println("sf : " + sf);
		sf.insert(4, "~~~~"); //문자열 중간에 삽입
		System.out.println("sf : " + sf);
		sf.insert(sf.length(), "!!");
		System.out.println("sf : " + sf);
		sf.delete(4, 8);
		System.out.println("sf : " + sf);
		sf.delete(sf.length()-2, sf.length());
		System.out.println("sf : " + sf);
		sf.deleteCharAt(4);
		System.out.println("sf : " + sf);
		
		System.out.println();
		
		// StringBuilder
		StringBuilder sd = new StringBuilder("java");
		sd.append(" world");
		System.out.println("sd : " + sd);
		
		System.out.println("sd.length() : " + sd.length());
		
		sd.append(" world");
		System.out.println("sd : " + sd);
		sd.insert(4, "~~~~");
		System.out.println("sd : " + sd);
		sd.insert(sd.length(), "!!");
		System.out.println("sd : " + sd);
		sd.delete(4, 8);
		System.out.println("sd : " + sd);
		sd.delete(sd.length()-2, sd.length());
		System.out.println("sd : " + sd);
		sd.deleteCharAt(4);
		System.out.println("sd : " + sd);
		
		/*
		 * StringBuffer 와 StringBuilder를 이용할 경우 문자열에 조작을 가 해도 
		 * 새로운 주소값에서 새로 참조가 아닌 기존 주소지를 재활용 해서 이어 붙이는 방식이므로 
		 * 메모리 효율이 좋다
		 *  */
	}
	
}
