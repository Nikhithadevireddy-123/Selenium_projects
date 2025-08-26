package assignment_day4;

class isvehicle {
	void no_of_Vehicle(int Vehicle) {
		System.out.println("vehical_no:"+Vehicle);
	}
  }
class four_wheeler extends isvehicle{
	void wheels(int wheels) {
		System.out.println("four_wheels:"+wheels);
	}
}
  class petrol_four_wheeler extends four_wheeler{
	   void fuel_type(String fuel) {
		   System.out.println("fuel_type"+fuel);
	   }
  }
  class fiveseater_petrol extends petrol_four_wheeler{
	   void seating(int seats) {
		   System.out.println("seating:"+seats);
	   }
  }
  class baleno_fivestar_petrol_four_wheeler extends fiveseater_petrol{
	   void modelname(String model) {
		   System.out.println("modelname:"+model);
	   }

	   }
  public class Vehicle_multilevel{ 
	public static void main(String[] args) {
		baleno_fivestar_petrol_four_wheeler veh=new baleno_fivestar_petrol_four_wheeler();
		veh.no_of_Vehicle(3678);
		veh.wheels(4);
		veh.fuel_type("petrol");
		veh.seating(22);
		veh.modelname("baleno");
		
	}

}
