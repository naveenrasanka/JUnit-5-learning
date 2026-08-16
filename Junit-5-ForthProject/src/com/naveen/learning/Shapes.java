package com.naveen.learning;

public class Shapes {

    public double area(double length){
        double res=length*length;
        return  res;
    }
    public double CircleArea(double radius){


        //return Math.round(Math.PI*(Math.pow(radius,2)));
        return 3.14* radius* radius;
    }
}
