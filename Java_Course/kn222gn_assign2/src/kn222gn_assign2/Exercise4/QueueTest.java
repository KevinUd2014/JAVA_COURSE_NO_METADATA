
package kn222gn_assign2.Exercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by Golde on 2016-09-20.
 */

public class QueueTest {

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
    
    public Queue addElementsToQueue(int size){
        
        Queue queue = new Queue<>();

        for(int i = 1; i <= size; i++){

            queue.enqueue(i);
        }
        return queue;
    }

    @Test
    public void size() throws Exception {

        Queue queue1 = addElementsToQueue(2);
        Queue queue2 = addElementsToQueue(20000);

        //testing a negative queue
        Queue queue3 = addElementsToQueue(-10);
        assertEquals(0, queue3.size());

        //tests so that the size is correct
        assertEquals(2, queue1.size());
        queue1.dequeue();
        assertEquals(1, queue1.size());

        assertEquals(20000, queue2.size());

        for(int i = 0; i < 10000; i++){

            queue2.dequeue();
        }
        assertEquals(10000, queue2.size());
    }

    @Test
    public void isEmpty() throws Exception {

        Queue queue1 = addElementsToQueue(2);
        Queue queue2 = addElementsToQueue(0);
        Queue queue3 = addElementsToQueue(-2);

        assertFalse(queue1.isEmpty());
        assertEquals(false, queue1.isEmpty());

        assertEquals(true, queue2.isEmpty());

        assertEquals(true, queue3.isEmpty());

    }

    @Test
    public void enqueue() throws Exception {

        Queue queue1 = addElementsToQueue(2);
        Queue queue2 = addElementsToQueue(20000);

        assertEquals(2, queue1.size());

        //checks so that the 2 values is correct
        assertEquals(1, queue1.first());
        assertEquals(2, queue1.last());
        assertEquals(1, queue2.first());
        assertEquals(20000, queue2.last());

        assertFalse(queue1.isEmpty());
    }

    @Test
    public void dequeue() throws Exception {

        Queue queue2 = addElementsToQueue(20000);

        assertEquals(1, queue2.first());
        assertEquals(20000, queue2.last());

        for(int i = 1; i < 10000; i++){

            queue2.dequeue();
        }

        //assertEquals(queue2.first(), 1);
        assertEquals(10000, queue2.first());
        assertEquals(20000, queue2.last());

    }

    @Test
    public void first() throws Exception {

        Queue queue1 = addElementsToQueue(2);
        assertEquals(queue1.first(), queue1.dequeue());
        //assertEquals(queue1.first(), queue1.dequeue());

        Queue queue2 = addElementsToQueue(20000);
        assertEquals(queue2.first(), queue2.dequeue());
        queue2.dequeue();
        queue2.dequeue();
        assertEquals(queue2.first(), queue2.dequeue());

        Queue queue3 = addElementsToQueue(20000);

        try{

            for(int i = 0; i < 19999; i++){

                queue3.dequeue();
            }
            queue3.first();
            assertEquals(20000, queue3.first());
            //assertEquals(queue3.first(), 1);
            //fail("Should not throw error");
            System.out.println(queue3.first());
        }
        catch(IndexOutOfBoundsException error){
            assertTrue(true);
        }
    }

    @Test
    public void last() throws Exception {

        Queue queue1 = addElementsToQueue(2);
        Queue queue2 = addElementsToQueue(20000);
        Queue queue3 = addElementsToQueue(0);

        assertEquals(2, queue1.last());
        queue1.dequeue();
        assertEquals(2, queue1.last());

        assertEquals(20000, queue2.last());

        try{

            //shoukd not throw error if the queue is empty just sets the error to true
            queue3.last();
            fail("Should not throw error");
        }
        catch(IndexOutOfBoundsException error){

            assertTrue(true);
        }
    }
}
