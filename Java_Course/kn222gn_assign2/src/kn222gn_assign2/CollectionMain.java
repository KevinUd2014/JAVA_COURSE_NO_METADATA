package kn222gn_assign2;

import kn222gn_assign2.Exercise1.ArrayIntList;
import kn222gn_assign2.Exercise1.ArrayIntStack;

import java.util.Iterator;

/**
 * Created by Golde on 2016-09-13.
 */
public class CollectionMain {

    public static void main(String args[]){

        //test the add array function
        ArrayIntList array = new ArrayIntList();
        ArrayIntStack stack = new ArrayIntStack();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(3);

        int first = 1;
        int second = 1;
        int third = 3;
        int forth = 4;

        stack.push(first);
        stack.push(third);
        stack.push(second);
        stack.push(third);

       // array.remove(4);

        System.out.println("\n Stack is: " + stack);

        stack.push(forth);

        System.out.println("\n Added a 4th element to the Stack it's now: " + stack);

        System.out.println("\n Peek at the last number in the stack " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("\n Poped 3 elements from the Stack it's now: " + stack);

        System.out.println("\n Peek at the last number in the stack " + stack.peek());

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
