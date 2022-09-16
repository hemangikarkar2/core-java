package static1;

public class StaticClass1 {

	   private static String str = "hello guys";
	   
	   static class MyNestedClass{
		
		public void disp() {
		   System.out.println(str); 
		}

	   }
	   public static void main(String args[])
	   {
	       /* To create instance of nested class we didn't need the outer
		* class instance but for a regular nested class you would need 
		* to create an instance of outer class first
	        */
		  
		  MyNestedClass obj= new MyNestedClass();
		   // StaticClass1.MyNestedClass obj = new  StaticClass1.MyNestedClass();
		   obj.disp();
	   }
}