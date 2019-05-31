package chap11;

public class BankAccount {
	//instance field
	private double[] balance;
	
	//constructors
	public BankAccount(double[] startBalance) throws NegativeStartingBalance{
		balance = new double[startBalance.length];
		for(int i=0; i<balance.length;i++) {
			if(startBalance[i]<0)
				throw new NegativeStartingBalance(startBalance[i]);
			
			balance[i] = startBalance[i];
		}

	}
	
	/*public BankAccount(double startBalance) throws NegativeStartingBalance {
		if(startBalance< 0) {
			throw new NegativeStartingBalance(startBalance);
		}
		balance = startBalance;
	}
	
	//setter
	public void setBalance(double b) {
		balance = b;
	}
	
	//getter
	public double getBalance() {
		return balance;
	}
	
	//deposit and withdraw methods
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}*/
}
