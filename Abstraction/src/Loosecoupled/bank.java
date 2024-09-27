package Loosecoupled;

public class bank {
     
	sbi e;
	
	bank(){
    	e = new sbi(); 
     }
	
	public void show() {
		System.out.println("we took loan from sbi and -");
	    e.rateOfInterest();
	}
}
