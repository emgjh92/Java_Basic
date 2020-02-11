package test15;
/*
 * -base:double
-height:double
+setData(base:int, height:int):void
+getSize():double
+getView():String
 * */
public class Triangle {
	private double base;
	private double height;
	
	public void setData(int base, int height) {
		this.base=base;
		this.height=height;
	}
	public double getSize() {
		return (base * height)/2;
	}
	public String getView() {
		return "»ï°¢ÇüÀÇ³ĞÀÌ : " + getSize();
	}
}
