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
    public void push() throws Exception { // testing push function

        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();

        for(int i = 0; i < 10; i++) {

            arrayIntStack.push(i);
        }
        //never fills the big list to check if empty
        /*for(int i = 0; i < 10000; i++) {

            arrayIntStackBig.push(i);
        }*/

        assertEquals(10, arrayIntStack.size());

        assertTrue(arrayIntStackBig.isEmpty());


    }

    @Test
    public void pop() throws Exception { // testing the pop function

        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();
        ArrayIntStack emptyStack = new ArrayIntStack();

        for(int i = 0; i < 10; i++) {

            arrayIntStack.push(i);
        }
        for(int i = 0; i < 10000; i++) {

            arrayIntStackBig.push(i);
        }

        assertEquals(10, arrayIntStack.size());
        assertEquals(10000, arrayIntStackBig.size());

        arrayIntStack.pop();
        arrayIntStackBig.pop();
        arrayIntStackBig.pop();
        arrayIntStackBig.pop();

        assertEquals(9, arrayIntStack.size());
        assertEquals(9997, arrayIntStackBig.size());

        //test so that the list don't contain the removed int!
        for(int value : arrayIntStack){

            assertNotEquals(10, value);
        }
        for(int value : arrayIntStackBig){

            assertNotEquals(10000, value);
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
    public void peek() throws Exception { // test the peek function


        ArrayIntStack arrayIntStack = new ArrayIntStack();
        ArrayIntStack arrayIntStackBig = new ArrayIntStack();
        ArrayIntStack emptyStack = new ArrayIntStack();

        for(int i = 0; i <= 10; i++) {

            arrayIntStack.push(i);
        }
        for(int i = 0; i <= 10000; i++) {

            arrayIntStackBig.push(i);
        }

        assertEquals(10, arrayIntStack.peek());
        assertEquals(10, arrayIntStack.peek());
        assertEquals(10000, arrayIntStackBig.peek());
        assertEquals(10000, arrayIntStackBig.peek());

        try{

            emptyStack.pop();
            fail("Should not throw error");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }
    }

}