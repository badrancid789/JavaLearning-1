package com.company;

public abstract class Shape implements iShape {

    protected int[] sides = new int[]{};

    public int getPerimeter(){
        int perimeter = 0;
        for (int side : sides){
            perimeter+=side;
        }
        return perimeter;
    }
}
