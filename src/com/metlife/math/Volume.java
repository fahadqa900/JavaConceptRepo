package com.metlife.math;

public class Volume
{
    public static void VolumeOfSphere()
    {
        double radius=10;
        double volume=4*3.14*10*10*10/3;
        System.out.println("Area of Sphere is "+volume);
    }
    public static void VolumeOfCylinder()
    {
        double radius=10,height=12;
        double volume=3.14*radius*radius*height;
        System.out.println("Area of Cylinder is "+volume);
    }
    public static void VolumeOfPyramid()
    {
        double base=10,area=12,height=10;
        double volume=base*area*height/3;
        System.out.println("Volume of Pyramid is"+volume);
    }
    public static void VolumeOfCone()
    {
        double radius=10,height=12;
        double volume=3.14*radius*radius*height/3;
        System.out.println("Volume of Cone is "+volume);
    }
    public static void VolumeOfCuboid()
    {
        double length=10,width=20,height=30;
        double volume=length*width*height;
        System.out.println("Volume of Cuboid is "+volume);
    }
    public static void VolumeOfHemisphere() {
        double radius = 12;
        double volume = 2 * 3.14 * radius * radius * radius / 3;
        System.out.println("Volume of Hemisphere is " + volume);
    }
}
