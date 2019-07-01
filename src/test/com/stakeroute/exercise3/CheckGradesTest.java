package com.stakeroute.exercise3;

import org.junit.Test;

import java.net.PortUnreachableException;

import static org.junit.Assert.*;

public class CheckGradesTest {

    private static CheckGrades checkGrades;
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
        checkGrades=null;
    }

    @Test
    public void returnTrue(){

        checkGrades=new CheckGrades(2,new int[]{89,70});
        String actual=checkGrades.checkGradesOfStd();

        assertEquals("true",actual);

    }

    @Test
    public void checkGradeFailure(){

        checkGrades=new CheckGrades(3,new int[] {67,111,80});
        String actual=checkGrades.checkGradesOfStd();
        assertEquals("error",actual);

    }

}