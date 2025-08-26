package Day_7;

class Data {
    int value;

    public Data(int value) {
        this.value = value;
    }
}

public class CallByValueDemo {
    public static void changeReference(Data d) {
        d = new Data(500); // d now points to a NEW object
    }

    public static void main(String[] args) {
        Data originalData = new Data(100);
        System.out.println("Before method call (originalData.value): " + originalData.value); // Output: 100

        changeReference(originalData); // Pass the reference by value

        System.out.println("After method call (originalData.value): " + originalData.value); // Output: 100
    }
}
