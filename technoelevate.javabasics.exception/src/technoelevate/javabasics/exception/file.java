package technoelevate.javabasics.exception;

import java.io.IOException;

public class file {
public static void main(String[] args) {
	java.io.File file = new java.io.File("D://newFile.txt");
	try {
		file.createNewFile();
		System.out.println("file created");
	} catch (IOException e) {
		System.out.println("unable to create file");
	}
}
}
