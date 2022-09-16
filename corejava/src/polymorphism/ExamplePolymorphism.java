package polymorphism;

public class ExamplePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary s = new salary("Hemangi","Vastrapur,Ahemdabad-15",1,3000);
		Employee e = new Employee("pooja","premchandnagar,Ahmedabad-15",2);
		
		
		System.out.println("Call mailCheck using Salary reference --");   
	     s.mailCheck();
	     System.out.println("\n Call mailCheck using Employee reference--");
	     e.mailCheck();
	}

}
