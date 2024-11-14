package day3;

class User{
	int id;
	String name;
	
	User(int id , String name){
		this.id=id;
		this.name=name;
	}
}
	
	class Employee extends User{
		
		private static String name;
		private static int id;
		double salary;
		
		Employee(int salary){
			super(id,name);
			this.salary=salary;
		}
		
		double calculateAnnualSalary() {
			return salary*12;
			
		}

		public String getName() {
			// TODO Auto-generated method stub
			return super.name;
		}
		
		

		
		
	}

public class Question8 {
	
	/*
	 * Create a program to calculate the annual salary of an employee by using inheritance. 
	 * Create a class named "User" with the following properties and methods: 
	 * Properties: id(int): representing the id of the User name(String):representing the name of the User 
	 * Constructor: Declare parameterized constructor to initialize id and name. 
	 * Create a subclass named "Employee" that inherits from the "User" class.
	 *  Add the following additional properties and methods: Properties: salary(double):representing the monthly salary of the employee
	 *   Method: double calculateAnnualSalary():to calculate the annual salary earned by the employee. 
	 *   In the main method, create an object of "Employee" class. 
	 *   Calculate the annual salary of the employee and display it.. [Hint:Use constructor or setter methods to set the value]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(50000);
		System.out.println(e1.calculateAnnualSalary());
		System.out.println(e1.getName());
		

	}

}
