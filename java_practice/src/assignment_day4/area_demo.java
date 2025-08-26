package assignment_day4;

interface Polygon {
 double getArea();
 default double getPerimeter(int... sides) {
     double sum = 0;
     for (int side : sides) {
         sum =sum + side;
     }
     return sum;
 }
 static String shapeInfo() {
     return "Polygons are 2D shapes with straight sides.";
 }
}
class Rectangle implements Polygon {
 private double length, width;
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 public double getArea() {
     return length * width;
 }
}
class Triangle implements Polygon {
 private double base, height;

 Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }
 public double getArea() {
     return 0.5 * base * height;
 }
}
public class area_demo {
 public static void main(String[] args) {
     Rectangle rect = new Rectangle(5, 3);
     Triangle tri = new Triangle(4, 6);
     System.out.println("Rectangle area: " + rect.getArea());
     System.out.println("Rectangle perimeter: " + rect.getPerimeter(5, 3, 5, 3));
     System.out.println("Triangle area: " + tri.getArea());
     System.out.println("Triangle perimeter: " + tri.getPerimeter(3, 4, 5));
     System.out.println(Polygon.shapeInfo());
 }
}

