// final area
import java.util.Scanner; // input scanner

public class randSet {
	public static int randInt(int min, int max) {
		return (int)((Math.random() * (max-min) + min));
		// entire method to setup a method to use max-min
	}
	public static double randDeci(double min, double max) {
		return (double)((Math.random() * (max - min) + min));
	}	
		// same thing but double
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int q = 0;
		System.out.println("What would you like to find randomly?\n1 for Integers, 2 for Decimals"); 
			int choice1 = read.nextInt(); // chooses option
			if(choice1 == 1) {
				System.out.println("# of random integers: ");
				int cint = read.nextInt(); // collects amount of integers
				System.out.println("Lowest number(inclusive): ");
				int lowInt = read.nextInt(); // collects low range
				System.out.println("Highest number(inclusive): ");
				int highInt = read.nextInt(); // collects high range
				System.out.println("Here are your numbers: ");
				while (q <= cint - 1) {
					int output = randInt(lowInt, highInt);
					System.out.println(output);
					q++;
				}
			}
			else {
				System.out.println("# of random decimals: ");
				int cDou = read.nextInt();
				System.out.println("Lowest number (decimal + inclusive): ");
				double lowDou = read.nextDouble();
				System.out.println("Highest number (decimal + inclusive): ");
				double highDou = read.nextDouble();
				System.out.println("Here are your numbers: ");
				while (q <= cDou - 1) {
					double output = randDeci(highDou, lowDou);
					System.out.println(output); 
					q++;
			}
			}
		
		 }
}



