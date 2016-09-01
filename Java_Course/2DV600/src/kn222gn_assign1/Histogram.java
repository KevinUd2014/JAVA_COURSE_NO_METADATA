package kn222gn_assign1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Histogram {
	
	public static void main(String[] args) {
		
		String oneToTen = "1-10:    |";
		String elevenToTwenty = "11-20:   |";
		String twentyOneToThirty = "21-30    |";
		String thirtyOneToForty = "31-40:   |";
		String fortyOneToFifty = "41-50:   |";
		String fiftyoneToSixty = "51-60:   |";
		String sixtyoneToSeventy = "61-70:   |";
		String seventyoneToEighty = "71-80:   |";
		String eightyoneToNinety = "81-90:   |";
		String ninetyoneToHundred = "91-100:  |";
		String underHundred = "1-100:   |";
		String overHundredToTwohundred = "101-200: |";
		
		String starOne= "";
		
		//int[] histogram = new int[12];
		
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
						oneToTen += "*";
						underHundred += "*";
						/*for(int i = 0; i < oneToTen; i++){
							starOne = convertToStars(oneToTen);
						}*/
						//histogram[1]++;
					}
					else if(currentNumber >= 11 && currentNumber <=20){
						elevenToTwenty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 21 && currentNumber <=30){
						twentyOneToThirty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 31 && currentNumber <=40){
						thirtyOneToForty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 41 && currentNumber <=50){
						fortyOneToFifty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 51 && currentNumber <=60){
						fiftyoneToSixty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 61 && currentNumber <=70){
						sixtyoneToSeventy += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 71 && currentNumber <=80){
						seventyoneToEighty += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 81 && currentNumber <=90){
						eightyoneToNinety += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 91 && currentNumber <=100){
						ninetyoneToHundred += "*";
						underHundred += "*";
						//histogram[2]++;
					}
					else if(currentNumber >= 101 && currentNumber <= 200){
						overHundredToTwohundred += "*";
					}
					
					//myList.add(inputScanner.nextInt());
					
				}
			}
			System.out.print("Histogram\n\n");
			System.out.println(oneToTen);
			System.out.println(elevenToTwenty);
			System.out.println(twentyOneToThirty);
			System.out.println(thirtyOneToForty);
			System.out.println(fortyOneToFifty);
			System.out.println(fiftyoneToSixty);
			System.out.println(sixtyoneToSeventy);
			System.out.println(seventyoneToEighty);
			System.out.println(eightyoneToNinety);
			System.out.println(ninetyoneToHundred);
			
			System.out.println(underHundred);
			System.out.println(overHundredToTwohundred);
			System.out.printf(starOne);
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
