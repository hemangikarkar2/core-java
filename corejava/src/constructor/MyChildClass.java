package constructor;

//1)D to D
//constructor in inheritance,we can't inherit constructor but we can use super()to explicitly call
class MyParentClass {
	MyParentClass() {
		System.out.println("MyParentClass Constructor");
	}
}

class MyChildClass extends MyParentClass {
	MyChildClass() {
		System.out.println("MyChildClass Constructor");
	}

	public static void main(String args[]) {
		new MyChildClass();
	}
}