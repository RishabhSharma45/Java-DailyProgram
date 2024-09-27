package priorityQueue;

import java.util.PriorityQueue;

public class PriorQu {
    
	public static void main(String args[]) {
		PriorityQueue<Integer> p1 = new PriorityQueue<>(2);
		p1.add(1);
		p1.add(2);
		try {
		p1.add(3);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(p1);
		
	}
	
}
