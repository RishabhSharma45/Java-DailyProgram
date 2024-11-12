package dailyJava;

class BankAccount1 {
	
	private String accountNumber;
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	 void deposit(double amount) {
		balance = balance+amount;
	}
	
	
	
	void withdraw(double amount) {
		if(balance<amount) {
			System.out.println( "insufficient balance to withdraw");
		}
		else {
			balance = balance - amount;
			System.out.println("successfully withdrawn avl. balance :- " + balance );
		}
		
	}
	
	void checkbalance() {
		System.out.println(balance);
	}
}

public class BankAccount{

	public static void main(String[] args) {
		BankAccount1 b = new BankAccount1();
	        b.deposit(5000);
	        b.checkbalance();
	        b.withdraw(4000);
	        b.withdraw(3000);

	}
}


