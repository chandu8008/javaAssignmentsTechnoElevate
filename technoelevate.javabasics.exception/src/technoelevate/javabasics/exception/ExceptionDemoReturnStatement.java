package technoelevate.javabasics.exception;

public class ExceptionDemoReturnStatement {
	public static void main(String[] args) {
		System.out.println(returnStatementDemo());
	}

	public static int returnStatementDemo() {
		try {
			System.out.println("venky");
			int result = 10 / 5;
			System.out.println("result:"+result);
			return result;
		}

		catch (ArithmeticException e) {
			System.out.println("inside catch block");
			return 10;
		} finally {
			System.out.println("monkey");
			//return 9;
		}
	}
}

