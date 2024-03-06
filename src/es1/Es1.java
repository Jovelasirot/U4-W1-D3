package es1;

import entities.Rectangle;

public class Es1 {
    public static void main(String[] args) {
        Rectangle rectangleA = new Rectangle(2, 10);
        Rectangle rectangleB = new Rectangle(20, 50);


        System.out.println("RectangleA:");
        rectangleA.printRectangle();

        System.out.println("RectangleB");
        rectangleB.printRectangle();


        System.out.println("Sum of the rectangles:");
        Rectangle.printTwoRectangle(rectangleA, rectangleB);
    }


}
