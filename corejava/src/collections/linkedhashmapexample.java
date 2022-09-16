package collections;
import java.util.*;
public class linkedhashmapexample {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		  
		hm.put(100, "amritaa");
		hm.put(101, "pojaa");
		hm.put(102, "rekhaa");
		
		System.out.println("keys : "+hm.keySet());
		System.out.println("values : "+hm.values());
		System.out.println("key-values : "+hm.entrySet());
		
		
		for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		hm.remove(102);
		System.out.println("after remove : "+hm);
	}

}
