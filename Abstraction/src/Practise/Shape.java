package Practise;

import java.util.Scanner;

public abstract class Shape {
     Shape(){
    	 System.out.println("Let's calculate area of circle ");
     }
     
     public int radius() {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter radius of circle");
    	 int r = sc.nextInt();
    	 return r;
    	 }
     
     abstract double area();
     
}
