package shape;
/*
 * +Triangle()
 * +Triangle(x:int, y:int)
 * +getSize():double 
 * */
public class Triangle extends Shape{
	public Triangle() {
		super();
	}
	public Triangle(int x, int y) {
		super(x,y);
	}
	
	@Override
	public double getSize() {
		return (super.getX()*super.getY())/2.0;
		//혹은 return getX*getY/2.0 도 가능
	}
}
