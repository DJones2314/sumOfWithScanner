package sumDigitWithScanner;

import java.util.Scanner;

public class sumOfAll {

	///////////////////Attributes//////////////////////
	//Need to polish so that the loop only runs to the below specified number rather than having an extra value added onto the final sum
	public static int howManyNumbers = 4;
	
	
	//////////////////Constructors//////////////////////
	sumOfAll(){
		
	}
	
	
	///////////////Methods////////////////////////////

	public static void numbersTotal() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter a number: ");

		int fNumber = scanner.nextInt();

		scanner.nextLine();

		int sumOf = 0;

		for (int i = 0; i < howManyNumbers; i++) {

			System.out.println("Enter another number: ");
			int number = scanner.nextInt();

			sumOf = number + sumOf;

			scanner.nextLine();

		}

		int totalNumber = fNumber + sumOf;

		System.out.println("The sum of all the numbers you entered is: " + totalNumber + ".");

		scanner.close();
	}

}
