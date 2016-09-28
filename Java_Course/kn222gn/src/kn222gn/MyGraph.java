package kn222gn;

import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-27.
 */
public class MyGraph<E> implements DirectedGraph<E> {

    private Map<E, MyNode<E>> item2node = new HashMap<E, MyNode<E>>();

    private Set<Node<E>> heads = new HashSet<>();
    private Set<Node<E>> tails = new HashSet<>();

    //private Set<Node<E>> setNode = new HashSet<Node<E>>();

    public MyGraph(){

    }

    @Override
    public Node<E> addNodeFor(E item) {

        try {

            if (containsNodeFor(item)) {

                System.out.println(" Item already exists. addNodeFor");

                return null;
            }
            else {

                MyNode myNode = new MyNode<>(item);

                tails.add(myNode);
                heads.add(myNode);

                item2node.put(item, myNode);

                return myNode;
            }
        }
        catch(NullPointerException e){

            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Node<E> getNodeFor(E item) {

        if(item == null){

            throw new  NullPointerException(" getNodeFor is null ");
        }
        else
            return item2node.get(item);
    }

    @Override
    public boolean addEdgeFor(E from, E to) {

        if(from == null || to == null){

            throw new RuntimeException(" null is not acceptable input. addEdgeFor ");
        }

        MyNode<E> src = (MyNode<E>) addNodeFor(from);
        MyNode<E> tgt = (MyNode<E>) addNodeFor(to);

        if(src.hasSucc(tgt)){
            return false;
        }
        else{
            src.addSucc(tgt);
            tgt.addPred(src);

            tails.remove(src);
            heads.remove(tgt);

            return true;
        }
    }

    @Override
    public boolean containsNodeFor(E item) {

        if(item == null)
            throw new NullPointerException(" Null pointer in containsNodeFor ");

        return item2node.containsKey(item);
    }

    @Override
    public int nodeCount() {

        return item2node.size();
    }

    @Override
    public Iterator<Node<E>> iterator() {

        return null;
    }

    @Override
    public Iterator<Node<E>> heads() {

        return null;
    }

    @Override
    public int headCount() {

        return heads.size();
    }

    @Override
    public Iterator<Node<E>> tails() {

        return null;
    }

    @Override
    public int tailCount() {

        return tails.size();
    }

    @Override
    public List<E> allItems() {
        return null;
    }

    @Override
    public int edgeCount() {
        return 0;
    }

    @Override
    public void removeNodeFor(E item) {

        if(item == null && containsNodeFor(item)){

            item2node.remove(item);// this may not be the correct item to delete
        }
        else {
            throw new  NullPointerException(" removeNodeFor is null ");
        }
    }

    @Override
    public boolean containsEdgeFor(E from, E to) {
        return false;
    }

    @Override
    public boolean removeEdgeFor(E from, E to) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
