package org.naveenapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
    @Test
    public void test1(){
        Main mainOBJ=new Main();
        int ActualResult=mainOBJ.divide(10,2);

       assertEquals(5,ActualResult);
       
    }

}