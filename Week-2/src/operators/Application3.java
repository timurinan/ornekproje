

package operators;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// Logical operators
		//&& (and),|| (or), ^ (xor), ! (not)
		
		Scanner inputreader = new Scanner(System.in);
		System.out.println("Enter the score of the student:");
		double score=inputreader.nextDouble();
		
		if (!(score<=0||score>=100)) {//Is the score valid?
			
			if (score>=0&&score<=49) {
				System.out.println("FF");
			}else if (score>=50&&score<=59) {
				System.out.println("DD");
			}else if (score>=60&&score<=69) {
				System.out.println("DC");
			}else if (score>=70&&score<=79) {
				System.out.println("CC");
			}else if (score>=80&&score<=84) {
				System.out.println("CB");
			}else if (score>=85&&score<=89) {
				System.out.println("BB");
			}else if (score>=90&&score<=94) {
				System.out.println("BA");
			}else {
				System.out.println("AA");
			}
			
		} else {//The score is not valid.
			System.out.println("The score is not valid...");
		}
		
		inputreader.close();

	}

}
