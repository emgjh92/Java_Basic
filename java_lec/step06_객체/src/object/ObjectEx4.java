package object;
// 해당 java 파일은 Employee.java 와 연동해서 사용한다.

public class ObjectEx4 {
	public static void main(String[] args) {
		Employee em=new Employee();
		em.setName("이순신");
		em.setDept("개발부");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		em.setEmployee("진달래", "총무부", 1200000, 75.34);

		System.out.println("사원이름 : "+em.getName());
		System.out.println("근무부서 : "+em.getDept());
		System.out.println("받는급여 : "+em.getPay());
		System.out.println("입사점수 : "+em.getScore());
	}
}
