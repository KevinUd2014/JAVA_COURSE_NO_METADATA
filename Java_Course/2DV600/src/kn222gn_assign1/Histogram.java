package kn222gn_assign1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Histogram {
	
	public static void main(String[] args) {
		
		int oneToTen = 0;
		int elevenToTwenty = 0;
		int twentyOneToThirty = 0;
		int thirtyOneToForty = 0;
		int fortyOneToFifty = 0;
		int fiftyoneToSixty = 0;
		int sixtyoneToSeventy = 0;
		int seventyoneToEighty = 0;
		int eightyoneToNinety = 0;
		int ninetyoneToHundred = 0;
		int underHundred = 0;
		int overHundredToTwohundred = 0;
		
		int[] histogram = new int[12];
		
		String path = args[0].toString();
		
		try{
			
			Scanner inputScanner = new Scanner(System.in);
			
			File file = new File(path);
			
			//List <Integer> myList= new ArrayList<Integer>();
			
			//if the file doesn't exist!
			if(!file.exists()){
				
				System.out.print("File don't exist! ");
			}
			
			inputScanner = new Scanner(file);
			
			while(inputScanner.hasNext()){
				
				int currentNumber = inputScanner.nextInt();
				
				if(inputScanner.hasNextInt()){
					
					if(currentNumber >= 1 && currentNumber <=10){
						oneToTen += 1;
						underHundred += 1;
						histogram[1]++;
					}
					else if(currentNumber >= 11 && currentNumber <=20){
						elevenToTwenty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 21 && currentNumber <=30){
						twentyOneToThirty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 31 && currentNumber <=40){
						thirtyOneToForty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 41 && currentNumber <=50){
						fortyOneToFifty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 51 && currentNumber <=60){
						fiftyoneToSixty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 61 && currentNumber <=70){
						sixtyoneToSeventy += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 71 && currentNumber <=80){
						seventyoneToEighty += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 81 && currentNumber <=90){
						eightyoneToNinety += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 91 && currentNumber <=100){
						ninetyoneToHundred += 1;
						underHundred += 1;
						histogram[2]++;
					}
					else if(currentNumber >= 101 && currentNumber <= 200){
						overHundredToTwohundred += 1;
					}
					
					//myList.add(inputScanner.nextInt());
					
				}
			}
			System.out.print("Histogram\n\n");
			System.out.printf("Interval 1-10 : %d\n\nInterval 11-20 : %d\n\nInterval 21-30 : %d"
					+ "\n\nInterval 31-40 : %d\n\nInterval 41-50 : %d\n\nInterval 51-60 : %d"
					+ "\n\nInterval 61-70 : %d\n\nInterval 71-80 : %d"
					+ "\n\nInterval 81-90 : %d\n\nInterval 91-100 : %d", oneToTen, elevenToTwenty, twentyOneToThirty, thirtyOneToForty, fortyOneToFifty, 
					fiftyoneToSixty, sixtyoneToSeventy, seventyoneToEighty, eightyoneToNinety, ninetyoneToHundred);
			System.out.printf("\n\nIn the interval of 1-100: %d", underHundred);
			System.out.printf("\n\nIn the interval of 101-200: %d", overHundredToTwohundred);
		}
		catch(Exception e){
			System.out.print("Wrong, wrong");
		}
	}
	/*private static String convertToStars(int num) {
		
	    StringBuilder builder = new StringBuilder();
	    for (int j = 0; j < num; j++) {
	    	
	        builder.append('*');
	    }
	    return builder.toString();
	}*/
}
