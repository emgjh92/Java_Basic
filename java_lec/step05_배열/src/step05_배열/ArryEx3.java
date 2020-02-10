package step05_배열;
// $java ArryEx3 abcd 가나다 123 12345
public class ArryEx3 {
	public static void main(String[] args) {
	System.out.println("args의 길이 : "+args.length);
	
	for(int i=0; i<args.length; i++) {
		System.out.println("args["+i+"] : " +args[i]);
		System.out.println("args["+i+"]의 크기 : " +args[i].length());
		System.out.println();
		}
//==========향상된 for 문으로 출력해보세요==========================
	
	for(String i:args) {
		
		System.out.println(i);
		System.out.println(i.length()+"\n");
		
		}
	}
}
