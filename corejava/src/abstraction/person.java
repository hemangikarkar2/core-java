package abstraction;
//examole of abstract class method   
 abstract class person1 {
	public String fname = "Hemangi";
	  public String lname = "Karkar";
	  public String email = "abc@xyz.com";
	  public int age = 24;
	  public abstract void study(); // abstract method 
}
//Subclass (inherit from Person)
class Student extends person1 {
public int graduationYear = 2020;
public void study() {
 System.out.println("Studying all day long");
}
}
public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object of the Student class (which inherits attributes and methods from Person)
	    Student myObj = new Student(); 
	    
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	    myObj.study(); // call abstract method
	 
	}

}
