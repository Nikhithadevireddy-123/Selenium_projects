package Day_5;

interface Printer {
 void print(String document);
}

class LaserPrinter implements Printer {
 public void print(String document) {
     System.out.println("LaserPrinter is printing: " + document);
 }
}

class InkjetPrinter implements Printer {
 public void print(String document) {
     System.out.println("InkjetPrinter is printing: " + document);
 }
}

public class PrinterSwitchDemo {
 public static void main(String[] args) {

     Printer p;
     p = new LaserPrinter();
     p.print("Java Interface Documentation");
     p = new InkjetPrinter();
     p.print("Java Patterns Notes");
 }
}
