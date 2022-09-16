package collections;
import java.util.*;
class book{
	int id;
	String name,author,publisher;
	int quantity;
	public book(int id,String name,String author,String publisher,int quantity) {
		this.id = id;
		this.name= name;
		this.author =author;
		this.publisher = publisher;
		this.quantity =	 quantity;
		
	}
}
public class arraylistExample2 {
	public static void main(String args[]) {
		List<book> list = new ArrayList<book>();
		book b1 = new book(1001,"let us c","yashvant","ieee",1);
		book b2 = new book(1002,"let us c1","pooja bedi","b2b",2);
		book b3 = new book(1003,"let us c2","rekhaa rajput","ieee",3);
		book b4 = new book(1004,"let us c3","yashvant","ieee",4);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		for(book b :list)
			System.out.println(b.id+"  "+b.name+"  "+b.author+"  "+b.publisher+"  "+b.quantity);
	}

}
