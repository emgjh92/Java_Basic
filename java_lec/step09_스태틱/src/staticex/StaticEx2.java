package staticex;

public class StaticEx2 {

	public static void main(String[] args) {

		System.out.println("*** 입금 당시의 금리 ***");
		BankAccount ba1 = new BankAccount(1994, "kim", 1000, 0.07);
		ba1.view(); //(왜 여기서는 전역함수 적용안되는지?)
	
		BankAccount ba2 = new BankAccount(1998, "kim", 1000, 0.12);
		ba2.view();//(왜 여기서는 전역함수 적용안되는지?)
		
		BankAccount ba3 = new BankAccount(2005, "kim", 1000, 0.05);
		ba3.view();//(왜 여기서는 전역함수 적용안되는지?)
	
		System.out.println("\n\n*** 2005년 현재의 금리 ***");
		ba1.view();
		ba2.view();
		ba3.view();
		
		System.out.println("\n\n*** 0.04로 변동된 금리");
		BankAccount.setRate(0.04);
		ba1.view();
		ba2.view();
		ba3.view();
	
	}

}
