package kn222gn_assign1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LargestK {

	public static void main(String args[]){
        System.out.println("Enter a positive integer: ");

        int k = 0;//the value to be calculated
        int sum = 0;//Sum of the calculation made

        int nValue;

        Scanner scanner = new Scanner(System.in);
        
        //Could break this out to a separate function! something like getIntInput().
        while(true){

            try {
            	nValue = scanner.nextInt();

                if(nValue < 0)
                    throw new IndexOutOfBoundsException("Value is to low!");
                else
                    break;
            }
            //catch a exception if the input is not a number
            catch (InputMismatchException e){
                System.out.print("NaN  ");
                //gets the next input
                scanner.next();
            }
            //Prints the error message.
            catch (IndexOutOfBoundsException e){
                System.out.print(e.getMessage());
                //scanner.close();//close the scanner.
            }
        }
        
        //Loops to calculate the k value.
        while(true){

            sum += k;
            
            if(sum + k + 2 > nValue){
                break;
            }
            
            k += 2;
        }
        
        System.out.printf("K = %d", k);
        scanner.close();
    }
}
