import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String headsOrTailsGuess;
		int numberOfFlips = 0;
		double correctCount = 0;
		int heads = 0;
		int tails = 0;
		
		System.out.println("Choose Heads or Tails");
		headsOrTailsGuess = scnr.next().toUpperCase();
		if(headsOrTailsGuess.equalsIgnoreCase("HEADS") || headsOrTailsGuess.equalsIgnoreCase("TAILS")) {
		} else {
			System.out.println("That is not a valid input.  Please try again.");
			System.exit(0);
		} 
					
		System.out.println("Choose the amount of flips.");
		try {
			numberOfFlips = scnr.nextInt();
		} catch (Exception e) {
			System.out.println("That is not a valid input.  Please try again.");
			System.exit(0);
		}
		
		for (var i = 0; i < numberOfFlips; i++) {
			if(Math.random() >.5) {
				heads++;	
				System.out.println("HEADS");
				correctCount = heads;				
			} else {
				tails++;
				System.out.println("TAILS");
				correctCount = tails;
			} 
			
		} 
		double percent =  correctCount/numberOfFlips * 100;
		System.out.print("Your guess, " + headsOrTailsGuess + ", was correct " + String.format("%.0f", correctCount) + " times. That is " + String.format("%.2f", percent) + "% right!");
	}
}