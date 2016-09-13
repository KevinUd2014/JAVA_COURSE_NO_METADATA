package kn222gn_assign2;

import kn222gn_assign2.Exercise1.ArrayIntList;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-13.
 */
public class CollectionMain {

    public static void main(String args[]){

        //test the add array function
        ArrayIntList array = new ArrayIntList();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(3);
       // array.remove(4);

        array.get(2);
        Iterator it = array.iterator();
        Iterator it2 = array.iterator();

        System.out.println("\n Added array: ");
        //loops the iterator with all the objects
        while(it2.hasNext()){
            System.out.println(it2.next());
            //System.out.println(array.toString());
        }

        array.addAt(4,2);

        System.out.println("\n Added array with one extra at(4,2): ");

        while(it.hasNext()){
            System.out.println(it.next());
            //System.out.println(array.toString());
        }

        System.out.println("\n Index of(3): " + array.indexOf(3));

        System.out.println("\n The size of the array: " + array.size());

        System.out.println("\n get the [1] in the array: " + array.get(1));
        System.out.println(" get hte [0] in the array: " + array.get(0));


    }
}
