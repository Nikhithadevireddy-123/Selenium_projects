package assignment_day4;

class Hospital
{
	void hospitalinformation(String info)
	{
		System.out.println("hospitalinfo:"+info);
	}
}
class Doctor extends Hospital
{
	void doctavailable(String available)
	{
		System.out.println("doctoravai:"+available);
	}
}
class  Gynac extends Doctor
{
	void gynacinf(String gynacologistspecialist)
	{
		System.out.println("gynacologist:"+gynacologistspecialist);
	}
}
class Endo extends Doctor
{
	void endoinfo(String endocardiagistspecialist )
	{
		System.out.println("endocardiagist:"+endocardiagistspecialist);
	}
}
class Cardiac extends Doctor 
{
    void cardiacInfo(String cardiacDoctor) {
        System.out.println("Cardiologist: " + cardiacDoctor);
    }
}

class Operation extends Cardiac
{
    void operationInfo(String operationType) {
        System.out.println("Cardiac Operation Type: " + operationType);
    }
}

class OPD extends Cardiac
{
    void opdInfo(String opdDoctor) {
        System.out.println("Cardiac OPD : " + opdDoctor);
    }
}

class Nurse extends Hospital
{
    void nurseInfo(String nurseName) {
        System.out.println("Nurse Name: " + nurseName);
    }
}

class Accountant extends Hospital
{
    void accountantInfo(String accountantName) {
        System.out.println("Accountant Name: " + accountantName);
    }
}


class Payments extends Accountant
{
    void paymentInfo(double amount) {
        System.out.println("Payment processed:" + amount);
    }
}

class Documentation extends Accountant 
{
    void documentationInfo(String fileName) {
        System.out.println("Document created for: " + fileName);
    }
}
public class Hospital_hierarchy_inheritance 
{
    public static void main(String[] args) {
        Operation op = new Operation();
        op.hospitalinformation("Amma hospital");
        op.doctavailable("yes or no");
        op.cardiacInfo("Dr. Ram");
        op.operationInfo("Bypass Surgery");

        System.out.println("-----------------------");

        OPD opd = new OPD();
        opd.hospitalinformation("Amma hospital");
        opd.doctavailable("yes or no");
        opd.cardiacInfo("Dr. Nikhitha");
        opd.opdInfo("Dr. Nikhitha");
        
        System.out.println("---------------------");


        Gynac g = new Gynac();
        g.hospitalinformation("Amma hospital");
        g.doctavailable("Dr. Priya");
        g.gynacinf("Dr. Priya");

        System.out.println();

        Nurse n = new Nurse();
        n.hospitalinformation("Amma hospital");
        n.nurseInfo("Nurse chinni");

        System.out.println();

        Payments p = new Payments();
        p.hospitalinformation("Amma hospital");
        p.accountantInfo("Mr.chintu");
        p.paymentInfo(4500.75);

        System.out.println();

        Documentation d = new Documentation();
        d.hospitalinformation("Amma hospital");
        d.accountantInfo("Mr. Rajesh");
        d.documentationInfo("PatientRecord_123.pdf");
    }
}
