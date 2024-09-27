package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Comparator1 {
	
	int id;
	String name;
	
	Comparator1(int id , String name){
		this.id=id;
		this.name=name;
	}
	
	
	
    @Override
	public String toString() {
		return "Comparator1 [id=" + id + ", name=" + name + "]";
	}



	public static void main(String args[]) {    
		
		Set<Integer> t1 = new TreeSet<>((a,b)->b-a);
		t1.add(2);
		t1.add(5);
		t1.add(3);
		t1.add(1);
		System.out.println(t1);
		
		
    	ArrayList<Comparator1> c1 = new ArrayList<>();
    	c1.add(new Comparator1(1,"asdf"));
    	c1.add(new Comparator1(3,"asdf"));
    	c1.add(new Comparator1(7,"asdf"));
    	c1.add(new Comparator1(2,"asdf"));
    	Collections.sort(c1 , (a,b) -> b.id-a.id);
    	for(Comparator1 c : c1) {
    		System.out.println(c);
    	}
    	
    }
}
