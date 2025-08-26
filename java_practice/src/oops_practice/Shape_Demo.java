package oops_practice;

interface Drawable {
 void draw();
}

abstract class Shape11 implements Drawable {
 abstract double area();
}

class Circle11 extends Shape11 {
 double radius;

 Circle11(double radius) {
     this.radius = radius;
 }

 double area() {
     return Math.PI * radius * radius;
 }

 public void draw() {
     System.out.println("Drawing Circle with radius " + radius);
 }
}

class Rectangle11 extends Shape11 {
 double length, width;

 Rectangle11(double length, double width) {
     this.length = length;
     this.width = width;
 }

 double area() {
     return length * width;
 }

 public void draw() {
     System.out.println("Drawing Rectangle with length " + length + " and width " + width);
 }
}

class Triangle extends Shape11 {
 double base, height;

 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 double area() {
     return 0.5 * base * height;
 }

 public void draw() {
     System.out.println("Drawing Triangle with base " + base + " and height " + height);
 }
}

public class Shape_Demo {
 public static void main(String[] args) {
     Shape11[] shapes = {
         new Circle11(5),
         new Rectangle11(4, 6),
         new Triangle(3, 7)
     };

     for (Shape11 shape : shapes) {
         shape.draw();
         System.out.println("Area: " + shape.area());
         System.out.println();
     }
 }
}

