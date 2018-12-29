package id.ststech.primenumbers;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;
		int number;

		do {
			
			System.out.print("Please input a number between (1-100): ");

			input = scanner.nextLine();

			// Converts into int
			number = Integer.parseInt(input);
			
		} while (number < 1 || number > 100); // This will make sure number only between 1 and 100

		NumberUtil.isPrime ( number );
		
		scanner.close();
	}

}
