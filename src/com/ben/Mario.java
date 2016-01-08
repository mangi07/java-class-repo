/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 10:30 PM.
 * Course: LaunchCode Java Master Class 
 * Assignment: Pset 1
 */


package com.ben;

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

		StringBuilder spacesString = new StringBuilder();
		StringBuilder hashesString = new StringBuilder();

		for (int spaces = pyramidHeight - 1, hashes = 2; spaces >= 0;
				spaces--, hashes++) {

			for (int i = 0; i < spaces; i++) {
				spacesString.append(" ");	
			}

			for (int j = 0; j < hashes; j++) {
				hashesString.append("#");	
			}	

			System.out.print(spacesString.toString());
			System.out.printf("%s%n", hashesString.toString());

			spacesString.delete(0, spacesString.length());
			hashesString.delete(0, hashesString.length());


		}

	}

}
