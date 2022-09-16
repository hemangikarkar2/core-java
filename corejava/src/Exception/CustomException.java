package Exception;

import java.util.Random;

public class CustomException extends Throwable {

	public String toString() {
		return "EVEN";
	}

}

class CustomException1 extends Throwable {

	public String toString() {
		return "ODD";
	}

}

class Example {

	public static void main(String[] args) {
		try {
			demo();
		} catch (CustomException e) {
			System.out.println(e);
		} catch (CustomException1 e) {
			System.out.println(e);
		}
	}

	static void demo() throws CustomException, CustomException1 {
		Random random = new Random();

		int num = random.nextInt();

		if (num % 2 == 0) {
			throw new CustomException();
		} else {
			throw new CustomException1();
		}
	}

}
