package com.hello;

public class Employee {

   public static void printt(String name , int id) {
		System.out.println(name);
		System.out.println(id);
	}
	
    public static void printt(int id , String sal) {
    	System.out.println(id);
		System.out.println(sal);
	}
    
    public static void printt(String name , String desg) {
    	System.out.println(name);
		System.out.println(desg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.printt("Rohit Sharma", 45);
		e1.printt(45, "7 Crores");
		e1.printt("Rohit Sharma", "Captain");

	}

}
