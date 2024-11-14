package day4;

public class Question1 {
	
	/*
	 * : Write code to determine if the string is a palindrome.
	  Input String : Madam 

	 Output : Madam is a Palindrome
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "Madam";
      String s1 = new StringBuilder(s).reverse().toString();
      
      if(s1.equalsIgnoreCase(s)) {
    	  System.out.println("Valid Palindrome");
      }
      else {
    	  System.out.println("String" + " s"+" is not a valid palindrome");
      }
	}

}
