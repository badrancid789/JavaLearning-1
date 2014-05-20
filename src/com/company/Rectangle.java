package com.company;

/**
 * Created by leebrandt on 5/19/14.
 */
public class Rectangle extends Shape {
    public Rectangle(int width, int length){
        sides = new int[4];
        setLength(length);
        setWidth(width);
    }

    public void setWidth(int width){
        sides[0] = sides[2] = width;
    }

    public int getWidth(){
        return sides[0];
    }


    public void setLength(int length){
        sides[1] = sides[3] = length;
    }

    public int getLength(int length){
        return sides[1];
    }

    public double getArea(){
        return sides[0] * sides[1];
    }

    public String getType(){
        return "Rectangle";
    }
}
