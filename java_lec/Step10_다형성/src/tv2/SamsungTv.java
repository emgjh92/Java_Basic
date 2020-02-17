package tv2;

public class SamsungTv implements Tv {
	public void turnOn() {
		System.out.println("Samsung TV-전원을 켠다");
	}
	public void turnoff() {
		System.out.println("Samsung TV-전원을 끈다");
	}
	public void soundUP() {
		System.out.println("Samsung TV-소리를 높인다");
	}
	public void soundDown() {
		System.out.println("Samsung TV-소리를 줄인다");
	}
	@Override
	public void powerOn() {
	}
	@Override
	public void powerOff() {
	}
	@Override
	public void soundUp() {
	}
}
