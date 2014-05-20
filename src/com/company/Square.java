package com.company;

public class Square extends Shape {

    private int maxSideLength = 55;
    public Square(int sideLength){
        sides = new int[4];
        setSideLength(sideLength);
    }

    public int getSideLength(){
        return sides[0];
    }

    public void setSideLength(int sideLength){
        if(sideLength < maxSideLength) {
            sides[0] = sides[1] = sides[2] = sides[3] = sideLength;
        }else{
            throw new IllegalArgumentException("Side length must be less than 55");
        }
    }

    public int[] getSides(){
        return sides;
    }

    public double getArea(){
        return sides[0] * sides[1];
    }

    public String getType(){
        return "Square";
    }
}