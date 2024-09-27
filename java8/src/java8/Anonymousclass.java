package java8;

public class Anonymousclass {
    public static void main(String args[]){
    	Example e1 = new Example() {

			@Override
			public int setSalary() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void getSalary() {
				// TODO Auto-generated method stub
				System.out.println(10);
				
			}
    		
    	};
    	 
    	e1.getSalary();
    	
    }
}
