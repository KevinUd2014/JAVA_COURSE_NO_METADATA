package kn222gn_assign2.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Golde on 2016-09-21.
 */
public class WordCount1Main {

    private static String originalText;

    public static void main(String args[]){

        try{

            String path = args[0];

            //Scanner inputScanner = new Scanner(System.in);

            File newFile = new File(path);
            originalText = readFile(newFile);
            System.out.println(path);
        }
        catch(Exception error){

            System.err.println("Something went wrong when creating the file!");
        }
    }
    public static String readFile(File fileWithTest){

        String content = "";
        String contentToPrint = "";

        try{

            Scanner scanner = new Scanner(fileWithTest);

            while(scanner.hasNext()){

                content += scanner.nextLine() + "\n";
            }

            char[] characters = content.toCharArray();

            for(Character character : characters){

                //only do this when these characters are found in the text file
                if(Character.isLetter(character) || Character.isWhitespace(character)){

                    contentToPrint += character;
                }
                scanner.close();
            }
        }
        catch(FileNotFoundException error){

            System.err.println("File not found");
        }
        return contentToPrint;
    }
}
