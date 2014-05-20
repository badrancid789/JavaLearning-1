package com.company;

/**
 * Created by leebrandt on 5/19/14.
 */
public class Triangle extends Shape{
    public Triangle(int side1, int side2, int side3){
        sides = new int[]{side1, side2, side3};
    }

    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * ((s-sides[0])*(s-sides[1])*(s-sides[2])));
    }

    public String getType(){
        return "Triangle";
    }
}
