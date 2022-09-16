package collections;
//hash set example :elements iterate in an unordered collection and ignoring duplicate elements
import java.util.*;
public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //HashSet from another Collection
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hi");
		alist.add("good");
		alist.add("morning");
		alist.add("1");
		alist.add("e");
		alist.add("s");
		
		
		System.out.println(alist);
		
		HashSet<String> hset = new HashSet();
		hset.add("one");
		hset.add("two");
		hset.add("three");
		hset.add("four");
		hset.add("five");
		hset.add("four");
		hset.add("five");
		
		System.out.println(hset);
		
		/*
		 * hset.removeIf(str -> str.contains("five")); //Removing elements on the basis
		 * of specified condition
		 * 
		 * hset.add("hello");
		 * 
		 * Iterator<String> i =hset.iterator(); while(i.hasNext()) {
		 * System.out.println(i.next()); }
		 */

	}

}
