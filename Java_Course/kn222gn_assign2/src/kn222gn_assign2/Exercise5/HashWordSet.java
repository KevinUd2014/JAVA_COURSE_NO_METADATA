package kn222gn_assign2.Exercise5;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-21.
 */
public class HashWordSet implements WordSet{

    private int size;
    private Node[] bucket = new Node[8];

    private class Node{//from slides

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
    public void add(Word word) {//from slides

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
            size += 1;// add 1 to size

            if(size == bucket.length){

                rehash();
            }
        }
    }

    private void rehash() {//from slides

        Node[] temp = bucket;

        bucket = new Node[2*temp.length];

        size = 0;

        for(Node n : temp){

            if(n == null){

                continue;
            }
            while(n != null){

                add(n.value);
                n = n.next;
            }
        }
    }

    @Override
    public boolean contains(Word word) {//from slides

        int position = getBucketNumber(word);
        Node node = bucket[position];

        while(node != null){

            if(node.value.equals(word)){

                return true;
            }
            else{

                node = node.next;
            }
        }
        return false;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public Iterator<Word> iterator() {

        return new iteratorClass();
    }

    private int getBucketNumber(Word word){//from slides

        int hashCode = word.hashCode();
        if(hashCode < 0){

            hashCode = -hashCode;
        }

        return hashCode % bucket.length;
    }
    private class iteratorClass implements Iterator<Word> {

        private Node node;
        private int index = 0;

        public boolean hasNext() {

            return false;
        }
        public Word next() {

            return;
        }
    }
}
