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

    private List<Node<E>> visitedNode = new ArrayList<>();

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph, Node<E> root) {

        visitedNode.clear();

        return dfsRecursive(root);
    }

    private List<Node<E>> dfsRecursive(Node<E> root){

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

        List<Node<E>> postOrderList = new ArrayList<>();
        List<Node<E>> visitedNodeList = new ArrayList<>();

        root = g.getNodeFor(root.item());

        return postOrderRecursive(postOrderList, visitedNodeList, root);
    }

    @Override
    public List<Node<E>> postOrder(DirectedGraph<E> g) {

        List<Node<E>> postOrderList = new ArrayList<>();
        List<Node<E>> visitedNodeList = new ArrayList<>();

        Iterator<Node<E>> iterator = g.heads();

        while(iterator.hasNext()){
            postOrderRecursive(postOrderList, visitedNodeList, iterator.next());
        }

        return postOrderList;
    }

    private List<Node<E>> postOrderRecursive(List<Node<E>> postNodeList, List<Node<E>> visitedNodeList, Node<E> root){

        //if not visited do these things
        if(!visitedNodeList.contains(root)){

            //adds the root node to the list of visited nodes
            visitedNodeList.add(root);

            Iterator<Node<E>> successor = root.succsOf();

            while (successor.hasNext()) {

                Node<E> nextNodeItem = successor.next();

                //checks so that the postnode don't contain the new node
                if(!postNodeList.contains(nextNodeItem)) {

                    postOrderRecursive(postNodeList, visitedNodeList, nextNodeItem);
                }
            }
            int addedNode = 1;

            root.num = postNodeList.size() + addedNode;
            postNodeList.add(root);
        }
        return postNodeList;
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
