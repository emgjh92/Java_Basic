package 문제;
/*
 * [문제14]다음 2개의 파일을 만들어 프로그램을 만드시오
(1) package명은 test14로 하고 Emp.java   EmpEx.java파일을 만드시오
(2) 파일명 : Emp  --main()포함 X
+name:String
+age:int
+tall:double
+setEmp(name:String, age:int, tall:double):void
+viewEmp():void
          
(3) 파일명 : EmpEx   --main()포함 O
Emp ob=new Emp();
ob.setEmp("이순신", 25, 175.3);
ob.viewEmp();

(4) 출력화면
나의 이름은 이순신이며, 25살이고 키는 175.3cm입니다
*/
public class Emp {
	private String name;
	private int age;
	private double tall;
	
	public void setEmp(String name, int age, double tall) {
		this.name=name;
		this.age=age;
		this.tall=tall;
		
	}
	
	public String viewEmp() {
		return "나의 이름은 "+name+"이며, "+age+"살이고 키는 "+tall+"cm입니다";

	}
}
