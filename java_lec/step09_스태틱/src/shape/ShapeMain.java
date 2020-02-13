package shape;

public class ShapeMain {
	public static void main(String[] args) {
		//정적 바인딩
		System.out.println("~~~~~~~~~정적 바인딩~~~~~~~~~~~~~");
		Rectangle ob1=new Rectangle(4,5);
		System.out.println("사각형의 넓이 : "+ob1.getSize()); //20
		
		Triangle ob2=new Triangle(3,7);
		System.out.println("삼각형의 넓이 : "+ob2.getSize()); //10.5
	
		//동적 바인딩 (메모리 상에 관계있는 것 끼리 연결 시켜 주는 것)
		System.out.println("\n~~~~~~~~~동적 바인딩~~~~~~~~~~~~~");
		Shape sh=null;
		sh=new Rectangle(4,5);
		System.out.println("사각형의 넓이 : "+sh.getSize());
		
		sh=new Triangle(7,3);
		System.out.println("사각형의 넓이 : "+sh.getSize());
	}
}
