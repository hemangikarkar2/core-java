package constructor;

// P to D
//Parameterized super() call to invoke parameterized constructor of parent class
class Parentclass {
	String s1;

	Parentclass(String str) {
		s1 = str;
		System.out.println("parameterized constructor of parent class : " + str);
	}
}

class SubClass extends Parentclass {
	SubClass() {
		super("hello");
		System.out.println("Constructor of child class" + s1);

	}

	public static void main(String args[]) {
		SubClass obj = new SubClass();

	}
}