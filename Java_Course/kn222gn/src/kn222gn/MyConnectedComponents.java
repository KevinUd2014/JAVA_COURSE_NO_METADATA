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
            //while the diagram has a next loop this.

            Node<E> nextNode = iterator.next();
            connectionKey = false;

            if(!visitedNode.contains(nextNode)){
                //if the collection doesn't contain the next node we run the dfs.
                dfsList = dfs.dfs(dg, nextNode);

                for(Node<E> itemInNode : dfsList){
                    //For every itemnode in the dfsList

                    if(visitedNode.contains(itemInNode)) {
                        //if the collection contains a itemNode from the dfsList we will add these.

                        for (Collection<Node<E>> c : collectionNodes) {
                            //for all the collectionNodes in which has been added they need a connectionKey.

                            if (c.contains(itemInNode)) {
                                //and if this collection contains a itemNode it will be added to all the lists and have the key set to true.

                                visitedNode.addAll(dfsList);
                                c.addAll(dfsList);
                                connectionKey = true;
                            }
                        }
                    }
                }
                if(connectionKey == false){
                    //if the key haven't been set we create a new hashset and adds the dfs to these lists and collections.

                    component = new HashSet<>();
                    visitedNode.addAll(dfsList);
                    component.addAll(dfsList);
                    collectionNodes.add(component);
                }
            }
            visitedNode.add(nextNode); //adds the nextNode to the visitedNode collection.
        }

        return collectionNodes;
    }
}
