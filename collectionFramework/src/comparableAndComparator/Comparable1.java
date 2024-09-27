package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(new Employee(1,"xyz","London"));
		a1.add(new Employee(4,"xyz","Chennai"));
		a1.add(new Employee(3,"xyz","Bangaluru"));
		Collections.sort(a1);
		for(Employee emp :a1) {
			System.out.println(emp);
		}
		
		
	}

}
