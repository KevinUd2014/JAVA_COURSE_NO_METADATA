package kn222gn;

import graphs.BFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyBFS<E> implements BFS<E> {

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {

        List<Node<E>> result = new ArrayList<>();
        HashSet<Node<E>> toVisit = new HashSet<>();
        HashSet<Node<E>> visited = new HashSet<>();

        /*toVisit.clear();
        result.clear();
        visited.clear();*/

        toVisit.add(root);

        return bfsRecursive(toVisit, result, visited);
    }

    //helper method to make the bfs recursive, sets the visited nodes and adds result to the list and
    //iterates through the iterator fo all the elements.
    private List<Node<E>> bfsRecursive(HashSet<Node<E>>toVisit, List<Node<E>> result, HashSet<Node<E>> visited){

        Iterator<Node<E>> iterator = toVisit.iterator();
        toVisit = new HashSet<>();

        while(iterator.hasNext()){
            //loops for all the nodes in the toVisitList

            Node<E> node = iterator.next();

            if(!visited.contains(node)){

                node.num = result.size();
                visited.add(node);

                if(!result.contains(node)){

                    result.add(node); // adds the node if the result list doesn't contain it.
                }
            }

            Iterator<Node<E>> successor = node.succsOf();

            while(successor.hasNext()){
                //loops for all the successors in the node

                Node<E> successor2 = successor.next();

                if(!visited.contains(successor2)){
                    //if the list doesn't contain a successor add it to the toVisitList

                    toVisit.add(successor2);
                }
            }
        }

        if(!toVisit.isEmpty()){

            //toVisit.clear();

            bfsRecursive(toVisit, result, visited);
        }

        return result;
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph) {

        List<Node<E>> result = new ArrayList<>();
        HashSet<Node<E>> toVisit = new HashSet<>();
        HashSet<Node<E>> visited = new HashSet<>();

        /*toVisit.clear();
        result.clear();
        visited.clear();*/

        Iterator<Node<E>> heads = graph.heads();

        if(graph.headCount() != 0){
            //heads can't be 0 for this to loop

            while(heads.hasNext()){

                toVisit.clear();
                toVisit.add(heads.next());//adds the next element to the list

                bfsRecursive(toVisit, result, visited);// and then call the recursive function again with the new list.
            }
        }
        else{

            toVisit.clear();
            toVisit.add(graph.getNodeFor(graph.allItems().get(0)));

            bfsRecursive(toVisit, result, visited);
        }

        return result;
    }
}
