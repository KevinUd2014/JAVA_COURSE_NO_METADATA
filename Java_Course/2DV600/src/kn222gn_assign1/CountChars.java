package kn222gn_assign1;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.File;
import java.util.Scanner;

public class CountChars {

	public static void main(String args[]){
		
		int blancspaces = 0, numbers = 0, upperCase = 0, lowerCase = 0, isDigit = 0, otherDigit = 0;
		String path = args[0].toString();
		try{
			
			Scanner inputScanner = new Scanner(System.in);
			//System.out.print("Enter the path to the file to read: ");
			//String filePath = inputScanner.nextLine();
			System.out.print("reading...\n\n");
			File file = new File(path);
			
			//if the file doesn't exist!
			if(!file.exists()){
				System.out.print("File don't exist! ");
			}
			
			inputScanner = new Scanner(file);
			
			while(inputScanner.hasNextLine())
			{
				String line = inputScanner.nextLine();
				System.out.println(line);
				char charLetter;
				for(int i = 0; i < line.length(); i++){
					
					charLetter = line.charAt(i);
					
					if(Character.isUpperCase(charLetter)){
						
						upperCase++;
					}
					else if(Character.isLowerCase(charLetter)){
											
						lowerCase++;
					}
					else if(Character.isDigit(charLetter)){
						
						isDigit++;
					}
					else if(Character.isSpaceChar(charLetter)){
						
						blancspaces++;
					}
					else{
						
						otherDigit++;
					}
					
				}
				
			}
			System.out.println();
			System.out.print("Uper case characters: " + upperCase);
			System.out.println();
			System.out.print("Lower case characters: " + lowerCase);
			System.out.println();
			System.out.print("Digit characters: " + isDigit);
			System.out.println();
			System.out.print("Blancspace characters: " + blancspaces);
			System.out.println();
			System.out.print("Other characters: " + otherDigit);
			
			inputScanner.close();
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		//BufferedReader br = new BufferedReader(new FileReader("../hello.txt"));
	}
}
