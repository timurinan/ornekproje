package operators;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		// ?:
		//This program checks if the given number is odd or even
		Scanner inputreader = new Scanner(System.in);
		System.out.println("Please enter a number to check if even or odd:");
		int number=inputreader.nextInt();
		System.out.println("The number is:"+(number%2==0?"even":"odd"));
		inputreader.close();

	}

}
