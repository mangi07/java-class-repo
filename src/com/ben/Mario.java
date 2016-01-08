/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 10:30 PM.
 * Course: LaunchCode Java Master Class 
 * Assignment: Pset 1
 */


package com.ben;

import java.util.Scanner;

public class Mario {

	public static void main(String[] varArgs) {

		int height = getInput();
		String pyramid = makePyramid(height);
		printPyramid(pyramid);

	}



	static int getInput () {

		Scanner inputNumber = new Scanner(System.in);
		int height = 0;
		try {
			height = inputNumber.nextInt();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Invalid input for height.");
			System.exit(1);
		}

		return height;

	}

	static String makePyramid (int pyramidHeight) {

		StringBuilder pyramid = new StringBuilder();

		for (int spaces = pyramidHeight - 1, hashes = 2; spaces >= 0;
				spaces--, hashes++) {

			for (int i = 0; i < spaces; i++) {
				pyramid.append(" ");
			}

			for (int j = 0; j < hashes; j++) {
				pyramid.append("#");
			}	

			pyramid.append(System.getProperty("line.separator"));

		}


		return pyramid.toString();

	}

	static void printPyramid(String pyramid) {

		System.out.println(pyramid);

	}

}
