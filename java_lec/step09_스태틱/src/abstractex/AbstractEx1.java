package abstractex;
/*
class AA{ //일반클래스
	public void view1() {
	System.out.println("view1 method");	
	}
	
	public void view2() {
	System.out.println("view2 method");	
	}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view1()을 재정의 - 강제성은 없음
		
}
public class AbstractEx1 {
	public static void main(String[] args) {
		AA ob=new AA(); //객체 생성 가능
		ob.view1(); //view1
		ob.view2(); //view2
	
		AA ob2=new BB(); //ob2로 참조 변수를 만들어 후손객체 생성
		ob2.view1();
		ob2.view2();
		
	}
	

}*/
/*

//abstract : 미완성 상태를 의미한다라고 생각하면 된다
abstract class AA{ //추상 (미완성) 클래스
	abstract public void view1();
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view1()을 재정의 - 강제성은 있음
		
}
public class AbstractEx1 {
	public static void main(String[] args) {
	//	AA ob=new AA(); //객체 생성 불가능 (abstract, 즉 미완성 이기 때문)
	
	// 	ob.view1(); //view1
	//  ob.view2(); //view2
	
		AA ob2=new BB(); //ob2로 참조 변수를 만들어 후손객체 생성
		ob2.view1();
		ob2.view2();
		
	}
}
*/

abstract class AA{ //추상 (미완성) 클래스
	public void view1() {}; 
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AA클래스의 view1()을 재정의 - 강제성은 없음		
}
public class AbstractEx1 {
	public static void main(String[] args) {
	//	AA ob=new AA(); //객체 생성 불가능 (class는 여전히 미완성 이므로)
	//**abstract 는 관리의 측면에서 보통 사용한다.(강제성을 위해)**
	// 	ob.view1(); //view1
	//  ob.view2(); //view2
	
		AA ob2=new BB(); //ob2로 참조 변수를 만들어 후손객체 생성
		ob2.view1();
		ob2.view2();
	}
}
