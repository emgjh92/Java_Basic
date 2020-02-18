package test;
//비즈니스 로직 (데이터 베이스 연동 처리)

public class UserProc {
	/*
	 * 매개변수로 들어온 pororo, 1234 를 비교하여
	 * 맞으면 entity 객체를 만들어서 
	 * setter를 통해 id, pw, "뽀로로", 89.97을 대입 하세요
	 * entity 리턴 
	 */
	
	public User getLoginUser(String id, String pw) {
		User entity=null; //아래 조건을 만족하지 않으면 null 값을 가지도록 한다.
		//이런식으로 분리해서 선언을 해야 잘못된 값이라도 '빈 객체'가 return 되기 때문에 
		//분리해서 선언하는 것이 정형화 되어 있다.
		if(id.equals("pororo")&&pw.equals("1234")) {
			entity=new User();
			entity.setId("pororo"); entity.setPw("1234"); 
			entity.setName("뽀로로"); entity.setPoint(89.97);
			return entity;
		}
		return null;
	}
}
