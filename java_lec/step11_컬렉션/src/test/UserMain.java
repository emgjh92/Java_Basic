package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1234
 * 
 * pororo���� �����ϼ̽��ϴ�.
 * ���� ����Ʈ�� 89.97�� �Դϴ�.
 * 
 * [[BOOK�� ��������]]
 * å�̸� : JAVA	å���� : kim ������ : 100
 * å�̸� : orcle	å���� : lee ������ : 200
 * å�̸� : html	å���� : park ������ : 300
 * 
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1235
 * 
 * ID�Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.
 * 
 */

public class UserMain {
public static void main(String[] args) {
	String id;
	String pw;
	
	//�Է�ó��
	System.out.println("ID�� �Է��ϼ��� : ");
	Scanner sc=new Scanner(System.in);
	id=sc.next();
	System.out.println("PW�� �Է��ϼ��� : ");
	pw=sc.next();
	
	//�Է°��� ���� �˻�
	UserProc up = new UserProc();
	User entity = up.getLoginUser(id,pw);
	
	//������
	if(entity!=null) {
	//�����Ͱ� �ִ� ���	
		System.out.println(entity.getName()+"���� �����ϼ̽��ϴ�.");
		System.out.println("���� ����Ʈ��"+entity.getPoint()+"�� �Դϴ�.");
		
		
		BookProc book=new BookProc();
		ArrayList<Book> list= book.getList();
		
		System.out.println("[[BOOK�� ��������]]");
		for(Book ob:list) {
			System.out.print("å�̸� : "+ob.getTitle()+"\t");
			System.out.print("å���� : "+ob.getAuthor()+"\t");
			System.out.println("������ : "+ob.getPage());
			}
		
		}else { //�����Ͱ� ���� ���
			System.out.println("ID�Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.");
		}
	}
}
