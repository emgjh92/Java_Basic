package test;
//����Ͻ� ���� (������ ���̽� ���� ó��)

public class UserProc {
	/*
	 * �Ű������� ���� pororo, 1234 �� ���Ͽ�
	 * ������ entity ��ü�� ���� 
	 * setter�� ���� id, pw, "�Ƿη�", 89.97�� ���� �ϼ���
	 * entity ���� 
	 */
	
	public User getLoginUser(String id, String pw) {
		User entity=null; //�Ʒ� ������ �������� ������ null ���� �������� �Ѵ�.
		//�̷������� �и��ؼ� ������ �ؾ� �߸��� ���̶� '�� ��ü'�� return �Ǳ� ������ 
		//�и��ؼ� �����ϴ� ���� ����ȭ �Ǿ� �ִ�.
		if(id.equals("pororo")&&pw.equals("1234")) {
			entity=new User();
			entity.setId("pororo"); entity.setPw("1234"); 
			entity.setName("�Ƿη�"); entity.setPoint(89.97);
			return entity;
		}
		return null;
	}
}
