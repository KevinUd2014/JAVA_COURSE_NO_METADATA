package kn222gn_assign2.Exercise3;

import kn222gn_assign2.Exercise1.ArrayIntStack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Golde on 2016-09-16.
 */
public class ArrayIntStackTest {

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
    public void push() throws Exception {

        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();

        for(int i = 0; i < 10; i++) {

            arrayIntStack.push(i);
        }
        //never fills the big list to check if empty
        /*for(int i = 0; i < 10000; i++) {

            arrayIntStackBig.push(i);
        }*/

        assertEquals(arrayIntStack.size(), 10);

        assertTrue(arrayIntStackBig.isEmpty());


    }

    @Test
    public void pop() throws Exception {

        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();
        ArrayIntStack emptyStack = new ArrayIntStack();

        for(int i = 0; i < 10; i++) {

            arrayIntStack.push(i);
        }
        for(int i = 0; i < 10000; i++) {

            arrayIntStackBig.push(i);
        }

        assertEquals(arrayIntStack.size(), 10);
        assertEquals(arrayIntStackBig.size(), 10000);

        arrayIntStack.pop();
        arrayIntStackBig.pop();
        arrayIntStackBig.pop();
        arrayIntStackBig.pop();

        assertEquals(arrayIntStack.size(), 9);
        assertEquals(arrayIntStackBig.size(), 9997);

        //test so that the list don't contain the removed int!
        for(int value : arrayIntStack){

            assertNotEquals(value, 10);
        }
        for(int value : arrayIntStackBig){

            assertNotEquals(value, 10000);
        }

        try{

            emptyStack.pop();
            fail("Should not throw error");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }
    }

    @Test
    public void peek() throws Exception {


        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();
        ArrayIntStack emptyStack = new ArrayIntStack();

        for(int i = 0; i <= 10; i++) {

            arrayIntStack.push(i);
        }
        for(int i = 0; i <= 10000; i++) {

            arrayIntStackBig.push(i);
        }

        assertEquals(arrayIntStack.peek(), 10);
        assertEquals(arrayIntStack.peek(), 10);
        assertEquals(arrayIntStackBig.peek(), 10000);
        assertEquals(arrayIntStackBig.peek(), 10000);

        try{

            emptyStack.pop();
            fail("Should not throw error");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }
    }

}