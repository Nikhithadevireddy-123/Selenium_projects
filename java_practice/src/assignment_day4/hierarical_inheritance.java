package assignment_day4;

class After12th {
	   void Streams() {
	       System.out.println("Available Streams after 12th: Engineering, Medical, Other Courses");
	    }
	}

	class Engineering extends After12th {
	    void Engineeringoptions() {
	        System.out.println("Engineering stream options: IT, Mechanical, CS");
	    }
	}
	class IT extends Engineering {
	    void showIT() {
	        System.out.println("IT: Information Technology");
	    }
	}

	class Mechanical extends Engineering {
	    void showMechanical() {
	        System.out.println("Mechanical stream");
	    }
	}

	class CS extends Engineering {
	    void showCS() {
	        System.out.println("CS: Computer Science stream.");
	    }
	}
	class Medical extends After12th {
	    void Medicaloptions() {
	        System.out.println("Medical stream : MBBS, BDS");
	    }
	}
	class MBBS extends Medical {
	    void showMBBS() {
	        System.out.println("MBBS: Bachelor of Medicine and Bachelor of Surgery.");
	    }
	}

	class BDS extends Medical {
	    void showBDS() {
	        System.out.println("BDS: Bachelor of Dental Surgery.");
	    }
	}

	class OtherCourses extends After12th {
	    void showOtherCourses() {
	        System.out.println("Other courses : BBA, BCA");
	    }
	}
	class BBA extends OtherCourses {
	    void showBBA() {
	        System.out.println("BBA: Bachelor of Business Administration.");
	    }
	}

	class BCA extends OtherCourses {
	    void showBCA() {
	        System.out.println("BCA: Bachelor of Computer Applications.");
	    }
	}

	public class hierarical_inheritance {
	    public static void main(String[] args) {
	        IT it = new IT();
	        it.Streams();
	        it.Engineeringoptions();
	        it.showIT();

	        System.out.println("----------------------------");

	        Mechanical mech = new Mechanical();
	        mech.showMechanical();

	        System.out.println("----------------------------");

	        CS cs = new CS();
	        cs.showCS();

	        System.out.println("------------------------------");
  
	        MBBS mbbs = new MBBS();
	        mbbs.Streams();
	        mbbs.Medicaloptions();
	        mbbs.showMBBS();

	        System.out.println("----------------------------");

	        BDS bds = new BDS();
	        bds.showBDS();

	        System.out.println("--------------------------------");

	        BCA bca = new BCA();
	        bca.Streams();
	        bca.showOtherCourses();
	        bca.showBCA();

	        System.out.println("----------------------------");

	        BBA bba = new BBA();
	        bba.showBBA();
	    }
	}

