package com.naveen.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapesTest {
    @Test
    public void testSquareArea(){

        Shapes shapeObj=new Shapes();
        assertEquals(100,shapeObj.area(10));

    }
    @Test
    public  void testCircle(){
        Shapes shapeObj=new Shapes();
        assertEquals(78.5,shapeObj.CircleArea(5),"this is not work");
    }
}