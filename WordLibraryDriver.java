import java.io.*;

import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List;

public class WordLibraryDriver {

	class entry {
		private String word;
		private String definition;

		entry(String word, String definition){
			this.word = word;
			this.definition = definition;
		} //end constructor

/**
*
**/
		entry(){
			this("", "");
		}//end no argument constructor
/**
*
**/

		/*public void setEntry(String w, String d) {
			word = w;
			definition = d;
		}*/
/**
*
**/
		public void getEntry() {
			return word;
			return definition;
		}
	} //end entry class

	/*********************************************************************/
									
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		List<entry> Dictionary = new ArrayList();	//dictionary
		int sel; 									//selection
		//File file = new File("/user/DesertBabyJr/desktop/dictionary.txt"); //text file

		//if file doesn't exist--create it

		if(!file.exists()) {
			file.createNewFile();
		} //end if statement

		//add entry
		System.out.print("1. View Dictionary /n2.Add Entry/n");
		sel = sc.nextInt(); //selection

		switch(sel) { 
			case 1: //print all entries
				for (entry e : Dictionary) {
					getEntry();
					System.out.println(Dictionary);
				}
					break;
			case 2: //add new entry
				try {
					BufferedReader infile = new BufferedReader( new FileReader("Dictionary.txt", true));					
					System.out.print("Word: ");
					String word = sc.next();
					System.out.print("Definition: ");
					String definition = sc.next();
					setEntry(word, definition);

					entry = new entry(word, definition);
					dictionary.add(entry);

					bw.write(entry);
						bw.newLine();
	 				bw.flush();
      				} catch (IOException ioe) {
	 					ioe.printStackTrace();
      				} finally {                       // always close the file
	 					if (bw != null) try {
	    					bw.close();
	 					} catch (IOException ioe2) {
	    			// just ignore it
	 				}
	 				break;
	 			}
			default: 
				System.out.print("Please choose a valid menu number: ");
				sel = sc.nextInt();
				break;
		}
	}
}