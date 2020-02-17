package collection1;
//List : 서로다른 자료형의 연속된 기억공간, 중복혀용 O, 순서유지 O

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//리스트 에러 : 컴파일에는 이상 없으나 실행시에 형변환 문제 발생
public class ListError {
	@SuppressWarnings(value="unchecked") //type을 확인하지 않음

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>(); // <> = generic을 의미
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(new Integer(4));
		list.add("겨울");
		list.add(5.0f);
		list.add(4.0);
		
	//System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			String season=(String)list.get(i); //ClassCastException 발생
			System.out.println(season);
		}
	}
}