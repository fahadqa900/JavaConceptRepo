package com.metlife.Methods;

import com.metlife.formulae.Area;

public class Demo1
{
    //Area of Rectangle:

    public static void main(String[] args)
    {
        Area a1=new Area();
        double result= a1.areaofRectangle(12,2);
        System.out.println("Area of rectangle is "+result);
    double result1=a1.areaofTriangle(1,30);
        System.out.println("Area of triangle "+result1);
    }
}
