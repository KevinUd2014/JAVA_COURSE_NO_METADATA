package kn222gn_assign2.Exercise1;

import kn222gn_assign2.Exercise1.da1031.*;

/**
 * Created by Golde on 2016-09-13.
 */
public class ArrayIntStack extends AbstractIntCollection implements IntStack{

    @Override
    public void push(int n) {

        if(size() == values.length){

            resize();
        }
       /* try{

            size++;
            int i;
            if(size() == values.length){

                resize();
            }

            for(i = size()-1; i > 0; i -= 1){

                values[i] = values[i-1];
            }

            values[0] = n;

        }catch(Exception e){

            System.out.println(e.fillInStackTrace());
        }*/
        values[size++] = n;
    }

    @Override
    public int pop() throws IndexOutOfBoundsException {

        if(size() == 0){

            throw new IndexOutOfBoundsException();
        }

        /*int tempValue = values[0];

        try{

            for(int i = 0; i < size()-1; i += 1){

                values[i] = values[i+1];
            }
            size--;
            //return tempValue;
        }catch(Exception e){

            System.out.println(e.fillInStackTrace());
        }*/
        int tempValue = values[--size];
        return tempValue;
    }

    @Override
    public int peek() throws IndexOutOfBoundsException {

        if(size() == 0){

            throw new IndexOutOfBoundsException();
        }

        return values[size-1];
    }
}
