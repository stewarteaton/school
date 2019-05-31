package lab7;
	//This is a driver program, you need to add a few lines of code to make the program run 
	//if you have successfully finished your other three classes.

	public class VehicleDemo{
		public static void main(String[] args){
	   
			//constant for the number of vehicles
		    final int NUM_VEHICLES = 3;
		      
		    //create an array of Vehicle references
		    Vehicle[] vehicles = new Vehicle[NUM_VEHICLES];
		      
		    //assign Vehicle objects to the array elements
		    vehicles[0] = new Vehicle("MAN Truck & Bus", "2016");
		    vehicles[1] = new Bus("Scania", "2017", 50);
		    vehicles[2] = new Truck("Volvo", "2018", 10000);
		      
			//add a for loop below to display info for each vehicle
	      for(int i=0;i<vehicles.length;i++) {
	    	  System.out.print(vehicles[i].toString());
	    	  //vehicles[i].toString();
		  
		  
		  
	   }
	}
}
