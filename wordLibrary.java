import java.util.*;
import java.io.*;

public class wordLibrary {
	public static void main (String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		BufferedReader infile = new BufferedReader( new FileReader("Dictionary.txt", true));	//to read
		BufferedWriter tofile = new BufferedWriter(new FileWriter("Dictionary.txt", true));		//to write

		System.out.print("1. View Dictionary /n2.Add Entry/n");
		sel = sc.nextInt(); 

		switch (sel) {
			case 1: 
				while (infile.ready()) {
					infile.readLine();
				}

			case 2:
				System.out.print("Word: ");
				String word = sc.next();
				System.out.print("Definition: ");
				String definition = sc.next();
				Entry(word, definition);
				
			default: 
				System.out.print("Sorry try again");
				System.exit(0);
		}



		/*************************************************/

	} //END MAIN

	public void printEntry(String word, String definition) {
		word.toUpperCase();
		tofile.write(word\n, definition);
	}


}
