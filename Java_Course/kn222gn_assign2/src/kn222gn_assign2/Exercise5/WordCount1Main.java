package kn222gn_assign2.Exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Golde on 2016-09-21.
 */
public class WordCount1Main {

    private static String originalText;
    private static Set<Word> hashSet = new HashSet<Word>();
    private static Set<Word> treeSet = new TreeSet<Word>();

    public static void main(String args[]){

        try{//reads the file path and use other methods for the printout of content

            String path = args[0];
           // Set<Word> hashSet = new HashSet<Word>();

            //Scanner inputScanner = new Scanner(System.in);

            File newFile = new File(path);

            originalText = readFile(newFile);

            System.out.println(originalText);

            System.out.println("\n" + path);// check the path
        }
        catch(Exception error){

            System.err.println("Something went wrong when creating the file!");
        }
    }
    public static String readFile(File fileWithTest){//reads the file and returns a string to print out

        //String content = "";
        String contentToPrint = "";

        HashWordSet hashWordSet = new HashWordSet();

        try{

            Scanner scanner = new Scanner(fileWithTest);

            while(scanner.hasNext()){

                Word w = new Word(scanner.next());

                hashSet.add(w);
                treeSet.add(w);
                hashWordSet.add(w);//adds all the hash to the wordset

            }

            scanner.close();
        }
        catch(Exception error){

            System.err.println("\n\n File not found");
        }

        contentToPrint += " Hash set: " + hashSet.size() + "\n Tree set: " + treeSet.size() + "\n HashWordSet size: " + hashWordSet.size() + "\n";

        Iterator<Word> iteratorWord = hashWordSet.iterator();//adds the iterator to make it usable

        while(iteratorWord.hasNext()){//loops all the containing words from the iterator

            contentToPrint += "\n Iterator words: " + iteratorWord.next();
        }

        return contentToPrint;
    }
}
