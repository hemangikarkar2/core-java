//default access modifier
package Pacakges;

public class ExamplePackages implements Animal {


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Animal is a eating");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Animal is a traveling");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePackages e = new ExamplePackages();
		e.eat();
		e.travel();
		
	
	}
}
