package finalClass;
/*
final class abc {
	public void display() {
		System.out.println("hello");
	}
}
*/
public  class ExampleFinalClass  {
	
	 
	public static void main(String args[]) {
		final StringBuilder sb = new StringBuilder("hello"); 
      //   abc a= new abc();
        // a.display();
	        System.out.println(sb); 
	        
	        sb.append("World"); 
	          
	        System.out.println(sb); 
	}
}
