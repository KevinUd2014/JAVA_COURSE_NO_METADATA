package kn222gn;

import graphs.DFS;
import graphs.DirectedGraph;
import graphs.Node;

import java.util.*;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyDFS<E> implements DFS<E> {

    //private List<Node<E>> visitedNode = new ArrayList<>(); //fråga om denna

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph, Node<E> root) {

        //visitedNode.clear();

        List<Node<E>> visitedNode = new ArrayList<>();
        HashSet<Node<E>> visited = new HashSet<>();

        return dfsRecursive(visitedNode, root, visited);
    }

    private List<Node<E>> dfsRecursive(List<Node<E>> visitedNode, Node<E> root, HashSet<Node<E>> visited){

        root.num = visitedNode.size();

        visitedNode.add(root);
        visited.add(root);

        Iterator<Node<E>> successor = root.succsOf();

        while (successor.hasNext()) {

            Node<E> node = successor.next();

            if(!visited.contains(node)) {
                visitedNode = dfsRecursive(visitedNode, node, visited);
            }
        }
        return visitedNode;
    }

    @Override
    public List<Node<E>> dfs(DirectedGraph<E> graph) {

        //visitedNode.clear();
        List<Node<E>> visitedNode = new ArrayList<>();
        HashSet<Node<E>> visited = new HashSet<>();

        if(graph.headCount() > 0)
        {
            Iterator<Node<E>> head = graph.heads();

            while(head.hasNext())
            {
                visitedNode = dfsRecursive(visitedNode, head.next(), visited);
            }
        }
        else
        {
            visitedNode = dfsRecursive(visitedNode, graph.getNodeFor(graph.allItems().get(0)), visited);
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

        Iterator<Node<E>> iterator = graph.iterator();

        while(iterator.hasNext()) {

            Node<E> node = iterator.next();

            Iterator<Node<E>> iterator2 = node.succsOf();

            while(iterator2.hasNext()) {

                if (iterator2.next() == node) {

                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<Node<E>> topSort(DirectedGraph<E> graph) {

        Iterator<Node<E>> iterator = graph.heads();

        List<Node<E>> topSortedList = new ArrayList<>();
        List<Node<E>> visitedNodeList = new ArrayList<>();

        while(iterator.hasNext()){

            topSortedList = postOrderRecursive(visitedNodeList, topSortedList, iterator.next());
        }
        Collections.reverse(topSortedList);

        return topSortedList;
    }
}
