package constructor;

public class SingleTonClass {
	   
	   private static SingleTonClass obj=null;
	   private SingleTonClass(){
	     
	   }
	   public static SingleTonClass objectCreationMethod(){
		
		if(obj==null){
		    obj= new SingleTonClass();
		}
	        return obj;
	   }
	   public void display(){
		System.out.println("Singleton class Example");
	   }
	   public static void main(String args[]){
		
		SingleTonClass obj= SingleTonClass.objectCreationMethod();
		obj.display();
	   }
	}