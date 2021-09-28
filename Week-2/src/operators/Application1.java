/*This program takes a number from the user, then wants other numbers from the user
and stores the result in the same variable.
*/
package operators;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		// Arithmetical assignment operators
		//+=,-=,*=,/=,%=
		Scanner inputreader = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double number=inputreader.nextDouble();
		System.out.println("Enter the number you want to add:");
		double n=inputreader.nextDouble();
		number+=n;
		System.out.println("The number has become:"+number);
		System.out.println("Enter the number you want to substract:");
		n=inputreader.nextDouble();
		number-=n;
		System.out.println("The number has become:"+number);
		System.out.println("Enter the number you want to multiply:");
		n=inputreader.nextDouble();
		number*=n;
		System.out.println("The number has become:"+number);
		System.out.println("Enter the number you want to divide:");
		n=inputreader.nextDouble();
		number/=n;
		System.out.println("The number has become:"+number);
		System.out.println("Enter the number you want to see the remainder of:");
		n=inputreader.nextDouble();
		number%=n;
		System.out.println("The number has become:"+number);
		inputreader.close();
	}

}
