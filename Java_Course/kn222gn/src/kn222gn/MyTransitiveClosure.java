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

        Map<Node<E>, Collection<Node<E>>> map;

        map = new HashMap<>();

        MyDFS<E> dfs = new MyDFS<>();

        Iterator<Node<E>> iterator = dg.iterator();

        while(iterator.hasNext()){

            Node<E> node = iterator.next();
            map.put(node, dfs.dfs(dg, node));
        }

        return map;
    }
}
