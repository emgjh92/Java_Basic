package emp;
//vo(value object) = entity = DTO(data transfer object) = bean
//	: 데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
public class EmpVO {
	private String ename;
	private String dept;
	private int salary;
	
	public EmpVO() {
		
	}
	public EmpVO(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept=dept;
		this.salary=salary;
	}


	public String getEname() {
		return ename;
	}

	public String getDept() {
		return dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
