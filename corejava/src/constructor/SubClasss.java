package constructor;

//P to P
 class Person
{	String name;
	int id;
 
	Person(String name,int id){
		this.name= name;
		this.id = id;
	
 }
}
public class SubClasss  extends Person{
		float salary;
	SubClasss(String name, int id, float salary) {
		super(name, id);
		this.salary = salary;
		
	}
	void display() {
		System.out.println("Person ID : "+id+" NAME :"+name+ " salary : "+salary);
	}
	public static void main(String args[]) {
		SubClasss s = new SubClasss("hemangi", 01, 5000);
		s.display();
		
	}
}



