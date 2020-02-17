/*
package inheritance;

class Branch{
	public Branch() {
		System.out.println("Branch default constructor"); //4
	}
	public Branch(String str){
		this();//3
		System.out.println(str+" Branch constructor");  //5
	}
}
class Leaf extends Branch{
	public Leaf() {
		super("hi~"); //2
		System.out.println("Leaf default consturctor"); //6
		
	}
	
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf(); //1,7
	}
}
*/


package inheritance;

class Branch{
	public Branch() {
		System.out.println("Branch default constructor"); //5
	}
	public Branch(String str){
		this();//4
		System.out.println(str+" Branch constructor");  //6
	}
}
class Leaf extends Branch{
	public Leaf() {
		super("hi~"); //3
		System.out.println("Leaf default consturctor"); //7
		
	}
	public Leaf(String str, int n) {
		this(); //2
		System.out.println(str+" "+n+" Leaf constructor");//8
	}
	
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf("°¡³ª´Ù", 10); //1
		System.out.println("¤·¤·¤·");//9
	}
}
