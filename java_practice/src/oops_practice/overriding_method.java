package oops_practice;

class doctor {
    void treatPatient() {
        System.out.println("Doctor gives general treatment.");
    }
}

class CardiacDoctor extends doctor {
    void CardiacDoctor() {
        System.out.println("Cardiac Doctor treats heart related diseases.");
    }
}


public class overriding_method {
    public static void main(String[] args) {
        doctor Doc = new doctor();
        Doc.treatPatient();  
       CardiacDoctor ref = new CardiacDoctor();
        ref.CardiacDoctor();  
    }
}
