package Overiding;


class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
	   super.move();
      System.out.println("Dogs can walk and run");
   }
  
}


public class ExampleOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Animal b =new Dog();
	  Dog b = new Dog();
		b.move();
		
	}

}
