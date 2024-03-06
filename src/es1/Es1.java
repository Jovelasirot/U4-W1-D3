package es1;

import entities.Rectangle;

public class Es1 {
    public static void main(String[] args) {
        Rectangle rectangleA = new Rectangle(2, 10);
        Rectangle rectangleB = new Rectangle(20, 50);


        System.out.println("Rectangle A:");
        Rectangle.printRectangle(rectangleA);

        System.out.println("-----------------");

        System.out.println(rectangleB);
        System.out.println("Rectangle B:");
        Rectangle.printRectangle(rectangleB);

        System.out.println("-----------------");

        System.out.println("Sum of the rectangles:");
        Rectangle.printTwoRectangle(rectangleA, rectangleB);
    }


}
