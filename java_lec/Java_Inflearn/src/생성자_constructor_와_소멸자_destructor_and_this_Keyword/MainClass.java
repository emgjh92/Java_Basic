package 생성자_constructor_와_소멸자_destructor_and_this_Keyword;

public class MainClass {

	public static void main(String[] args) {
		
		// 디폴트 생성자
		ObjectEx obj1 = new ObjectEx();
		
		System.out.println();
		
		// 사용자 정의 생성자
		ObjectEx obj2 = new ObjectEx(10);
		
		int arr[] = {10, 20, 30};
		ObjectEx obj3 = new ObjectEx("Java", arr);
		
		
		// 소멸자
		ObjectEx obj4; 
		
		obj4 = new ObjectEx();
		obj4 = new ObjectEx();
		
		System.gc(); //garbage collector 호출
		
		// this 키워드
		int ints[] = {10, 20, 30};
		ObjectEx obj5 = new ObjectEx(10, "Java", ints); 
	}

}
