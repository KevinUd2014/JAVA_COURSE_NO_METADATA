package kn222gn_assign2.Exercise1;

import kn222gn_assign2.Exercise1.da1031.*;

/**
 * Created by Golde on 2016-09-13.
 */
public class ArrayIntList extends AbstractIntCollection implements IntList{

    @Override
    public void add(int n) {
        //will add to the arraylist
        try{

            values[size()] = n;
            size++;
            if(size() == values.length){
                resize();
            }
        }catch(Exception e){

            System.out.println(e.fillInStackTrace());
        }
    }

    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        //adds at the specific index

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        //Removes an index
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        return 0;
    }

    @Override
    public int indexOf(int n) {
        return 0;
    }
}
