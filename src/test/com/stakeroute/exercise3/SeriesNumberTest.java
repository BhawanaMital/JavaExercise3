package com.stakeroute.exercise3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesNumberTest {

    SeriesNumber number;
    @Before
    public void setUp() throws Exception {
        number=new SeriesNumber();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }

    @Test
    public void checkConsecutiveFailure() {
        boolean expected=false;
        boolean actual=number.checkConsecutive("98,96,95,94,93");
        assertEquals(expected,actual);

    }

    @Test
    public void checkConsecutive() {
        boolean expected=true;
        boolean actual=number.checkConsecutive("54,53,52,51,50,49,48");
        assertEquals(expected,actual);

    }

}