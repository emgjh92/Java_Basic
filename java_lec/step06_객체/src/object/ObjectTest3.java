package object;
/*
 * +는 public, -는 private 를 의미
 * 
 * 클래스명 : Emp
 * -name:String
 * -dept:String
 * -salary:int
 * 
 * +setEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 *
 * 
 * --홍길동 사원은 개발부에 근무하며 1520000원의 급여를 받아요
 * 
 * 
 * */
class Emp3{
	private String name;
	private String dept;
	private int salary;
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name + "은 " + dept + "에 근무하며 " + salary + "원의 급여를 받습니다";
	}
	
}
public class ObjectTest3 {

	public static void main(String[] args) {
		Emp3 em = new Emp3(); //생성자 (Constructor) 는 여기서 new 뒤에 오는 Emp3 를 의미한다
		em.setName("강호동");
		em.setDept("개발부");
		em.setSalary(1200000);
		System.out.println(em.toString());
		
		System.out.println("이름 : "+em.getName());
		System.out.println("부서 : "+em.getDept());
		System.out.println("급여 : "+em.getSalary()+"원");

	}
}
