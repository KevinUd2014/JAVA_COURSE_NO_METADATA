package kn222gn_assign1;

import java.io.File;
import java.util.Scanner;

public class Histogram {
	
	public static void main(String args[]){
		
		String path = args[0].toString();
		
		try{
			
			Scanner inputScanner = new Scanner(System.in);

			System.out.print("reading...\n\n");
			
			File file = new File(path);
			
			//if the file doesn't exist!
			if(!file.exists()){
				
				System.out.print("File don't exist! ");
			}
			
			inputScanner = new Scanner(file);
			
			while(inputScanner.hasNext()){
				
				//if(inputScanner.hasNextInt()){
					
					
					
				//}
			}
			
		}
		catch(Exception e){
			
		}
		
		
	}
}
