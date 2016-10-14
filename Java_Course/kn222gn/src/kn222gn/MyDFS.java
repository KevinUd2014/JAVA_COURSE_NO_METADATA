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

        //calls the recursive method with all the values
        return dfsRecursive(visitedNode, root, visited);
    }

    private List<Node<E>> dfsRecursive(List<Node<E>> visitedNode, Node<E> root, HashSet<Node<E>> visited){

        root.num = visitedNode.size();

        visitedNode.add(root);//adds the root to a list and a HashSet, just to be able to use the HashSet for time complexity
        visited.add(root);

        Iterator<Node<E>> successor = root.succsOf();

        while (successor.hasNext()) {
            //While there is successors

            Node<E> node = successor.next();

            if(!visited.contains(node)) {//loops the HashSet faster than a list.
                //If the visited node don't contain the Node call the method again.
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

        if(graph.headCount() > 0)//checks all the heads
        {
            Iterator<Node<E>> head = graph.heads();

            while(head.hasNext())
            {
                //while there is a next head call the recursive function with the next head.
                visitedNode = dfsRecursive(visitedNode, head.next(), visited);
            }
        }
        else
        {
            //else call the recursive function with the element 0.
            visitedNode = dfsRecursive(visitedNode, graph.getNodeFor(graph.allItems().get(0)), visited);//gets the first Item/head.
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

            root.num = postNodeList.size() + addedNode; // sets the root num to 1
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
        //checks if the graph contains backward edges.

        Iterator<Node<E>> iterator = graph.iterator();

        while(iterator.hasNext()) {

            Node<E> node = iterator.next();

            Iterator<Node<E>> iterator2 = node.succsOf();

            while(iterator2.hasNext()) {

                if (iterator2.next() == node) {
                    //if the next node is the same as node return true

                    return true;
                }
            }
        }
        //else return false.
        return false;

       /* for(Node<E> node : postOrder(graph)) //This is apparently more correct but somehow it won't work although it shows the correct result.
        {
            Iterator<Node<E>> iterator = node.succsOf();
            while(iterator.hasNext())
            {
                Node<E> n = iterator.next();
                System.out.println(node.num <= n.num);
                System.out.println(node.num + " " + n.num);
                if(node.num <= n.num) {
                    return true;
                }
            }
        }
        return false;*/
    }

    @Override
    public List<Node<E>> topSort(DirectedGraph<E> graph) {

        Iterator<Node<E>> iterator = graph.heads();

        List<Node<E>> topSortedList = new ArrayList<>();
        List<Node<E>> visitedNodeList = new ArrayList<>();

        while(iterator.hasNext()){

            topSortedList = postOrderRecursive(visitedNodeList, topSortedList, iterator.next());
        }
        Collections.reverse(topSortedList);//reverse the List with the Collection . reverse.

        return topSortedList;
    }
}
