package kn222gn_assign1;

import java.util.Scanner;

public class CountDigits {

	public static void main(String [] args){
		//Creates variables
		int value;
		int evenNumber = 0;
		int oddNumber = 0;
		int zeroNumber = 0;
		int sumNumber = 0;
		//Show User what's expected
		System.out.print("Enter a number: ");
		//scans the number/integer
		Scanner scanNumber = new Scanner(System.in);
		//scanNumber.next();
		//sets the input as value
		value = scanNumber.nextInt();
		//while value is higher than zero do this.
		while(value > 0){
			
			if((value%10) == 0){
				zeroNumber++;
			}
			else if(value%2==0){
				evenNumber++;
			}
			else{
				oddNumber++;
			}
			sumNumber += value % 10;
			//Not 100% sure what this does, but without it there will be no calculation. So it sets value to something.
			value/=10;
		}
		System.out.println();//Empty row
		//Output text with result.
		System.out.printf("Even numbers: %d, Odd numbers: %d, Zeros: %d, Sum: %d", evenNumber, oddNumber, zeroNumber, sumNumber+zeroNumber);
		scanNumber.close();
	}
}
