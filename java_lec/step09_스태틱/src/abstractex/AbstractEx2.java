package abstractex;

abstract class Shape{
	abstract public void onDraw();
	abstract public void onDelete();	
}
//------------------------------------------------------------
class Rectangle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("사각형을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("사각형을 지운다");
	}
	
}
class Circle extends Shape{

	@Override
	public void onDraw() {
		System.out.println("원을 그린다");
	}

	@Override
	public void onDelete() {
		System.out.println("원을 지운다");
	}
	
}

public class AbstractEx2 {
	public static void main(String[] args) {
		//정적 바인딩
		System.out.println("~~~~~~~~~정적 바인딩~~~~~~~~~~~~~");
		Rectangle ob1=new Rectangle();
		ob1.onDraw();
		ob1.onDelete();
		Circle ob2=new Circle();
		ob2.onDraw();
		ob2.onDelete();
	
	
		//동적 바인딩 (메모리 상에 관계있는 것 끼리 연결 시켜 주는 것)
		System.out.println("\n~~~~~~~~~동적 바인딩~~~~~~~~~~~~~");
		Shape sh=null;
		sh=new Rectangle();
		sh.onDraw();
		sh.onDelete();
		sh=new Circle();
		sh.onDraw(); 
		sh.onDelete();
	}
}
