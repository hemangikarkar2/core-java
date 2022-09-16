package corejava;

class Calculation
{		int z;
	public void add(int a,int b)
	{
		 z = a+b;
		System.out.println("addition is :-"+z);
	}
	public void sub(int a,int b)
	{
		 z = a-b;
		System.out.println("sub is :-"+z);
	}
	
}
public class ExampleInheritance  extends Calculation{
	public void mul(int a,int b)
	{
		z = a*b;
		System.out.println("mult is :-"+z);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10,b=20;
		ExampleInheritance e = new ExampleInheritance();
		e.add(a, b);
		e.sub(a, b);
		e.mul(a, b);

	}

}
