package emp;

import java.util.ArrayList;
import java.util.List;

//dao (data access object) : �����ͺ��̽����� �ڿ��� ������ �뵵�� ����ϴ� Ŭ����

public class EmpDao {
	List<EmpVO> list=null;
	
	public EmpDao() {
		list=new ArrayList<EmpVO>();
		list.add(new EmpVO("kim","������",1000000));
		list.add(new EmpVO("lee","���ߺ�",1500000));
		list.add(new EmpVO("park","������",2000000));
	}

	public List<EmpVO> getEmpList() {
		return list;
	}
	public EmpVO getEmp(String name){
		for(EmpVO vo:list) {
			if(vo.getEname().equals(name)){
				return vo;
				}
			}
		return null;
	}
}
