package OOP;

public class Bicycle {

	String color;
	int price;
	
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}//생성자(constructor) - (클래스가 호출될때 가장 먼저 실행되는 부분)
	
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor - II");
		
		color = c;
		price = p;
	}
	
	public void info() {
		System.out.println("-- info --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
