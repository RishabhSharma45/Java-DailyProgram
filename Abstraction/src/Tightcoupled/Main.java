package Tightcoupled;

public class Main {
	static sbi e;
	static hdfc d;
	
  public static void main(String[] args) {
	  System.out.println("Welcome here");
	  e = new sbi();
	  d = new hdfc();
	  bank b = new bank(d);
  }
}
