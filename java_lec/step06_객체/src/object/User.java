package object;
/*
 *  - (private)     + (public)    # (protected)
 * 
 *  +name:String
 *  +k:int
 *  +e:int
 *  +m:int
 *  
 *  +setUser(name:String, k:int, e:int, m:int) : void
 *  +getTotal():int
 *  +getUser():String 		//겟 유저는 겟토탈 호출
 *  
 */
class User {
	public String name;
	public int k;
	public int e;
	public int m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name=name;
		this.k=k;
		this.e=e;
		this.m=m;
		
	}
	public int getTotal() {
		
		return k+e+m;
	}
	public String getUser() {
		//이름은 진달래 이고, 총점은 231점 입니다.
		return "이름은 "+name+"이고, 총점은"+getTotal()+"점 입니다";
		
	}

}
