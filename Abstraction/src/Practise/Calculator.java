package Practise;

public class Calculator implements Asmd {
    int a = 7;
    int b = 7;
	@Override
	public int addition() {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substraction() {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int division() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public static void main(String args[]) {
		 Asmd a1 = new Calculator();
		 System.out.println(a1.addition());
		 System.out.println(a1.substraction());
		 System.out.println(a1.multiplication());
		 System.out.println(a1.division());
	}
   
}
