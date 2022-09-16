package encapsulation;


public class ExampleEncapulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e = new employee();
		e.setName("Hemangi");
		e.setId("17mca021");
		e.setAge(21);
		System.out.println("Employee's :- \n ID :"+e.getId()+"\n NAME : "+e.getName() +"\n Age : "+e.getAge());
	}

}
