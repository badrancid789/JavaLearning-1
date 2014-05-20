package com.company;

public class Main {

    public static void main(String[] args) {

        iShape[] shapes = new iShape[]{
                new Triangle(4,4,4),
                new Square(4),
                new Rectangle(4,8) };

        try {
            ((Square)shapes[1]).setSideLength(34);

            for (iShape shape : shapes) {
                System.out.printf("The %s's perimeter is %d and its area is %s%n",
                        shape.getType(),
                        shape.getPerimeter(),
                        (double) Math.round(shape.getArea() * 100) / 100);
                System.out.println("\n");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        System.out.println(StringManipulation.removeEvens("Hello Everybody"));
        System.out.println(StringManipulation.removeVowels("I am a little teapot."));
    }
}