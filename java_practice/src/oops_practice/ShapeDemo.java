package oops_practice;

class Shape {
    void area() {
        System.out.println("This is the area method of Shape.");
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();

        Circle c = new Circle(5);
        c.area();

        Rectangle r = new Rectangle(4, 6);
        r.area();
    }
}

