package kn222gn_assign2.Exercise5;

/**
 * Created by Golde on 2016-09-21.
 */
public class Word implements Comparable<Word> {

    private String word;

    public Word(String str) {

        //returns the string
        word = str;
    }
    public String toString() {

        return word;
    }
    /* Override Object methods */
    public int hashCode() { /*"compute a hash value for word"*/
        //returns the hash value of the word

        int hashCode = 0;

        for(int i = 0; i < word.length(); i+=1){

            char character = word.charAt(i);
            hashCode += Character.getNumericValue(character);
        }
        return  hashCode;
    }
    public boolean equals(Object other) { /*"true if two words are equal"*/
        //Checks if the words are equal and returns a boolean if true or false
        if(other instanceof Word){

            Word otherWord = (Word) other;
            return word.toLowerCase().equals(otherWord.word.toLowerCase());
        }
        return false;
    }
    /* Implement Comparable */
    public int compareTo(Word w) { /*"compares two words lexicographically"*/
        //compare two words.

        return word.compareToIgnoreCase(w.toString());//w.word?
    }
}
