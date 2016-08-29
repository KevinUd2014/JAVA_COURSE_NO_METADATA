package kn222gn_assign1;

import java.util.Scanner;

public class Diamond {

	//public static Scanner scanner = new Scanner(System.in);

	public static void main (String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		int inputNumber;
		
		//inputNumber = scanner.nextInt();
		System.out.printf("Enter a Odd number: ");
		//inputNumber = scanner.nextInt();
		
		try{
			while(true){
				inputNumber = scanner.nextInt();
				
				if(inputNumber < 3 || inputNumber > 1000 || inputNumber % 2 == 0)
				{
					System.out.printf("Invalid program is set to numbers between 0 and 20!");
				}
				else{
					printDiamond(inputNumber);
				}
			}
		}
		catch(Exception e){
			System.out.println("Not a Number");
            //gets the next input
			//scanner.hasNextIext();
			//printDiamond(inputNumber);
		}
		scanner.close();
		
		//printDiamond(inputNumber);
		
		
	}
	
	public static void printDiamond(int inputNumber){
		
		int firstDot = 1;
		int multiDots = 2;
		
		for(int i = 0; i < inputNumber; i++){
			
			for(int j = 0; j < (inputNumber-firstDot)/2; j+=1){
				
				System.out.print(" ");
			}
			for(int j = 0; j < firstDot; j+=1){
				
				System.out.print("*");
			}
			
			System.out.println("");
			
			firstDot += multiDots;
			
			//When the loop gets to the inputnumber it will count down the opposit way.
			if(firstDot == inputNumber){
				multiDots = -2;
			}
		}
	}
}
