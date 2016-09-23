package kn222gn_assign2.Exercise3;

import kn222gn_assign2.Exercise1.ArrayIntList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Golde on 2016-09-16.
 */
public class ArrayIntListTest {

    //private ArrayIntList arrayIntList = new ArrayIntList();
    private static int testNumber = 0;
    @Before
    public void setUp() throws Exception {

        testNumber++;
        System.out.println("The test being compiled is: " + testNumber);
    }

    @After
    public void tearDown() throws Exception {

        System.out.println("Test number " + testNumber + " Complete");
    }

    @Test
    public void add() throws Exception {

        //test the add function

        ArrayIntList arrayIntList = new ArrayIntList();
        arrayIntList.add(1337);
        assertEquals(1337, arrayIntList.get(0));

        ArrayIntList emptyList = new ArrayIntList();
        assertTrue(emptyList.isEmpty());

        //add 100 elements to the list
        for(int i = 0; i < 100; i++){

            arrayIntList.add(1337);
            assertEquals(1337, arrayIntList.get(0));
            assertNotEquals("gyf", arrayIntList.get(0));
        }
    }

    @Test
    public void addAt() throws Exception {

        //test the addat function

        ArrayIntList arrayIntList = new ArrayIntList();
        ArrayIntList arrayIntLisEmpty = new ArrayIntList();

        for(int i = 0; i < 10; i++) {

            arrayIntList.add(i);
        }
        //adds 200 on the last index
        arrayIntList.addAt(200, 10);

        assertEquals(11, arrayIntList.size());

        arrayIntList.addAt(201, 9);
        arrayIntList.addAt(200, 9);

        assertEquals(13, arrayIntList.size());

        assertEquals(201, arrayIntList.get(10));

        //cant add to an empty list
        try{

            arrayIntLisEmpty.addAt(5, 90);
            fail("Exception not thrown");

        }
        catch(IndexOutOfBoundsException error){
            //fail("Exception not thrown");
            assertTrue(true);
        }
    }

    @Test
    public void remove() throws Exception {

        //test the remove function

        ArrayIntList arrayIntList = new ArrayIntList();
        ArrayIntList arrayIntListBig = new ArrayIntList();

        for(int i = 0; i < 10; i++) {

            arrayIntList.add(i);
        }
        for(int i = 0; i < 10000; i++) {

            arrayIntListBig.add(i);
        }

        arrayIntList.remove(10);
        arrayIntList.remove(9);

        assertEquals(8, arrayIntList.size());

        try{

            arrayIntList.remove(30);
            fail("Exception not thrown");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }

        arrayIntListBig.remove(1);
        assertEquals(9999, arrayIntListBig.size());
    }

    @Test
    public void get() throws Exception {

        //testing the getfunction

        ArrayIntList arrayIntList = new ArrayIntList();

        for(int i = 0; i <= 10; i++) {

            arrayIntList.add(i);
        }

        arrayIntList.get(9);

        assertEquals(10, arrayIntList.get(10));

        try{
            //trying to get a index higher thatn the list
            arrayIntList.get(14);
            fail("Exception not thrown");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }
    }

    @Test
    public void indexOf() throws Exception {

        //testing the indexOf Function

        ArrayIntList arrayIntList = new ArrayIntList();
        ArrayIntList arrayIntListBig = new ArrayIntList();

        for(int i = 0; i <= 10; i++) {

            arrayIntList.add(i);
        }
        for(int i = 0; i <= 10000; i++) {

            arrayIntListBig.add(i);
        }

        assertEquals(10, arrayIntList.indexOf(10));

        assertEquals(4000, arrayIntListBig.indexOf(4000));

        assertEquals(-1, arrayIntListBig.indexOf(10001));
    }

}