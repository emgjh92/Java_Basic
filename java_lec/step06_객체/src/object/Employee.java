package object;
/*
 * -name:String
 * -dept:Sting
 * -pay:int
 * -score:double
 * 
 *  +setNmae(name:String):void
 *  +setDept(dept:String):void
 *  +setPay(pay:int):void
 *  +setScore(score:double):void
 *
 *
 *  +getNmae():String
 *  +getDept():String
 *  +getPay():int
 *  +getScore():double
 */
public class Employee {
	private String name;
	private String dept;
	private int pay;
	private double score;

	public void setName(String name) {
	this.name=name;
	}
	public void setDept(String dept) {
	this.dept=dept;
	}
	public void setPay(int pay) {
	this.pay=pay;
	}
	public void setScore(double score) {
	this.score=score;
	}
	
	public String getName() {return name;}
	public String getDept() {return dept;}
	public int getPay() {return pay;}
	public double getScore() {return score;}
	/*
	getter & setter 의 경우 좌클릭 => source => Generate getter and setter
	 로 자동 생성 가능하다.
	*/
	
	@Override
	public String toString() {
		return "이름은" + name + "이고, " + dept + "에 근무하며 급여는" + pay + "원이고, 입사정적은" + score + "점 입니다.";
	}
	/*
	 * 좌클릭 => source => GenerateToString()으로 toString 자동생성 가능
	 * */
	
	public void setEmployee(String name,String dept,int pay, double score) {
		
		this.name=name;
		this.dept=dept;
		this.pay=pay;
		this.score=score;
	}
	
	
	
	
}
