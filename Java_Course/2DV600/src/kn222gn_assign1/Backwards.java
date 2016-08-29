package kn222gn_assign1;

import java.util.Scanner;

public class Backwards {

	public static void main(String args[])
	{
		String originalText = "";  //Create variables
		String reversedText = "";
		System.out.println("Write something: ");//Output what's expected of the user
		
		Scanner inputText = new Scanner(System.in);//Scans for input
		
		originalText = inputText.nextLine();// Saves the original input
		
		//String answer = inputText.nextLine();
		int length = originalText.length();//Gets the lenght of the variable
		
		for(int i = length - 1 ; i >=0 ; i--)//For every letter this is happening
		{
			reversedText = reversedText + originalText.charAt(i);
		}
		
		//new StringBuilder(answer).reverse().toString();
		
		System.out.println(reversedText);
		inputText.close();
	}
}
