package collection2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class MapEx5 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		map.put("둘리","객실1");
		map.put("또치","객실2");
		map.put("마이콜","객실3");
		map.put("도우너","객실4");
		map.put("고길동","객실5");
	
		Scanner sc=new Scanner(System.in);
		System.out.print("방이름을 입력하세요 (객실1~5) : ");
		String room=sc.next();
		Set<String> keys=map.keySet();
		for(String key:keys) {
			String rom=map.get(key);
			
			if(rom.equals(room)) {
				System.out.println(room+"에 있는 사용자는 "+key+"입니다");
			}
		}
	}
}
