package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Random;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("--------Array To List Example--------");
		String[] vowels = {"a","e","i","o","u"};
		List<String> vowellist = Arrays.asList(vowels);
		System.out.println(vowellist+ "\n ");
		
		System.out.println("--------List To  Array  Example--------");
		List<String>  letters = new ArrayList<String>();
		letters.add("hello");
		letters.add("hi");
		letters.add("how are you");
		//System.out.println(letters);
		//convert list to array
		String[] strarray = new String[letters.size()];
		strarray =letters.toArray(strarray);
		System.out.println(Arrays.toString(strarray)+"\n");
		
		
		System.out.println("--------List   Example--------");
		List<String>  list = new ArrayList<String>();
		list.add("H");
		list.add("I");
		letters.addAll(list);
		System.out.println(letters);
		letters.clear();
		
		List<Integer> iints = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			iints.add(i);
		System.out.println(iints+"\n");
		
		
		System.out.println("--------List sort  Example--------");	
		List<Integer>  ints = new ArrayList<>();
		Random random  = new Random();
		for(int i=0; i<10;i++) {
			ints.add(random.nextInt(1000)); }
		 		//natural sorting  using collections  class
		Collections.sort(ints);
		System.out.println("Natural Soring"+ints+"\n");
				
		
		System.out.println("--------Iterator Example--------");
		Iterator<Integer> it = iints.iterator();
		while(it.hasNext()){
			int x= (int)it.next();
			System.out.println(x+" ");}
	
	}

}
 