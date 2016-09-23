package kn222gn_assign2.Exercise5;

import java.io.File;
import java.util.*;

/**
 * Created by Golde on 2016-09-23.
 */
public class WordCount2Main {

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

            System.out.println(error.getMessage());
            System.err.println("Something went wrong when creating the file!");
        }
    }
    public static String readFile(File fileWithTest){

        //String content = "";
        String contentToPrint = "";

        TreeWordSet treeWordSet = new TreeWordSet();

        try{

            Scanner scanner = new Scanner(fileWithTest);

            while(scanner.hasNext()){

                Word w = new Word(scanner.next());

                hashSet.add(w);
                treeSet.add(w);
                treeWordSet.add(w);
            }

            scanner.close();
        }
        catch(Exception error){

            System.err.println("\n\n File not found");
        }

        Iterator<Word> iteratorWord = treeWordSet.iterator();

        contentToPrint += " Hash set: " + hashSet.size() + "\n Tree set: " + treeSet.size() + "\n TreeWordSet size: " + treeWordSet.size() + "\n\n"  + "Words in order: \n\n";

        while(iteratorWord.hasNext()){

            contentToPrint += "\n  " + iteratorWord.next();
        }

        return contentToPrint;
    }
}
