package methodex;
// Call by reference : 참조에 의한 전달, 참조 주소 전달
// 객체 자료형에서 사용, 클래스, 열거형, 배열, 인터페이스

public class MethodEx7 {
	public static void view1(String str) {
		System.out.println("view1의 변경 전 str :"+str);
		str="가나다";
		System.out.println("view1의 변경 후 str :"+str);
		
	}
	public static void view2(int[] num) {
		for(int n:num) {
			System.out.println("변경 전 view2의 num : "+n);
		}
		//System.out.println();
		num[2]=300;
		for(int n:num) {
			System.out.println("변경 후 view2의 num : "+n);
		}
	}
	//C 언어 배열 --> 포인터, 포인터 --> 베열
	//	char* test[] --> 배열 포인터
	//  char** test[] --> 2차원 배열
	
	public static void main(String[] args) {

	String str="happy";
	System.out.println("호출 전 메인의 str :"+str);
	view1(str); //함수호출
	System.out.println("호출 후 메인의 str :"+str);
	System.out.println("============================");
	
	
	int [] num = {10,20,30,40,50};
	for(int n:num) {
		System.out.println("호출 전 메인의 num :"+n);
		}
	view2(num);
	for(int n:num) {
		System.out.println("호출 후 메인의 num :"+n);
		}
	//====> 최종적으로 num[2] 의 값이 바뀐것을 확인 가능하다.
	}
}
