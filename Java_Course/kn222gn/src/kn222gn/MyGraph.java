package kn222gn;

import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-27.
 */
public class MyGraph<E> implements DirectedGraph<E> {

    private Map<E, MyNode<E>> item2node = new HashMap<>();

    private Set<Node<E>> heads = new HashSet<>();
    private Set<Node<E>> tails = new HashSet<>();

    //private Set<Node<E>> setNode = new HashSet<>();

    public MyGraph(){

    }

    @Override
    public Node<E> addNodeFor(E item) {

        if(item == null){
            throw new NullPointerException(" null in addNodeFor ");
        }
        if (containsNodeFor(item)) {
            return item2node.get(item);
        }
        else {

            MyNode myNode = new MyNode<>(item);

            tails.add(myNode);
            heads.add(myNode);

            item2node.put(item, myNode);

            return myNode;
        }

    }

    @Override
    public Node<E> getNodeFor(E item) {

        if(item == null){

            throw new  NullPointerException(" getNodeFor is null ");
        }
        if(!item2node.containsKey(item)){

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
        }
        return true;
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
        List<Node<E>> list = new ArrayList<>(item2node.values());
        return list.iterator();
    }

    @Override
    public Iterator<Node<E>> heads() {

        return heads.iterator();
    }

    @Override
    public int headCount() {

        return heads.size();
    }

    @Override
    public Iterator<Node<E>> tails() {

        return tails.iterator();
    }

    @Override
    public int tailCount() {

        return tails.size();
    }

    @Override
    public List<E> allItems() {

        //returns all the items in the item2node as a list.

        List myList = new ArrayList<>();

        for(MyNode<E> val : item2node.values()){

            myList.add(val.item());//Had error when I just put val in there
        }
        return myList;
    }

    @Override
    public int edgeCount() {

        //counts all the edges in the item2node map.

        int count = 0;

        for(MyNode val : item2node.values()){

            count += val.outDegree();
        }
        return count;
    }

    @Override
    public void removeNodeFor(E item) {

        if (item == null || !containsNodeFor(item)) {

            throw new NullPointerException(" Error in removeNodeFor ");
            //item2node.remove(item);// this may not be the correct item to delete
        }

        MyNode<E> nodeToRemove = item2node.get(item);

        for(MyNode<E> val : item2node.values()){
            //if the node is a successor and a predecessor we need to remove it there to.

            if(val.hasSucc(nodeToRemove)){

                val.removeSucc(nodeToRemove);
            }
            if(val.hasPred(nodeToRemove)){//could not have else if here

                val.removePred(nodeToRemove);
            }
        }
        nodeToRemove.disconnect();
        item2node.remove(item);
    }

    @Override
    public boolean containsEdgeFor(E from, E to) {

        //returns false or true if there is a edge connection

        if(from == null || to == null){
            throw new NullPointerException(" containsEdgeFor is null ");
        }
        if(!containsNodeFor(from) && !containsNodeFor(to)){

            return false;
        }

        return item2node.get(from).hasSucc(item2node.get(to));
    }

    @Override
    public boolean removeEdgeFor(E from, E to) {
        //removes all teh edges from a node

        if (from == null || to == null) {

            throw new NullPointerException(" Error in removeEdgeFor ");
            //item2node.remove(item);// this may not be the correct item to delete
        }

        if(!containsNodeFor(from) || !containsNodeFor(to)){

            return false;
        }

        if(containsEdgeFor(from, to)){

            MyNode<E> source = item2node.get(from); //gets the "from" and "to" connections from the Node
            MyNode<E> target = item2node.get(to);

            source.removeSucc(target);
            target.removePred(source);

            if(source.isHead()){
                heads.add(source);
            }
            else if(source.isTail()){
                tails.add(source);
            }
            if(target.isHead()){
                heads.add(target);
            }
            else if(target.isTail()){
                tails.add(target);
            }

            return true;

        }

        return false;
    }

    @Override
    public String toString() {

        String text = "";

        Iterator iterator = iterator();

        while(iterator.hasNext()){

            text += iterator.next() + " | ";
        }

        text += "\n\n |||| " + item2node.toString();

        return text;
    }

    @SuppressWarnings("unchecked")
    public class item2NodeIterator implements Iterator<Node<E>> {

        Iterator itr = item2node.values().iterator();

        public boolean hasNext() {//retruns true or false if there is a next
            return itr.hasNext();
        }

        public Node<E> next() {
            Node<E> newNode = (Node<E>)itr.next();
            return newNode;
        }
    }
}
