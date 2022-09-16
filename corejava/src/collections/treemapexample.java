package collections;
//TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
import java.util.*;
public class treemapexample {

	public static void main(String[] args) {
		NavigableMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "amita");
		map.put(101, "ravina");
		map.put(102, "vijay");
		map.put(103, "suhani");
		System.out.println("asending map: "+map);
		System.out.println("desending map: "+map.descendingMap());
		System.out.println("head map: "+map.headMap(102,true));
		//Returns key-value pairs whose keys are less than or equal to the specified key
		System.out.println("tail map: "+map.tailMap(103,true));
		System.out.println("sub map: "+map.subMap(100 ,false,102,true));
		
	}

}
