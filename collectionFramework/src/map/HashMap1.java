package map;

import java.util.HashMap;

public class HashMap1 {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "xyz");
		hm.put(2, "abc");
		hm.put(3, "asd");
		hm.put(3, "asdf");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(1));
		System.out.println(hm.isEmpty());
		hm.remove(2);
		System.out.println(hm);
		hm.put(null, "ert");
		hm.put(5, "qwe");
		System.out.println(hm.get(null));
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.containsValue("asd"));
	}

}
