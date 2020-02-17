package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : 중복허용 x, 순서유지 x
public class SetEx {
	@SuppressWarnings(value="unchecked") //type을 확인하지 않음
	public static void main(String[] args) {
		//Set<Integer> set = new HashSet<Integer>(); //generic 표현 (이 경우 integer 빼곤 전부 오류가 난다)
		Set set = new HashSet();
		set.add("one"); //객체형이면 대입 가능 add(Object)
		set.add(2);		//int==>new Integer(2) : 기본형 =>객체형(Boxing)
		set.add(new Float(3.0f));
		set.add(4.00);  //double -> new Double(4.00)
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00));
	//  set.add(Integer.valueOf(2)); //최신 방법론
		
		Iterator iter=set.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
