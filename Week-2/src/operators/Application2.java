/*This program takes two numbers from the user and compares the numbers then
shows the results.
*/
package operators;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		// Relational operators
		// >,<,>=,<=,==,!=
		//a>b? (true/false)
		
		Scanner inputreader = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double fn=inputreader.nextDouble();
		System.out.println("Please enter the second number:");
		double sn=inputreader.nextDouble();
		System.out.println("Is first number is bigger than second number"+(fn>sn));
		System.out.println("Is first number is smaller tnan second number:"+(fn<sn));
		System.out.println("Is first number is bigger than second number OR are they equal:"+(fn>=sn));
		System.out.println("Is first number is smaller than second number OR are they equal:"+(fn<=sn));
		System.out.println("Are the numbers are equal:"+(fn==sn));
		System.out.println("Are the numbers are different:"+(fn!=sn));
		inputreader.close();
		
		

	}

}
