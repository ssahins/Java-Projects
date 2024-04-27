/*
An abstract class in object-oriented programming serves as a blueprint for other classes.
It cannot be instantiated on its own; rather, it's meant to be subclassed by other classes,
which then inherit its properties and methods.
Abstract classes can contain both abstract methods (methods without a body, which must be implemented by subclasses) and
concrete methods (methods with a body, which can be inherited as-is or overridden by subclasses).
They provide a way to define common behavior and enforce a structure for subclasses
while allowing for customization through method implementations.
 */

abstract class Shape {

    public abstract double calculateArea();

    public void printArea() {
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ClassAbstract {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2.5);

        rectangle.printArea();
        circle.printArea();
    }
}

