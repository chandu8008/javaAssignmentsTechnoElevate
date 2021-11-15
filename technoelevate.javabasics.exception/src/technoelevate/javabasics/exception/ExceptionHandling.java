package technoelevate.javabasics.exception;

import java.io.IOException;

public class ExceptionHandling {
public static void main(String[] args) throws IOException {
	
	System.out.println("first method");
	sum();
}

public static void sum() throws IOException {
	System.out.println("second method");
	print();
	
}

public static void print() throws IOException {
	System.out.println("third method");
	disp();
	
}

public static void disp() throws IOException {
	throw new IOException();

	
}
}
