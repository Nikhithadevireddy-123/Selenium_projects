package Day_7;

class Data1 {
    int value;
    Data1(int value)
    {
    	this.value = value;
    }
}

public class PassObject {
    public static void modifyObject(Data1 myData) {
        myData.value = 20; // Modifies the state of the original object
        System.out.println("Inside method (object): data.value = " + myData.value);
    }

    public static void main(String[] args) {
        Data1 myData = new Data1(10);
        System.out.println("Before method call (object): myData.value = " + myData.value);
        modifyObject(myData);
        System.out.println("After method call (object): myData.value = " + myData.value); // myData.value is now 20
    }

}
