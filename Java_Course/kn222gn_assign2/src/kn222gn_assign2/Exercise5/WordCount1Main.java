package kn222gn_assign2.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Golde on 2016-09-21.
 */
public class WordCount1Main {

    private static String originalText;
    private static Set<Word> hashSet = new HashSet<Word>();
    private static Set<Word> treeSet = new TreeSet<Word>();

    public static void main(String args[]){

        try{

            String path = args[0];
           // Set<Word> hashSet = new HashSet<Word>();

            //Scanner inputScanner = new Scanner(System.in);

            File newFile = new File(path);

            originalText = readFile(newFile);

            System.out.println(originalText);

            System.out.println("\n" + path);
        }
        catch(Exception error){

            System.err.println("Something went wrong when creating the file!");
        }
    }
    public static String readFile(File fileWithTest){

        //String content = "";
        String contentToPrint = "";

        try{

            Scanner scanner = new Scanner(fileWithTest);

            while(scanner.hasNext()){

                Word w = new Word(scanner.next());

                hashSet.add(w);
                treeSet.add(w);
                //content += scanner.nextLine() + "\n";
            }

            contentToPrint += hashSet.size() + "/" + treeSet.size();

        }
        catch(FileNotFoundException error){

            System.err.println("File not found");
        }
        return contentToPrint;
    }
}
