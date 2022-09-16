package Exception;

public class trycatchDemo {
	public static void main(String[] args) {
		try {
			int d = 50/0;
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Excpetion :- "+ae);
		}
	}
}
