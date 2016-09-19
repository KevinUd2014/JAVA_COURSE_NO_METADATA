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
        if(index > size() || index < 0){

            throw new IndexOutOfBoundsException("The list is empty");
        }
        size++;
        int i;
        if(size() == values.length){

            resize();
        }

        for(i = size()-1; i > index; i -= 1){

            values[i] = values[i-1];
        }

        values[index] = n;

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        //Removes an index

        if(index > size() || index < 0){

            throw new IndexOutOfBoundsException("The list is empty");
        }

        for(int i = index; i < size()-1; i += 1){

            values[i] = values[i+1];
        }
        size--;

    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {

        if(index < 0 || index > size()){

            throw new IndexOutOfBoundsException();
        }

        return values[index];
    }

    @Override
    public int indexOf(int n) {

        for(int i = 0; i < size(); i++){

            if(values[i] == n){

                return i;
            }
        }
        return -1;
    }
}
