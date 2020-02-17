package interfaceex; 

interface Cryable { //abstract 와 같이 강제적으로 재정의를 해야된다는 특성이있음.
	
	public void cry();
}

interface Flyable {
	
	public void fly();
}

class Eagle implements Flyable, Cryable {

	@Override
	public void fly() {
		
		System.out.println("독수리는 날아다녀요~"); //
		
	}
	@Override
	public void cry() {
			
			System.out.println("까악~까악~"); //
		
		}
		
	}
	


public class InterfaceEx2 {

	public static void main(String[] args) {

		Eagle eg = new Eagle();
		eg.fly();
		eg.cry();
		
//		new Eagle().fly(); // (?)
		
		
	}

}

//------------------------------------------추상클래스

//abstract class Cryable {
//	
//	abstract public void cry();
//}
//
//abstract class Flyable {
//	
//	abstract public void fly();
//}
//
//class Eagle extends Flyable {
//
//	@Override
//	public void fly() {
//		
//		System.out.println("독수리는 날아다녀요~"); //2
//		new CryableEx().cry(); //3
//		
//	}
//	
//	class CryableEx extends Cryable { 
//		
//		@Override
//		public void cry() {
//			
//			System.out.println("까악~까악~"); //4
//		
//		}
//		
//	}
//	
//}
//
//public class InterfaceEx2 {
//
//	public static void main(String[] args) {
//
//		new Eagle().fly(); //1
//		
//	}
//
//}
