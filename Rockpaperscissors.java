import java.util.Random; 
import java.util.Scanner;

public class Rockpaperscissors {

	public static void main (String [] args) {
		
		int loop = 0;
		
		while (loop < 100) {
			
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		
		int rpsGenerator = ran.nextInt(3);
		
		System.out.println("Lets play Rock Paper Scissors, type in which one you'll play, "
				+ "\nthen i'll play mine, and we'll see who wins.");
		
		String userAnswer = input.nextLine();
		
		if (userAnswer.equals("Rock") || userAnswer.equals("Paper") ||
				userAnswer.equals("Scissors")) {
			
			System.out.println("You said " + userAnswer);
			
		}
		
		if (rpsGenerator == 0) {
			
			System.out.println("I say Rock");
			
		}
		
		if (rpsGenerator == 1) {
			
			System.out.println("I say Paper");
			
		}
		
		if (rpsGenerator == 2) {
			
			System.out.println("I say Scissors");
			
		}
		
		if (rpsGenerator == 0 && userAnswer.equals("Rock") ) {
			
			System.out.println("It's a tie");
		}
		
		if (rpsGenerator == 1 && userAnswer.equals("Rock") ) {
			
			System.out.println("I won!");
		}
		
		if (rpsGenerator == 2 && userAnswer.equals("Rock") ) {
			
			System.out.println("You won!");
		}
		
		if (rpsGenerator == 0 && userAnswer.equals("Paper") ) {
			
			System.out.println("You won!");
		}
		
		if (rpsGenerator == 1 && userAnswer.equals("Paper") ) {
			
			System.out.println("It's a tie");
		}
		
		if (rpsGenerator == 2 && userAnswer.equals("Paper") ) {
			
			System.out.println("I won!");
		}
		
		if (rpsGenerator == 0 && userAnswer.equals("Scissors") ) {
			
			System.out.println("I won!");
		}
		
		if (rpsGenerator == 1 && userAnswer.equals("Scissors") ) {
			
			System.out.println("You won!");
		}
		
		if (rpsGenerator == 2 && userAnswer.equals("Scissors") ) {
			
			System.out.println("It's a tie!");
		
		    }
		
		    System.out.println("Would you like to play again? type true for yes and false for no.");
	
		boolean userTorF = input.nextBoolean();
		    
		 if (userTorF == true) {
		    loop++;
		}
		
		else {
		    System.out.println("Thanks for playing!");
		    break;
		    
			}
		
		}
		
	}
	
}

