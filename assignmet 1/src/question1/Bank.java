package question1;

public class Bank {
	
    private static double amount;
    
    Bank(){
    	amount = 10000;
    }
    
    public static void withdraw(double withdrawalAmount) {
    	System.out.println(amount);
    	String result = "Successfully Withdrwan";
    	 result = withdrawalAmount > amount ? "Amount is insufficient to make transaction" : result;
    	 amount = result.equals("Successfully Withdrwan") ? amount = amount - withdrawalAmount : amount;
         System.out.println(result);
		
    }
    public static void deposite(double depositeAmount ) {
		amount = amount + depositeAmount;
		String result = "Successfully deposited";
		 System.out.println(result + "available balace :- " + amount );
    }
    
    public static void main(String args[]) {
    	Bank b = new Bank();
    	System.out.println("Welcome to my bank");
    	withdraw(8000);
    	deposite(5000);
    }
}
