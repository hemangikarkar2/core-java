package polymorphism;
class ABC{
	   public void myMethod(){
		System.out.println("Overridden Method of abc");
	   }
	}
public class xyz extends ABC {
	public void myMethod(){
		System.out.println("Overriding Method of xyz");
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 		ABC obj = new xyz();
				obj.myMethod();
			   

	}

}

