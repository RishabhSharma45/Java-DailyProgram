package Objectarray;

public class Employee {
	
	int id;
	String name,city,about;
	
	Employee(int id , String name , String city , String about){
		this.id = id;
		this.name = name;
		this.city = city;
		this.about= about;
	}
	public void display() {
		System.out.println("Employee data:- my id :" +id+"name : "+name+"city : "+city+ " "+about);
	}
	
  public static void main(String args[]) {
	  Employee arr = new Employee(1,"Rohit Sharma" , "Mumbai" , "I am a Java developer");
	  arr.display();
  }
}
