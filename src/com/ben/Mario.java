package com.ben;

import com.ben.printStrategies.ConsoleOutput;
import com.ben.printStrategies.FileOutput;

import java.util.Scanner;

/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 2:30 PM.
 * Course: LaunchCode Java Master Class
 * Assignment: Pset 2
 */
public class Mario {

	public static void main(String[] varArgs) {

		Mario mario = new Mario(PyramidFactory.getInstance());
		Pyramid pyramid = mario.createPyramid(PyramidFactory.getInstance());
		pyramid.print();

	}

	private PyramidFactory factory;

	public Mario (PyramidFactory factory) {
		this.factory = factory;
	}

	public Pyramid createPyramid(PyramidFactory factory) {

		int height = getInteger("Please enter pyramid's height:");
		Printer strategy = getPrintStrategy();
		Pyramid pyramid = factory.buildPyramid(height, strategy);

		return pyramid;
	}

	private int getInteger (String userPrompt) {

		Scanner input = new Scanner(System.in);
		int number;

		String retry;
		while (true) {
			try {
				System.out.println(userPrompt);
				number = input.nextInt();
				if (number < 1) {
					throw new Exception("The number must be greater than 0.");
				}
				System.out.printf("Input taken: %d%n", number);
				break;
			} catch (Exception e) {
				input.nextLine();
				System.out.printf("Invalid input: " + e.getMessage()
					+ "%n%nWould you like to try again (y/n)?  ");
				retry = input.nextLine();
				if (retry.equals("n")) {
					System.exit(1);
				}
			}
		}

		return number;

	}

	private Printer getPrintStrategy() {
		Scanner in = new Scanner(System.in);
		String inputString;

		while (true) {
			System.out.printf("Please enter 1 or 2:%n" +
					"1. Print pyramid to file.%n" +
					"2. Print pyramid to console output.%n");

			inputString = in.nextLine();

			if (inputString.equals("1")) {
				return new FileOutput();
			}
			else if (inputString.equals("2")) {
				return new ConsoleOutput();
			}

			System.out.printf("Invalid input: " + inputString
					+ "%n%nWould you like to try again (y/n)?  ");
			inputString = in.nextLine();
			if (inputString.equals("n")) {
				System.exit(1);
			}
		}
	}

}
