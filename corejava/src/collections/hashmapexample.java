package collections;
import java.util.*;

 class hashmapexample {

	public static void main(String[] args) {
		Map<String , String> fruits = new HashMap<>();
		fruits.put("1", "mango");
		fruits.put("2", "apple");
		fruits.put("3", "kiwi");
		
		fruits.containsKey("1"); //return true ,if key is found
		fruits.containsValue("mango"); // return true,if value is found
		fruits.size();
		//	fruits.remove("1"); 
		//System.out.println(fruits.get("2"));
		for(Map.Entry pairentry : fruits.entrySet()) {
			System.out.println(pairentry.getKey()+ ": - "+pairentry.getValue());
		}
	}

}
