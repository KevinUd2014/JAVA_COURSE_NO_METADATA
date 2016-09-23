package kn222gn_assign2.Exercise5;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-21.
 */
public class TreeWordSet implements WordSet {

    private Node root = null;//sets the node root to null as standard
    private int size = 0;

    @Override
    public void add(Word word) {//from slides

        if (root == null) {

            size++;
            root = new Node(word);
        }
        else{

            if(contains(word))//has to check this so that the same words don't count multiple times
                return;

            size++;
            root.add(word);
        }
    }

    @Override
    public boolean contains(Word word) {//From slides

        return root.contains(word);
    }

    @Override
    public int size() {//from last exercise

        return size;//return size
    }

    protected void print(){//don't use this but can be used to print content

        root.print();
    }

    @Override
    public Iterator iterator() {//iterate like all the other exercises

        return new iteratorClass();
    }

    private class iteratorClass implements Iterator<Word> {

        //private Node node;
        Queue queue = new Queue<Word>();

        private iteratorClass(){

            //checks if the left and right isn't null otherwise adds them to the queue
            treeIterator(root);
        }
        public boolean hasNext(){

            //checks so that the queue isn't empty
            if(queue.isEmpty()) {

                return false;
            }
            else
                return true;
        }
        public Word next(){

            //deque the words and then use this to write them out
            Node node = (Node)queue.dequeue();
            return node.word;
        }
        public void treeIterator(Node node){

            //checks if the left and right isn't null otherwise adds them to the queue
            if(node.left != null)
                treeIterator(node.left);
            queue.enqueue(node);

            if(node.right != null)
                treeIterator(node.right);
        }
    }

    public class Node{

        Word word;

        Node left = null;
        Node right = null;

        public Node(Word word){

            this.word = word;
        }

        public void add(Word _word) {//From slides adds the words to the right side or the left side depending on the word "value"

            if(_word.compareTo(this.word) < 0){

                if(left == null){

                    left = new Node(_word);
                }
                else
                    left.add(_word);
            }
            else if(_word.compareTo(this.word) > 0){

                if(right == null){

                    right = new Node(_word);
                }
                else
                    right.add(_word);
            }
        }
        public boolean contains(Word _word){//From slides, Checks if the word contains the different words already

            if(_word.compareTo(this.word) < 0){

                if(left == null){

                    return false;
                }
                else
                    return left.contains(_word);
            }
            else if(_word.compareTo(this.word) > 0){

                if(right == null){

                    return false;
                }
                else
                    return right.contains(_word);
            }
            return true;
        }
        private void print(){// prints the left and the right side. From slides.

            if(left != null)
                left.print();

            System.out.println(" " + this.word);

            if(right != null)
                right.print();
        }
    }
}
