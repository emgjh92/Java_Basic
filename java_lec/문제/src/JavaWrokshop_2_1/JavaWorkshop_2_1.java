package JavaWrokshop_2_1;

public class JavaWorkshop_2_1 {
public static void main(String[] args) {
	@SuppressWarnings(value="unchecked") //type�� Ȯ������ ����

	Tv tvArray[]=new Tv[3];
	tvArray[0]=(Tv) new Tv("INFINIA", 1500000 ,"LED TV");
	tvArray[1]=(Tv) new Tv("XCANVAS", 1000000 ,"LCD TV");
	tvArray[2]=(Tv) new Tv("CINEMA	", 2000000 ,"3D TV");
	
	System.out.println(tvArray[0]);
	System.out.println(tvArray[1]);
	System.out.println(tvArray[2]);
	
	
    System.out.println("������ ���� ��� ��ǰ : ");
    if(tvArray[0].getPrice()>tvArray[1].getPrice()&&tvArray[0].getPrice()>tvArray[2].getPrice())
    	System.out.println(tvArray[0].getName());
    else if(tvArray[1].getPrice()>tvArray[0].getPrice()&&tvArray[1].getPrice()>tvArray[2].getPrice())
    	System.out.println(tvArray[1].getName());
    else
    	System.out.println(tvArray[2].getName());

	System.out.println("������ ���� ������ ��ǰ : ");
	  if(tvArray[0].getPrice()<tvArray[1].getPrice()&&tvArray[0].getPrice()<tvArray[2].getPrice())
	    	System.out.println(tvArray[0].getName());
	    else if(tvArray[1].getPrice()<tvArray[0].getPrice()&&tvArray[1].getPrice()<tvArray[2].getPrice())
	    	System.out.println(tvArray[1].getName());
	    else
	    	System.out.println(tvArray[2].getName());

}

}

