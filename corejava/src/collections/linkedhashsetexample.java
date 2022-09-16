package collections;
import java.util.*;
public class linkedhashsetexample {
	
	public static void main(String args[]) {
	
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		lset.add("one");
		lset.add("two");
		lset.add("three");
		lset.add("four");
		lset.add("five");
		Iterator<String> i = lset.iterator();
		while(i.hasNext())
		{
			System.out.println(i);
		}
	}
}
