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
    }/*

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph, Node<E> root) {

        HashSet<Node<E>>  set = new HashSet<>();
        HashSet<Node<E>>  visited = new HashSet<>();

        List<Node<E>> list = new ArrayList<>();

        set.add(root);

        return bfsRecursive(set, list, visited);
    }

    private List<Node<E>> bfsRecursive(HashSet<Node<E>>set, List<Node<E>> list, HashSet<Node<E>> visited){

        Iterator<Node<E>> setIterator = set.iterator();
        set = new HashSet<>();

        while(setIterator.hasNext()){
            Node<E> node = setIterator.next();

            if(!visited.contains(node)){
                node.num = list.size() + 1;
                visited.add(node);
                list.add(node);
            }
            Iterator<Node<E>> successorIt = node.succsOf();
            while(successorIt.hasNext()){
                Node<E> successor = successorIt.next();
                if(!visited.contains(successor)){
                    set.add(successor);
                }
            }
        }

        if(!set.isEmpty()){
            bfsRecursive(set, list,visited);
        }
        return list;
    }

    @Override
    public List<Node<E>> bfs(DirectedGraph<E> graph) {
        List<Node<E>> list = new ArrayList<Node<E>>();
        HashSet<Node<E>>  set;
        HashSet<Node<E>>  visited = new HashSet<>();
        Iterator<Node<E>> heads = graph.heads();

        if(graph.headCount() != 0){
            while(heads.hasNext()){
                set = new HashSet<>();
                set.add(heads.next());
                list = bfsRecursive(set, list,visited);
            }
        }
        else{
            set = new HashSet<>();
            set.add(graph.getNodeFor(graph.allItems().get(0)));
            list = bfsRecursive(set, list,visited);
        }

        return list;
    }*/
}
