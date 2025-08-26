package oops_practice;

class Hospital {
    void hospitalInformation(String info) {
        System.out.println("Hospital Info: " + info);
    }
}

class Doctor extends Hospital {
    void doctorAvailable(String available) {
        System.out.println("Doctor Available: " + available);
    }
}

class Gynac extends Doctor {
    void gynacologistInfo(String specialistName) {
        System.out.println("Gynaecologist: " + specialistName);
    }
}

class Endo extends Doctor {
    void endocrinologistInfo(String specialistName) {
        System.out.println("Endocrinologist: " + specialistName);
    }
}

class Cardiac extends Doctor {
    void cardiologistInfo(String doctorName) {
        System.out.println("Cardiologist: " + doctorName);
    }
}

class Operation extends Cardiac {
    void operationInfo(String operationType) {
        System.out.println("Cardiac Operation Type: " + operationType);
    }
}

class OPD extends Cardiac {
    void opdInfo(String opdDoctor) {
        System.out.println("Cardiac OPD handled by: " + opdDoctor);
    }
}

class Nurse extends Hospital {
    void nurseInfo(String nurseName) {
        System.out.println("Nurse Name: " + nurseName);
    }
}

class Accountant extends Hospital {
    void accountantInfo(String accountantName) {
        System.out.println("Accountant Name: " + accountantName);
    }
}

class Payments extends Accountant {
    void paymentInfo(double amount) {
        System.out.println("Payment Processed: ₹" + amount);
    }
}

class Documentation extends Accountant {
    void documentationInfo(String fileName) {
        System.out.println("Document Created for: " + fileName);
    }
}

public class hospital_heirarchy {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.hospitalInformation("City Care Hospital");
        op.doctorAvailable("Yes");
        op.cardiologistInfo("Dr. Ram");
        op.operationInfo("Bypass Surgery");

        System.out.println("-----------------------");

        OPD opd = new OPD();
        opd.hospitalInformation("City Care Hospital");
        opd.doctorAvailable("Yes");
        opd.cardiologistInfo("Dr. Anita");
        opd.opdInfo("Dr. Anita");

        System.out.println("-----------------------");

        Gynac g = new Gynac();
        g.hospitalInformation("City Care Hospital");
        g.doctorAvailable("Yes");
        g.gynacologistInfo("Dr. Priya");

        System.out.println("-----------------------");

        Nurse n = new Nurse();
        n.hospitalInformation("City Care Hospital");
        n.nurseInfo("Nurse Maria");

        System.out.println("-----------------------");

        Payments p = new Payments();
        p.hospitalInformation("City Care Hospital");
        p.accountantInfo("Mr. Rajesh");
        p.paymentInfo(4500.75);

        System.out.println("-----------------------");

        Documentation d = new Documentation();
        d.hospitalInformation("City Care Hospital");
        d.accountantInfo("Mr. Rajesh");
        d.documentationInfo("PatientRecord_123.pdf");
    }
}


