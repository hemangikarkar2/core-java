package Exception;

//Nested try-catch
public class NetstedTryDemo {
	public static void main(String[] args) {
		try {
			try {
				int b = 39 / 0;

			} catch (ArithmeticException e) {
				System.out.println("i'm in Nested 1st try block :-" + e);
			}
			try {
				int a[] = new int[5];
				a[5] = 4;

			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("i'm in Nested 2nd try block :- " + ae);
			}
		} catch (Exception e) {
			System.out.println("handled" + e);
		}
		System.out.println("\n main class..");
	}

}
