/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 10:30 PM.
 * Course: LaunchCode Java Master Class 
 * Assignment: Pset 1
 */


package com.ben;

import java.io.*;
import java.util.Scanner;

public class Mario {

	public static void main(String[] varArgs) {

		int height = getInput();
		String pyramid = makePyramid(height);
		printPyramid(pyramid, isPrintFile());

	}



	static int getInput () {

		Scanner inputNumber = new Scanner(System.in);
		int height = 0;

		System.out.println("Please enter pyramid height:");

		try {
			height = inputNumber.nextInt();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Invalid input for height: " + e.getMessage());
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

	// rename this method to getOutputStrategy
	static boolean isPrintFile() {
		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.printf("Please enter 1 or 2:%n" +
					"1. Print pyramid to file.%n" +
					"2. Print pyramid to console output.%n");

			// use Scanner regular expressions to filter input
			//   and then catch exceptions
			String number = in.next();

			// refactor the following with the strategy design pattern
			//   using 1 abstract class: Pyramid extends OutputStrategy
			//   with one method Pyramid.print()
			//   where ConsolePyramid and FilePyramid extend Pyramid
			if (number.equals("1"))
				return true;
			else if (number.equals("2")) {
				return false;
			}

			System.out.println("Invalid input...");

		}
	}

	static void printPyramid (String pyramid, boolean toFile) {

		if (toFile) {
			File file = new File("mario.txt");

			try (BufferedWriter bw = new BufferedWriter(
					new FileWriter(file.getAbsoluteFile()))) {
				bw.write(pyramid);
			} catch (IOException e) {
				System.out.println("Could not find this file:" + e.getMessage());
			}
		} else {
			System.out.println(pyramid);
		}
	}

}
