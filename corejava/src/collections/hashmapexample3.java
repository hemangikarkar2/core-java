package collections;
//HashMap is the implementation of Map, but  it doesn't maintain any order.
//LinkedHashMap is the implementation of Map.It inherits HashMap class. It maintains insertion order.

import java.util.*;

class book1{
	int id;
	String name,author,publisher;
	int quantity;
	public book1(int id,String name,String author,String publisher,int quantity) {
		this.id = id;
		this.name= name;
		this.author =author;
		this.publisher = publisher;
		this.quantity = quantity;
		
	}
}
public class hashmapexample3 {

	public static void main(String[] args) {
		 
		//Map<Integer,book1> map=new LinkedHashMap<Integer,book1>(); //example of linkedhashmap  
		Map<Integer,book1 > map = new HashMap<Integer,book1>();//creating map of books and example of hashmap
		book1 b1 = new book1(1001,"let us c","yashvant","ieee",1);
		book1 b2 = new book1(1002,"let us c1","pooja bedi","b2b",2);
		book1 b3 = new book1(1003,"let us c2","rekhaa rajput","ieee",3);
		book1 b4 = new book1(1004,"let us c3","yashvant","ieee",4);
		
		//add books to map
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		map.put(4, b4);
		 
		//trvaversing books
		System.out.println("id   | name   | author  |  publisher  |quantity");
		for(Map.Entry<Integer,book1> entry:map.entrySet()) {
		int key =entry.getKey();
		book1 b = entry.getValue();
		
		System.out.println(key +"  Details :-");
		System.out.println(b.id+"  |"+b.name+"  |"+b.author+"   |"+b.publisher+"  |"+b.quantity);
		}
	}

}
