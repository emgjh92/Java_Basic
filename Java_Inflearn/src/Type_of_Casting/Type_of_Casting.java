package Type_of_Casting;

public class Type_of_Casting { //4��_�⺻�ڷ���
	public static void main(String[] args) {
				//�ڵ�(������) �� ��ȯ:
				//���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
				byte by = 10; //1byte
				int in = by; //4byte
				System.out.println("in = " + in);
				
				//����� �� ��ȯ:
				//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
				int iVar = 100; //int�� : 4byte
				byte bVar = (byte)iVar; //byte�� : 1byte
				System.out.println("bVar = " + bVar);
				
				iVar = 123456;
				bVar = (byte)iVar;
				System.out.println("bVar = " + bVar);
		
	}
}
