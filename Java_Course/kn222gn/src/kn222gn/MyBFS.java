package kn222gn;

import graphs.BFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyBFS<E> implements BFS<E> {

    private Set<Node<E>> visited = new HashSet<>();
    private List<Node<E>> open = new ArrayList<>();
    private List<Node<E>> result = new ArrayList<>();

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {

        open.clear();
        result.clear();
        visited.clear();

        open.add(root);

        while(!open.isEmpty()){

            Node<E> currentNode = open.remove(0);
            Iterator<Node<E>> successor = currentNode.succsOf();

            if(!result.contains(currentNode)){

                result.add(currentNode);
                currentNode.num = result.size();
            }

            visited.add(currentNode);

            while(successor.hasNext()){

                Node<E> successor2 = successor.next();

                if(!visited.contains(successor2)){
                    open.add(successor2);
                }
            }
        }
        return result;
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph) {

        open.clear();
        result.clear();
        visited.clear();

        graph.heads().forEachRemaining(open::add);

        while(!open.isEmpty()){

            Node<E> currentNode = open.remove(0);
            Iterator<Node<E>> successor = currentNode.succsOf();

            if(!result.contains(currentNode)){

                result.add(currentNode);
                currentNode.num = result.size();
            }

            visited.add(currentNode);


            while(successor.hasNext()){

                Node<E> successor2 = successor.next();

                if(!visited.contains(successor2)){
                    open.add(successor2);
                }
            }
        }
        return result;
    }
}
