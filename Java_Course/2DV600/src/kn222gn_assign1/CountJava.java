package kn222gn_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountJava {
	
	private static List<File> listOfFiles = new ArrayList<File>();
	
	static int countRow = 0;
	
	public static void main(String args[]){
		
		String path = args[0].toString();
		
		System.out.println("Root directory: " + path + "\n\n");
		
		CountJava.getFiles(path);
		
		List<Integer> numberOfLines = new ArrayList<>();
	}
	public static void getFiles(String path)
	{
		try{
			
			Scanner inputScanner = new Scanner(System.in);
			
			File file = new File(path);
			//if the file doesn't exist!
			if(!file.exists() || file == null){
				
				System.out.println("File don't exist! ");
			}
			else
			{
				//inputScanner = new Scanner(file);
				
				for(File x : file.listFiles())
				{
					
					if(x.isDirectory())
					{
						CountJava.getFiles(x.getAbsolutePath());
					}
					else if(x.isFile() && x.getName().endsWith(".java"))
					{
						listOfFiles.add(x);
						
					}
					//System.out.println(x.getName());
				}
				readJava(listOfFiles.get(0));
				
				//loops the WHOLE list 
				for(int y = 0; y < listOfFiles.size(); y++){
					
					//prints the linenumbers and scripts
					System.out.print(" " + listOfFiles.get(y).getName() + 
							", Lines:  " + readJava(listOfFiles.get(y)) +
							"\n");
					//System.out.print(y + " ");
				}
			}
			//readJava(inputScanner, file);
		}
		catch(Exception e){
			
			System.out.print("Something went wrong, check the exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static int readJava(File file){
		
		int lineCounter = 0;
		
		try{
			
			Scanner inputScanner = new Scanner(file);
			
			while(inputScanner.hasNextLine()){
				
				lineCounter++;
				inputScanner.nextLine();
			}
			
			return lineCounter;
			
			//System.out.println(lineCounter);
		}
		catch(Exception e){
			System.out.print("WRONG ");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return lineCounter = 0;
	}
}
