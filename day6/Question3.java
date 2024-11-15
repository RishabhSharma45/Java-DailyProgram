package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(5);
		a.add(10);
		a.add(9);
		a.add(4);
	
		Stream<Integer> s = a.stream();
		int sum = s.filter(x->x%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);

	}

}
