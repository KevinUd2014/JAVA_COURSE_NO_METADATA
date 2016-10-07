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

        toVisit.clear();
        result.clear();
        visited.clear();

        toVisit.add(root);

        return bfsRecursive(toVisit, result, visited);
    }

    private List<Node<E>> bfsRecursive(HashSet<Node<E>>toVisit, List<Node<E>> result, HashSet<Node<E>> visited){

        Iterator<Node<E>> setIterator = toVisit.iterator();
        toVisit = new HashSet<>();

        while(setIterator.hasNext()){

            Node<E> node = setIterator.next();

            if(!visited.contains(node)){

                node.num = result.size();

                visited.add(node);

                if(!result.contains(node)){

                    result.add(node);
                }
            }

            Iterator<Node<E>> successorIt = node.succsOf();

            while(successorIt.hasNext()){

                Node<E> successor = successorIt.next();

                if(!visited.contains(successor)){

                    toVisit.add(successor);
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

        toVisit.clear();
        result.clear();
        visited.clear();

        Iterator<Node<E>> heads = graph.heads();

        if(graph.headCount() != 0){

            while(heads.hasNext()){

                toVisit.clear();

                toVisit.add(heads.next());

                bfsRecursive(toVisit, result, visited);
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
