package kn222gn_assign1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Histogram {
	
	public static void main(String args[]){
		
		
		int oneTwentyFive = 0;
		
		String interval_one = "1-10 ";
		String interval_two = "11-20 ";
		String interval_three = "21-30 ";
		String interval_four = "31-40 ";
		String interval_five = "41-50 ";
		String interval_six = "51-60 ";
		String interval_seven = "61-70 ";
		String interval_eight = "71-80 ";
		String interval_nine = "81-90 ";
		String interval_ten = "91-100 ";
		String interval_eleven = "101-200 ";
		
		String path = args[0].toString();
		
		try{
			
			Scanner inputScanner = new Scanner(System.in);

			System.out.print("reading...\n\n");
			
			File file = new File(path);
			
			List <Integer> myList= new ArrayList<Integer>();
			
			//if the file doesn't exist!
			if(!file.exists()){
				
				System.out.print("File don't exist! ");
			}
			
			inputScanner = new Scanner(file);
			
			while(inputScanner.hasNext()){
				
				int currentNumber = inputScanner.nextInt();
				
				if(inputScanner.hasNextInt()){
					
					myList.add(inputScanner.nextInt());
					
				}
			}
			System.out.print(myList);
			
		}
		catch(Exception e){
			
		}
		
		
	}
}
