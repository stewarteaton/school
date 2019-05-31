package chap11;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double[] acts = {111,2222,-333.0};
			BankAccount acct = new BankAccount(acts);	
		}
		catch(NegativeStartingBalance e) {
			System.out.print(e.getMessage());
		}
	}

}
