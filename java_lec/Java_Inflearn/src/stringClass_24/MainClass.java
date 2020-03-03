package stringClass_24;

public class MainClass {

	public static void main(String[] args) {
		
		// String
//		String str = "java";
		String str = new String("java");
		str = str + " world";
		System.out.println("str : " + str);
		//!!!!!"java"�� "java world"�� �ּҰ��� ���� �ٸ���!!!!!
		
		System.out.println();
		
		// StringBuffer
		StringBuffer sf = new StringBuffer("java");
		System.out.println("sf : " + sf);
		
		System.out.println("sf.length() : " + sf.length());
		
		sf.append(" world");//���ڿ� �̾� ���̱�
		System.out.println("sf : " + sf);
		sf.insert(4, "~~~~"); //���ڿ� �߰��� ����
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
		 * StringBuffer �� StringBuilder�� �̿��� ��� ���ڿ��� ������ �� �ص� 
		 * ���ο� �ּҰ����� ���� ������ �ƴ� ���� �ּ����� ��Ȱ�� �ؼ� �̾� ���̴� ����̹Ƿ� 
		 * �޸� ȿ���� ����
		 *  */
	}
	
}
