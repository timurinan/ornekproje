package operators;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		// +,-,/,*,% (remainder) (ruþen has changed---)
		
		Scanner inputreader = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=inputreader.nextInt();
		System.out.println("Enter the second number:");
		int n2=inputreader.nextInt();
		System.out.println("The addition of numbers:"+(n1+n2));
		System.out.println("The difference of numbers:"+(n1-n2));
		System.out.println("The multiplication of numbers:"+n1*n2);
		System.out.println("The division of numbers:"+n1/n2);
		System.out.println("The remainder of numbers:"+n1%n2);
		inputreader.close();
	}

}
