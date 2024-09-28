package set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet1 {
    
	public static void main(String[] args) {
		
		HashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("asd");
		hs.add("dfgh");
		hs.add("qww");
		
		ArrayList<String> as = new ArrayList<>(hs);
		as.add("hello");
		
		HashSet<String> hs1 = new HashSet<>(as);
		System.out.println(hs1);
		
		hs1.addAll(Arrays.asList("asdfghjk"));
		System.out.println(hs1);
	}
}
