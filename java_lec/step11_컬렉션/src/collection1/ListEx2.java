package collection1;
//List : 서로다른 자료형의 연속된 기억공간, 중복혀용 O, 순서유지 O

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
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
		
		for(Object ob:list) {
			System.out.println(ob);
		}
		
		list.remove("second");
		Iterator iter=list.iterator();
				while(iter.hasNext())
					System.out.println(iter.next());
	}
}