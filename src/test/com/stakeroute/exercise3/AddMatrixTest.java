package com.stakeroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddMatrixTest {
    AddMatrix addMatrix;

    @Before
    public void setUp() throws Exception {
        addMatrix = new AddMatrix();
    }

    @After
    public void tearDown() throws Exception {
        addMatrix = null;
    }

    @Test
    public void returnadditionMatrix() {
        addMatrix.setMatrix11(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        addMatrix.setMatrix2(new int[][]{{9, 8}, {7, 6}, {5, 4}});

        int[][] actual = addMatrix.addOfMatrix();

        assertArrayEquals(new int[][]{{10, 10}, {10, 10}, {10, 10}}, actual);
    }


    @Test
    public void returnAdditionOfMatricesNotNull() {
        addMatrix.setMatrix11(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        addMatrix.setMatrix2(new int[][]{{9, 8}, {7, 6}, {5, 4}});
        int[][] actual = addMatrix.addOfMatrix();
        System.out.println(actual);
        assertNotNull(actual);


    }

    @Test
    public void returnAdditionOfMatricesNull() {
        int[][] actual = addMatrix.addOfMatrix();

        assertNull(actual);
    }
}

