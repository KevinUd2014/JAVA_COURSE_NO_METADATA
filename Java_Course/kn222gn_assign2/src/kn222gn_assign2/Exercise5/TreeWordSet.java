package kn222gn_assign2.Exercise5;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-21.
 */
public class TreeWordSet implements WordSet {

    private Node root = null;//sets the node root to null as standard
    private int size = 0;

    @Override
    public void add(Word word) {

        if (root == null) {

            size++;
            root = new Node(word);
        }
        else{

            if(contains(word))
                return;

            size++;
            root.add(word);
        }
    }

    @Override
    public boolean contains(Word word) {

        return root.contains(word);
    }

    @Override
    public int size() {

        return size;//return size
    }

    protected void print(){

        root.print();
    }

    @Override
    public Iterator iterator() {

        return new iteratorClass();
    }

    private class iteratorClass implements Iterator<Word> {

        //private Node node;
        Queue queue = new Queue<Word>();

        private iteratorClass(){

            treeIterator(root);
        }
        public boolean hasNext(){

            if(queue.isEmpty()) {

                return false;
            }
            else
                return true;
        }
        public Word next(){

            Node node = (Node)queue.dequeue();
            return node.word;
        }
        public void treeIterator(Node node){

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

        public void add(Word _word) {//From slides

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
        public boolean contains(Word _word){//From slides

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
        private void print(){

            if(left != null)
                left.print();

            System.out.println(" " + this.word);

            if(right != null)
                right.print();
        }
    }
}
