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
    private List visitedNode = new ArrayList<>();

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph, Node<E> root) {

        List<Node<E>> nodeList = new ArrayList<>();

        return dfsRecursive(graph, nodeList, root);
    }

    public List<Node<E>> dfsRecursive(DirectedGraph<E> graph, List<Node<E>> visitedNodeList, Node<E> root){

        if(root != null) {

            //Iterator<Node<E>> successor = root.succsOf();

            if(!visitedNodeList.contains(root)){

                root.num = visitedNodeList.size();
                visitedNodeList.add(root);
            }

            for (Node newNode : graph) {
           // while(successor.hasNext()) {

                //Node<E> nextNode = successor.next();

                if (!visitedNode.contains(newNode)) {

                    newNode.num = visitedNode.size();
                    visitedNode.add(newNode);
                    dfsRecursive(graph, visitedNodeList, newNode);
                }
            }
        }
        else return null;

        return visitedNodeList;
    }

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph) {

        List<Node<E>> nodeList = new ArrayList<>();

        Iterator<Node<E>> head = graph.heads();

        while(head.hasNext()){

            nodeList = dfsRecursive(graph, nodeList, head.next());
        }

        return nodeList;
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
