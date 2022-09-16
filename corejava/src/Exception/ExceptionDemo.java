package Exception;
//try-catch
public class ExceptionDemo {

	public static void main(String[] args) {
		int a[] = new int[2];
		try {
			
			System.out.println("elements"+a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown : - "+e);
		}
	}

}
