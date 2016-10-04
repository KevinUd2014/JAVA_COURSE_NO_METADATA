package kn222gn;

import graphs.DFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyDFS<E> implements DFS<E> {

    private int depthFirstNumber = 0;
    private List<Node<E>> visitedNode = new ArrayList<>();

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph, Node<E> root) {

        visitedNode.clear();

        return dfsRecursive(root);
    }

    public List<Node<E>> dfsRecursive(Node<E> root){

            if(!visitedNode.contains(root)) {

                root.num = visitedNode.size();

                visitedNode.add(root);

                Iterator<Node<E>> successor = root.succsOf();

                while (successor.hasNext()) {

                    dfsRecursive(successor.next());
                }
            }

        return visitedNode;
    }

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph) {

        visitedNode.clear();

        if(graph.headCount() > 0)
        {
            Iterator<Node<E>> head = graph.heads();

            while(head.hasNext())
            {
                dfsRecursive(head.next());
            }
        }
        else
        {
            dfsRecursive(graph.getNodeFor(graph.allItems().get(0)));
        }

        return visitedNode;
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph<E> g, Node<E> root) {

        return null;
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph<E> g) {

        return null;
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph<E> g, boolean attach_dfs_number) {

        return null;
    }

    @Override
    public boolean isCyclic(DirectedGraph<E> graph) {

        return false;
    }

    @Override
    public List<Node<E>> topSort(DirectedGraph<E> graph) {

        return null;
    }
}
