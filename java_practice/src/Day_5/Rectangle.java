package Day_5;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
       if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
       } else {
            System.out.println("Invalid dimensions.");
            this.width = 1;
            this.height = 1;
        }
   }
    public void setWidth(float width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be positive.");
        }
    }
    public void setHeight(float height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be positive.");
        }
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void displayDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 2);     
        r1.displayDetails();

        System.out.println();

        Rectangle r2 = new Rectangle(-2, 1);   
        r2.displayDetails();

        System.out.println();

        r2.setWidth(4);   
        r2.setHeight(-3);  
        r2.displayDetails();
    }
}
