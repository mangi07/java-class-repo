/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 10:30 PM.
 * Course: LaunchCode Java Master Class 
 * Assignment: Pset 1
 */


import java.io.Console;

public class Mario {

	public static void main(String[] varArgs) {

		int height = getInput();
		printPyramid(height);

	}


	
	static int getInput () {

		Console c = System.console();
		String stringHeight = c.readLine("Enter pyramid height:");
		int height = 0;
		
		try {
			height = Integer.parseInt(stringHeight);
		} catch (Exception e) {
			System.out.println("Could not parse height due to error: "
				+ e);
			System.exit(1);	
		}

		return height;


	}

	static void printPyramid (int pyramidHeight) {
		
		for (int spaces = pyramidHeight - 1, hashes = 2; spaces >= 0;
			  spaces--, hashes++) {
			 		 
			for (int i = 0; i < spaces; i++) {
				System.out.print(" ");	
			}

			for (int j = 0; j < hashes; j++) {
				System.out.print("#");	
			}	

			System.out.println();

		}

	}

}
