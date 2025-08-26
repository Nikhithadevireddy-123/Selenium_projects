package assignment_day4;

//Create a Bank class with a method getInterestRate()  
class Bank {
    double getInterestRate() {
        return 0;  
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.5;
    }
public class Bank_getInterestRate {
    public static void main(String[] args) {
       Bank b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        Bank b1= new ICICI();
        System.out.println("ICICI Interest Rate: " + b1.getInterestRate() + "%");

        Bank b2 = new HDFC();
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}

}
