package collections;
import java.util.*;
public class hashmapexample2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		System.out.println("Added Elements :- ");
		
		hmap.put(1, "akansha");
		hmap.put(2, "pooja");
		hmap.put(3, "prachi");
		hmap.put(4, "raj");
	
		for(Map.Entry m:hmap.entrySet()) {
		
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		hmap.putIfAbsent(5, "guarav");
		
		System.out.println("after invoking putIfAbsent Method :- ");
		
		for(Map.Entry m:hmap.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
		HashMap<Integer,String> hmap2 = new HashMap<Integer,String>();
		hmap2.put(9,"rohit");
		hmap2.putAll(hmap);
		
		System.out.println("after invoking putAll() Method :- ");
		
		for(Map.Entry m:hmap2.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
		System.out.println("update list :- ");
		hmap2.replace(5, "guaravv");
		for(Map.Entry m:hmap2.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		System.out.println("update list replace name:- ");
		hmap2.replace(4,"raj","rajkumar");
		for(Map.Entry m:hmap2.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		System.out.println("update list of elements ");
		//hmap2.replaceAll(<k,v> -> "gauravv");
		//hmap2.replaceAll(4,"rajkumar");
		for(Map.Entry m:hmap2.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		
	}

}
