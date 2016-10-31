import java.util.*;
import java.io.*;

public class wordLibrary {
	public static void main (String[] args) throws Exception {

		StringBuffer infile = new StringBuffer(); 

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
		}



		/*************************************************/

	} //END MAIN

	public void printEntry(String word, String definition) {
		word.toUpperCase();
		tofile.write(word\n, definition);
	}


}
