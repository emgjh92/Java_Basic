package emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
	EmpDao dao=new EmpDao();
	System.out.println("**** 모든사원 출력하기 ****");
	
	List<EmpVO> list=dao.getEmpList();
	for(EmpVO ob:list) {
		System.out.print("이름 : "+ob.getEname()+"\n");
		System.out.print("부서 : "+ob.getDept()+"\n");
		System.out.print("급여 : "+ob.getSalary()+"\n");
		System.out.println("\n");
		}
	System.out.println("*****lee 사원  출력하기*****");
	EmpVO vo=dao.getEmp("lee");
	if(vo==null) {
		System.out.println("찾는 사원이 없어요");
	}else {
		System.out.println(vo.getEname()+" "+vo.getDept()+
				" "+vo.getSalary());
	}
}
}
