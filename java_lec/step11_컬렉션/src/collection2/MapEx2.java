package collection2;

import java.util.HashMap;
import java.util.Map;
//import java.util.*; //==> util 안에 있는 패키지를 사용 시 이런식으로 적어도 된다.

public class MapEx2 {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("해리포터", Integer.valueOf(95));
		map.put("론", Integer.valueOf(75));
		map.put("헤르미온느", Integer.valueOf(85));
		map.put("말포이", Integer.valueOf(88));
		map.put("지니", Integer.valueOf(93));
		map.put("네빌롱바텀", Integer.valueOf(66));
		map.put("해리포터", Integer.valueOf(85)); //해리포터가 중복 되므로 덮어쓰기 발생
		map.put(null, Integer.valueOf(95));
		map.put(null, Integer.valueOf(95)); // 키에 null 허용
		map.put("볼드모트", null); //값에 null 허용
		
		System.out.println(map);
		
		Integer num=map.get("말포이");
		System.out.println("말포이 성적은?"+num);
		
		 int n=num.intValue();
		System.out.println(n); //이런 과정을 UnBoxing 이라 부른다. 
		
		int n2=new Integer(num); //오토 언박싱
		System.out.println(n2); 
		
		}
}
	