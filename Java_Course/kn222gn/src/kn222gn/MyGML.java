package kn222gn;

import graphs.DirectedGraph;
import graphs.GML;
import graphs.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyGML<E> extends GML<E> {

    public MyGML(DirectedGraph<E> dg) {

        super(dg);
    }

    @Override
    public String toGML() {

        String text = "";

        int count = 1;

        Iterator iterator = graph.iterator();

        text += "graph [\n";

        while(iterator.hasNext()){

            Node<E> node = (Node<E>)iterator.next();

            text += "\tnode [\n" +
                    "\t\tid " + count + "\n" +
                    "\t\tlabel " + node.item() + "\n" +
                    "\t]\n";
            node.num = count;
            count++;
        }

        Iterator iterator2 = graph.iterator();

        while(iterator2.hasNext()){

            Node<E> source = (Node<E>)iterator2.next();

            Iterator itte = source.succsOf();

            while(itte.hasNext())
            {
                Node<E> target = (Node<E>)itte.next();

                text += "\tedge [\n" +
                        "\t\tsource " + source.num + "\n" +
                        "\t\ttarget " + target.num + "\n" +
                        "\t]\n";
            }
        }
        text += "]";

        return text;
    }
}
