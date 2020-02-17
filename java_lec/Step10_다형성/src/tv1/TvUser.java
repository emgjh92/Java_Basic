package tv1;
//결합도가 높은 코드

public class TvUser {
	public static void main(String[] args) {
		String com=args[0];
		if(com.equals("LG")||com.equals("lg")) { //com=="LG"
			LgTv tv=new LgTv();
			tv.turnOn();
			tv.volumeUp();
			tv.volumeDown();
			tv.turnOff();
		}else if(com.contentEquals("SAMSUNG")){
			SamsungTv tv=new SamsungTv();
			tv.powerOn();
			tv.soundUp();
			tv.soundDown();
			tv.powerOff();
		}else {
			System.out.println("error");
		}
	}
}

