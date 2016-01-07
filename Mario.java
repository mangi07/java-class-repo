/**
 * Author: Ben Olson
 * Date: 1/06/16
 * Time: 4:30 PM
 */


import java.io.Console;

public class Mario {

	public static void main(String[] varArgs) {

		getInput();

	}

	static void getInput () {

		Console c = System.console();
		String stringHeight = c.readLine("Enter pyramid height:");
		try {
			height = Integer.parseInt(stringHeight);
		} catch (Exception e) {
			System.out.println("Could not parse height due to error: "
				+ e);
			System.exit(1);	
		}


	}

	static int height = 0;


}
