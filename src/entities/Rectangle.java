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

    public double rectangleArea() {
        return height * width;
    }

    public double rectanglePerimeter() {
        return (height * width) * 2;
    }

    public void printRectangle() {
        System.out.println("Area of the rectangle: " + rectangleArea()
                + " cm²");
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter() +
                " cm");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
