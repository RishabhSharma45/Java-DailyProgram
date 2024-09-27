package string;

public class practice1 {
   public static void main(String args[]) {
	   String s = "Shrimant Peshwa Bajirao Balaji Vallad";
	   System.out.println(s.charAt(0));
	   System.out.println(s.toLowerCase());
	   System.out.println(s.toUpperCase());
	   System.out.println(s.matches("balaji"));
	   s = s.replace('s', 'S');
	   s = s.concat(" Akhand Bharat");
	   System.out.println(s);
	   System.out.println(s.length());
   }
}
