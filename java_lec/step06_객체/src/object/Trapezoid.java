package object;
/*
 * -base : int
 * -top : int
 * -height : int
 * 
 * +setTrapezoid(base:int, top:int, height:int):void
 * +calc():double <-- 사다리꼴의 넓이를 구해서 리턴 (아랫변 + 윗변 )*높이 / 2.0
 * +toString():String
 * 
 */
public class Trapezoid {
	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base=base;
		this.top=top;
		this.height=height;
	}

	public int getBase() {
		return base;
	}

	public int getTop() {
		return top;
	}

	public int getHeight() {
		return height;
	}

	public double calc() {
		return (((base+top)*height)/2.0);
	}
	
	public String toString() {
		return "넓이 : "+calc();
	}
	
}
