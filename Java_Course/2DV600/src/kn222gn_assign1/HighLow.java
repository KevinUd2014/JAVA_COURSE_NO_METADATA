package kn222gn_assign1;

//import java.util.Random;
import java.util.Scanner;

public class HighLow {

	public static void main(String[] args)
	{
		//Random random = new Random();
		
		int minValue = 0;
		int maxValue = 100;
		
		if (maxValue % 2 == 0) 
			--maxValue;
		if (minValue % 2 == 0) 
			++minValue;
		
		//Creates a random number between 0 - 0,9999 and then multiply it with the maxValue-minValue(ex. 100-1=99)/2=49.5=~49x2+1 = 99 = odd number
		int randomNumber = minValue + 2*(int)(Math.random()*((maxValue-minValue)/2+1));
		//minValue=1+2
		int numberOfTries = 0;
		
		Scanner inputNumber = new Scanner(System.in);
		
		int guessByUser;
		
		boolean win = false;
		boolean outOfGuesses = false;
		
		if(win == false && outOfGuesses == false && numberOfTries != 10){
			System.out.println();
			System.out.println("Guess a number between 1 and 100: ");
			System.out.println();
		}
		
		while(win == false && outOfGuesses == false)
		{
			numberOfTries++;
			
			if(numberOfTries <= 10)
			{
				
				try{
					
					guessByUser = inputNumber.nextInt();//Don't use this line outside of this if-statement!
					if(guessByUser < minValue || guessByUser > maxValue)
					{
						System.out.printf("Invalid guess only between 0 and 100!");
						numberOfTries--;
					}
					
					if(guessByUser == randomNumber)
					{
						win = true;
						System.out.println();
						System.out.printf("You made it mate! Congratulations mate! It only took %d attempts", numberOfTries);
						inputNumber.close();
						break;
					}
					else if(guessByUser < randomNumber)
					{
						System.out.printf("Guess: %d", numberOfTries);
						System.out.println();
						System.out.printf("         Your guess of %d is low!", guessByUser);
						System.out.println();
					}
					else if(guessByUser > randomNumber)
					{
						System.out.printf("Guess: %d ", numberOfTries);
						System.out.println();
						System.out.printf("         Your guess of %d is high!", guessByUser);
						System.out.println();
					}
				}
				catch(Exception e){
					System.out.println("NaN  ");
	                //gets the next input
	                inputNumber.next();
	                numberOfTries--;
				}
			}
			else{
				outOfGuesses = true;
				System.out.println();
				System.out.printf("Sorry you're out of guesses mate! The number was %d", randomNumber);
				inputNumber.close();
			}
		}
	}
}
