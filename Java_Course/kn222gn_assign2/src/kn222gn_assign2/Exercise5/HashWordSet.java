package kn222gn_assign2.Exercise5;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-21.
 */
public class HashWordSet implements WordSet{

    private int size;
    private Node[] bucket = new Node[8];

    private class Node{

        Word value;
        Node next = null;

        public Node(Word word){

            value = word;
        }
        public String toString(){

            return value.toString();
        }
    }

    @Override
    public void add(Word word) {

        int position = getBucketNumber(word);
        Node node = bucket[position];

        while(node != null){

            if(node.value.equals(word)){

                return;
            }
            else{

                node = node.next;
            }

            node = new Node(word);
            node.next = bucket[position];
            bucket[position] = node;
            size+=1;

            if(size == bucket.length){

                rehash();
            }
        }
    }

    private void rehash() {


    }

    @Override
    public boolean contains(Word word) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private int getBucketNumber(Word word){

        int hashCode = word.hashCode();
        if(hashCode < 0){

            hashCode = -hashCode;
        }
        return 0;
    }
}
