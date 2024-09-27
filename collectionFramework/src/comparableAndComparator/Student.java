package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	
	int id;
	private String name;
	private String city;
	
	Student(int id,String name,String city){
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	public static void main(String args[]) {
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(1,"xyz","dfgh"));
		a1.add(new Student(3,"xyz","dfgh"));
		a1.add(new Student(2,"xyz","dfgh"));
		Collections.sort(a1,(a,b)->b.id-a.id);
	}

}
