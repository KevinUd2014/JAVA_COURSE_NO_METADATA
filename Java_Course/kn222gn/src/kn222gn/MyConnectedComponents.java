package kn222gn;

import graphs.ConnectedComponents;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyConnectedComponents<E> implements ConnectedComponents<E> {

    @Override
    public Collection<Collection<Node<E>>> computeComponents(DirectedGraph<E> dg) {

        boolean connectionKey;
        Collection<Node> visitedNode = new HashSet<>();
        Collection<Collection<Node<E>>> collectionNodes = new HashSet<>();
        Collection<Node<E>> component;

        List<Node<E>> dfsList;

        MyDFS<E> dfs = new MyDFS<>();

        Iterator<Node<E>> iterator = dg.iterator();
        //Node<E> nextNode = iterator.next();

        while(iterator.hasNext()){

            Node<E> nextNode = iterator.next();
            connectionKey = false;

            if(!visitedNode.contains(nextNode)){

                dfsList = dfs.dfs(dg, nextNode);

                for(Node<E> itemInNode : dfsList){

                    if(visitedNode.contains(itemInNode)) {

                        for (Collection<Node<E>> c : collectionNodes) {

                            if (c.contains(itemInNode)) {

                                visitedNode.addAll(dfsList);
                                c.addAll(dfsList);
                                connectionKey = true;
                            }
                        }
                    }
                }
                if(connectionKey == false){

                    component = new HashSet<>();
                    visitedNode.addAll(dfsList);
                    component.addAll(dfsList);
                    collectionNodes.add(component);
                }
            }
            visitedNode.add(nextNode);
        }

        return collectionNodes;
    }
}
