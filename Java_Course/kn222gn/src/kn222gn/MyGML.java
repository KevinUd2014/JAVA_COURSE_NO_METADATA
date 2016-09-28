package kn222gn;

import graphs.DirectedGraph;
import graphs.GML;

/**
 * Created by Golde on 2016-09-28.
 */
public class MyGML<E> extends GML<E> {

    public MyGML(DirectedGraph<E> dg) {
        super(dg);
    }

    @Override
    public String toGML() {
        return null;
    }
}
