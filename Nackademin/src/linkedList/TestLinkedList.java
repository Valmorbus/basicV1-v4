package linkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TestLinkedList {

	public static void main(String[] args) throws IOException {

		LinkedList<Character> test = new LinkedList<Character>();
		String tri = "test test test";
		//test.add(3);
		//test.add(6);
		//test.add(tri);
		
		tri = readFile();
		//System.out.println(test.tostring());
		//System.out.println(test.getSize());
		System.out.println(tri);
		
		for (int i = 0; i < tri.length(); i++) {
			test.add(tri.charAt(i));
		}
		//System.out.println(test.tostring());
	}

	public static String readFile() throws IOException
	{
			File file = new File("C:/Users/borgs_000/Desktop/Nackademin/Java Grund/src/vecka4test.txt");
		    StringBuilder fileContents = new StringBuilder((int)file.length());
		    Scanner scanner = new Scanner(file);
		    String lineSeparator = System.getProperty("line.separator");

		    try {
		        while(scanner.hasNextLine()) {        
		            fileContents.append(scanner.nextLine() + lineSeparator);
		            System.out.println(fileContents.toString());
		        }
		        return fileContents.toString();
		    } finally {
		        scanner.close();
		    }
	}

}
