import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double correctCount = 0;
				
		System.out.println("Choose Heads or Tails");
		String headsOrTailsGuess = scnr.next();
		
		System.out.println("How many flips?");
		int numberOfFlips = scnr.nextInt();
		
		for (int i = 0; i < numberOfFlips; i++) { 
						
			String result;
			
			if ((int) Math.round(Math.random()) == 0 ) {
				result = "HEADS";
			} 	else {
				result = "TAILS";
			}
			
			System.out.println(result);
			
			if (result.equalsIgnoreCase(headsOrTailsGuess)) {
				correctCount++;
			}
			
		} 

		System.out.print("Your guess, " + headsOrTailsGuess + ", was correct " + (int)correctCount + " times. That is " + String.format("%.2f", ((correctCount/numberOfFlips) * 100)) + "% right!");
		
	}
}	
