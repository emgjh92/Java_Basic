package P20;

public class P20 {
	/*
	20.	
	�ݺ����� �̿��Ͽ� 369���ӿ��� �ڼ��� �ľ� �ϴ� ����� ���� ������� ȭ�鿡 ����غ���. 
	1���� �����ϸ� 99������ �Ѵ�. 

	���� ��� ��) 
	3 �ڼ��ѹ�
	6 �ڼ� �ѹ�
	9 �ڼ� �ѹ� 
	.
	.
	.
	33 �ڼ� �ι�
	.
	98 �ڼ� �ѹ�
	99 �ڼ� �ι�
	*/
	public static void main(String[] args) {
		boolean b1, b2;
		
		for(int i=1; i<100; i++) {
			if (i<10) {  // �Է°��� ���ڸ� ���� ���
				if ((i %3) == 0)
					System.out.println(i + " �ڼ� �ѹ�");
			}
			else {  
	        	b1 = (i/10) %3 == 0;  
	        	b2 = (i%10) %3 == 0;  
	             
	        	if ((i%10) == 0) 
	        		b2 = false;
	        	if (b1 && b2)
	        		System.out.println(i + " �ڼ� �ι�");
	        	else if (b1 || b2)
	        		System.out.println(i + " �ڼ� �ѹ�");
	        }
		}
			
		}
	}


