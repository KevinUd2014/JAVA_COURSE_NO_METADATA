package kn222gn;

import graphs.BFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyBFS<E> implements BFS<E> {

   /* private Set<Node<E>> visited = new HashSet<>();
    private List<Node<E>> open = new ArrayList<>();
    private List<Node<E>> result = new ArrayList<>();*/

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {

        Set<Node<E>> visited = new HashSet<>();
        List<Node<E>> open = new ArrayList<>();
        List<Node<E>> result = new ArrayList<>();

        open.add(root);

        Iterator<Node<E>> iterator = open.iterator();

        while (iterator.hasNext()) {

            Node<E> currentNode = open.remove(0);
            Iterator<Node<E>> successor = currentNode.succsOf();
            visited.add(currentNode);

            if (!result.contains(currentNode)) {

                result.add(currentNode);
                currentNode.num = result.size();
            }

            while (successor.hasNext()) {

                Node<E> successor2 = successor.next();

                if (!visited.contains(successor2)) {
                    open.add(successor2);
                }
            }
        }
        if(!open.isEmpty()){
            bfs(graph, root);
        }

        return result;
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph) {

        Set<Node<E>> visited = new HashSet<>();
        List<Node<E>> open = new ArrayList<>();
        List<Node<E>> result = new ArrayList<>();

        graph.heads().forEachRemaining(open::add);

        Iterator<Node<E>> iterator = open.iterator();

        while (iterator.hasNext()) {

            Node<E> currentNode = open.remove(0);
            Iterator<Node<E>> successor = currentNode.succsOf();
            visited.add(currentNode);

            if (!result.contains(currentNode)) {

                result.add(currentNode);
                currentNode.num = result.size();
            }

            while (successor.hasNext()) {

                Node<E> successor2 = successor.next();

                if (!visited.contains(successor2)) {
                    open.add(successor2);
                }
            }
        }
        if(!open.isEmpty()){
            bfs(graph);
        }

        return result;
    }

    /*@Override
    public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {

        HashSet<Node<E>> open = new HashSet<>();
        HashSet<Node<E>> visited = new HashSet<>();
        List<Node<E>> toVisitList = new ArrayList<>();

        open.add(root);

        return bfsRecursive(open, toVisitList, visited);
    }

    private List<Node<E>> bfsRecursive(HashSet<Node<E>> open, List<Node<E>> toVisitList, HashSet<Node<E>> visited){

        Iterator<Node<E>> setIterator = open.iterator();
        open = new HashSet<>();

        if(!open.isEmpty()){
            bfsRecursive(open, toVisitList,visited);
        }

        while(setIterator.hasNext()){
            Node<E> node = setIterator.next();

            if(!visited.contains(node)){
                node.num = toVisitList.size() + 1;
                visited.add(node);
                toVisitList.add(node);
            }
            Iterator<Node<E>> successorIt = node.succsOf();
            while(successorIt.hasNext()){
                Node<E> successor = successorIt.next();
                if(!visited.contains(successor)){
                    open.add(successor);
                }
            }
        }
        return toVisitList;
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph) {

        List<Node<E>> toVisitList = new ArrayList<>();
        HashSet<Node<E>> set;
        HashSet<Node<E>> visited = new HashSet<>();
        Iterator<Node<E>> heads = graph.heads();

        if (graph.headCount() != 0) {
            while (heads.hasNext()) {
                set = new HashSet<>();
                set.add(heads.next());
                toVisitList = bfsRecursive(set, toVisitList, visited);
            }
        } else {
            set = new HashSet<>();
            set.add(graph.getNodeFor(graph.allItems().get(0)));

            bfsRecursive(set, toVisitList, visited);
        }

        return toVisitList;
    }*/
}
