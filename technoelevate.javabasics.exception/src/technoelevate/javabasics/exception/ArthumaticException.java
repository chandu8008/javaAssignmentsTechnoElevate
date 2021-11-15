package technoelevate.javabasics.exception;

import java.util.Scanner;

public class ArthumaticException {
	public static void main(String[] args) {
		int x ;
		int y ;
		Scanner sc = new Scanner(System.in);
		x =sc.nextInt();
		y =sc.nextInt();
		try {
			System.out.println("Main Method Starts");
			System.out.println(x/y);
			System.out.println("Main Method End");
		} catch (ArrayIndexOutOfBoundsException e
				) {
			System.out.println("ArrayIndexOutOfBoundException");
		} catch (ArithmeticException e) {
			System.out.println("ArthimeticException");
		} catch (Exception e) {
			System.out.println("Division unsuccessful");
		} finally {
			System.out.println("Main End");
		}

	}

}
