package emp;

import java.util.List;

public class EmpMain {
	public static void main(String[] args) {
	EmpDao dao=new EmpDao();
	System.out.println("**** ����� ����ϱ� ****");
	
	List<EmpVO> list=dao.getEmpList();
	for(EmpVO ob:list) {
		System.out.print("�̸� : "+ob.getEname()+"\n");
		System.out.print("�μ� : "+ob.getDept()+"\n");
		System.out.print("�޿� : "+ob.getSalary()+"\n");
		System.out.println("\n");
		}
	System.out.println("*****lee ���  ����ϱ�*****");
	EmpVO vo=dao.getEmp("lee");
	if(vo==null) {
		System.out.println("ã�� ����� �����");
	}else {
		System.out.println(vo.getEname()+" "+vo.getDept()+
				" "+vo.getSalary());
	}
}
}
