package entities;

public class Rectangle {

    private double height;
    private double width;


    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public static void printTwoRectangle(Rectangle rectangleA, Rectangle rectangleB) {
        double sumRectangleAreas = rectangleA.rectangleArea() +
                rectangleB.rectangleArea();
        double sumRectanglePerimeters = rectangleA.rectanglePerimeter() +
                rectangleB.rectanglePerimeter();
        System.out.println("Sum of the areas: " +
                sumRectangleAreas + " cm²");
        System.out.println("Sum of the perimeters: " +
                sumRectanglePerimeters + " cm");
    }

    public static void printRectangle(Rectangle rectangleX) {
        System.out.println("Area of the rectangle: " + rectangleX.rectangleArea()
                + " cm²");
        System.out.println("Perimeter of the rectangle: " + rectangleX.rectanglePerimeter() +
                " cm");
    }

    public double rectangleArea() {
        return height * width;
    }

    public double rectanglePerimeter() {
        return (height * width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
