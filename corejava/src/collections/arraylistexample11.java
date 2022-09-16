package collections;
//1.)Iterating Collection through the for-each loop

import java.util.*;
public class arraylistexample11 {

	public static void main(String[] args) {
	
	List<String> li1 = new ArrayList<String>();
	System.out.println("is empty ? : "+li1.isEmpty());
	li1.add("hhii");
	li1.add("hi");
	li1.add("how are you");
	for(String obj : li1)
	System.out.println(obj);
	System.out.println("is empty ? : "+li1.isEmpty());
	li1.retainAll(li1);
	//elements iterate in reverse order
	ListIterator<String> list1 = li1.listIterator(li1.size());
	while(list1.hasPrevious()){
		String str = list1.previous();
		System.out.println(str+"\n");
	 }
	
	}
}
