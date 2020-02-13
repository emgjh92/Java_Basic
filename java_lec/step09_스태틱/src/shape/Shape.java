package shape;
/*
 * -x : int
 * -y : int
 * +Shape()
 * +Shape(x:int, y:int)
 * +setter & getter
 * +getSize():double
 * 
 * */
public class Shape {
	private int x;
	private int y;
	
	public Shape() {
		
	}
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public double getSize() {
		return 0.0; //오버라이딩 할거니 초기값으로 해준다
	}
	
}
