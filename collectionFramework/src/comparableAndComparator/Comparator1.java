package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.id, o1.id);
	}
	
	public static void main(String args[] ) {
		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(new Student(1,"xyz","dfgh"));
		a1.add(new Student(3,"xyz","dfgh"));
		a1.add(new Student(2,"xyz","dfgh"));
		
			Collections.sort(a1, new Comparator1());
	
		for(Student st :a1) {
			System.out.println(st);
		}
		
     
}

}
