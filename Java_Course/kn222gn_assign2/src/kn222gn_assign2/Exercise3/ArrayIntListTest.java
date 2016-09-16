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
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void add() throws Exception {
        ArrayIntList arrayIntList = new ArrayIntList();
        arrayIntList.add(1337);
        assertEquals(1337, arrayIntList.get(0));
    }

    @Test
    public void addAt() throws Exception {

    }

    @Test
    public void remove() throws Exception {

    }

    @Test
    public void get() throws Exception {

    }

    @Test
    public void indexOf() throws Exception {

    }

}