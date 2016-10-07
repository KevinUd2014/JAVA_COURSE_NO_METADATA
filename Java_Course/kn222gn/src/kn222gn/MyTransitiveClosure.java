package kn222gn;

import graphs.DirectedGraph;
import graphs.Node;
import graphs.TransitiveClosure;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyTransitiveClosure<E> implements TransitiveClosure<E> {

    @Override
    public Map<Node<E>, Collection<Node<E>>> computeClosure(DirectedGraph<E> dg) {

        Collection<Node<E>> nodeCollection;
        Map<Node<E>, Collection<Node<E>>> map = new HashMap<>();

        MyDFS<E> dfs = new MyDFS<>();

        Iterator<Node<E>> iterator = dg.iterator();

        int cout = 0;
        while(iterator.hasNext()){

            Node<E> node = iterator.next();
            nodeCollection = dfs.dfs(dg, node);
            map.put(node, nodeCollection);
            //System.out.println(cout++);
        }


        return map;
    }
}
