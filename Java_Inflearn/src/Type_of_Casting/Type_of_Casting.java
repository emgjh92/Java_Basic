package Type_of_Casting;

public class Type_of_Casting { //4강_기본자료형
	public static void main(String[] args) {
				//자동(묵시적) 형 변환:
				//작은 공간의 메모리에서 큰 공간의 메모리로 이동
				byte by = 10; //1byte
				int in = by; //4byte
				System.out.println("in = " + in);
				
				//명시적 형 변환:
				//큰 공간의 메모리에서 작은 공간의 메모리로 이동
				int iVar = 100; //int형 : 4byte
				byte bVar = (byte)iVar; //byte형 : 1byte
				System.out.println("bVar = " + bVar);
				
				iVar = 123456;
				bVar = (byte)iVar;
				System.out.println("bVar = " + bVar);
		
	}
}
