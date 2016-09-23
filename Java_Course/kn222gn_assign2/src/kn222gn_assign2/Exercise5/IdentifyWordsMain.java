package kn222gn_assign2.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by Golde on 2016-09-21.
 */
public class IdentifyWordsMain {

private static String originalText;

    public static void main(String args[]){

        try{

            String path = args[0];//"D:\\new\\Java_course\\JAVA_COURSE_NO_METADATA\\Java_Course\\kn222gn_assign2\\src\\kn222gn_assign2\\Exercise5\\HistoryOfProgramming.txt";

            //Scanner inputScanner = new Scanner(System.in);

            File newFile = new File(path);
            originalText = readFile(newFile);

            //System.out.println(originalText);
            createFile(originalText, path);
        }
        catch(Exception error){

            System.err.println("Something went wrong when creating the file!");
        }
    }
    public static String readFile(File fileWithTest){// reads the file from the path

        String content = "";
        String contentToPrint = "";

        try{

            Scanner scanner = new Scanner(fileWithTest);

            while(scanner.hasNext()){// scans for the next line

                content += scanner.nextLine() + "\n";
            }

            char[] characters = content.toCharArray();

            for(Character character : characters){//for all characters in character and adding only if there is a letter or a whitespace

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
    public static void createFile(String originalText, String path){ //this creates the "word" text file in this case using filewriter


        File file = new File(path);

        try{

            //System.out.println("hello");
            FileWriter writer = new FileWriter(file.getParentFile().getPath() + "/words" + ".txt");
            writer.write(originalText);
            writer.flush();
            writer.close();
        }
        catch(IOException error){

            System.err.println("Error when creating the file");
        }

    }
}
