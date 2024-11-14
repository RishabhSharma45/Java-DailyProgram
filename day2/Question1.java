package day2;

/*
 * Create a Bank class
 *  and declare an instance variable named amount of type double.
 *  Create parameterized constructor to initialize variable “amount” with value 10000.
 *  Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
 *  Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw. 
 *  Later on, deposit 5000 in the account balance.At the end display total balance on the console.
 * */

class Bank{
	
	double amount;
	
	Bank(double amount){
		this.amount = amount;
		}
	
	void withDraw(double withdrawAmount) {
	  String msg = amount>=withdrawAmount ? "withdraw succesfull " : "insufficient balance ";
	  amount = amount>=withdrawAmount ? amount - withdrawAmount : amount;
	  System.out.println(msg + "available balance :- " + amount);
	  
	}
	
	void deposite(double depositeAmount) {
		String msg = depositeAmount<=0 ? "enter valid deposite amount ," : "deposited successfully ";
		amount = depositeAmount>0 ? amount + depositeAmount : amount;
		 System.out.println(msg + "available balance :- " + amount);
	}
	
}


public class Question1 {

	public static void main(String[] args) {
		 
		Bank bank = new Bank(10000);
		bank.withDraw(5000);
		bank.deposite(4000);
		bank.deposite(-900);
		bank.withDraw(11000);
		
		
	}

}
