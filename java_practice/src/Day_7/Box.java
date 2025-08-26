package Day_7;

class Boxx {
    int length;

    // Constructor
    public Boxx(int length) {
        this.length = length;
    }

    // Method to modify the length of a Box object
    public void modifyLength(Boxx b, int newLength) {
        b.length = newLength; // Modifying the length of the passed object
    }
}

public class Box {
    public static void main(String[] args) {
        // Create an original Box object
        Boxx originalBox = new Boxx(10);
        System.out.println("Original Box length before modification: " + originalBox.length); // Output: 10

        // Create another Box object to call the modifyLength method
        Boxx modifier = new Boxx(0); // This object itself won't be modified, but its method will modify originalBox

        // Call the method to modify the originalBox's length
        modifier.modifyLength(originalBox, 20);

        System.out.println("Original Box length after modification: " + originalBox.length); // Output: 20
    }
}
