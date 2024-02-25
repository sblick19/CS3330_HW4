package test;
import java.util.ArrayList;

public class VehicleManager {
	
	private final static String vehicleFilePath;
	private ArrayList<Vehicle> vehicleList = new ArrayList <Vehicle>();
	
	private final static double distance = 300;
	private final static double fuelPrice = 3.25;
	
	public boolean initializeStock() {
		
	}
	
	public void displayAllCarInformation() {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
		
		//check for cars and print info if found
		int carFound = 0;
		for(Vehicle v : vehicleList) {
			if(v instanceof Car) {
				System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
						+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
						+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
						+ ", ");
				v.startEngine();
				carFound = 1;
			}
		}
		
		//check if none found
		if(carFound == 0) {
			System.out.println("No cars in the list!");
		}
	}
	
	public void displayAllTruckInformation() {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
				
		//check for trucks and print info if found
		int truckFound = 0;
		for(Vehicle v : vehicleList) {
			if(v instanceof Truck) {
				System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
						+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
						+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
						+ ", ");
				v.startEngine();
				truckFound = 1;
			}
		}
				
		//check if none found
		if(truckFound == 0) {
			System.out.println("No trucks in the list!");
		}
	}
	
	public void displayAllSUVInformation() {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
				
		//check for SUVs and print info if found
		int suvFound = 0;
		for(Vehicle v : vehicleList) {
			if(v instanceof SUV) {
				System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
						+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
						+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
						+ ", ");
				v.startEngine();
				suvFound = 1;
			}
		}
				
		//check if none found
		if(suvFound == 0) {
			System.out.println("No SUVs in the list!");
		}
	}
	
	public void displayAllMotorBikeInformation() {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
				
		//check for motorbikes and print info if found
		int motorBikeFound = 0;
		for(Vehicle v : vehicleList) {
			if(v instanceof MotorBike) {
				System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
						+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
						+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
						+ ", ");
				v.startEngine();
				motorBikeFound = 1;
			}
		}
				
		//check if none found
		if(motorBikeFound == 0) {
			System.out.println("No motorbikes in the list!");
		}
	}
	
	public void displayVehicleInformation(Vehicle v) {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
		
		//Find the correct vehicle in the list and print the info
		int vehicleFound = 0;
		for(Vehicle tv : vehicleList) {
			if(tv == v) {
				System.out.println(tv.getModelYear() + " " + tv.getBrand() + " " + tv.getMake() + ": "
						+ "\nMatenence Cost: " + tv.calculateMaintenanceCost(distance) 
						+ ", \nFuel Efficency: " + tv.calculateFuelEfficiency(distance, fuelPrice)
						+ ", ");
				tv.startEngine();
				vehicleFound = 1;
			}
		}
		
		//check if none found
		if(vehicleFound == 0) {
			System.out.println("Vehicle is not in the list!");
		}
	}
	
	public void displayAllVehicleInformation() {
		//Check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return;
		}
		
		//print all vehicle data
		for(Vehicle v : vehicleList) {
			System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
					+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
					+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
					+ ", ");
			v.startEngine();
		}
		
	}
	
	public boolean removeVehicle(Vehicle vehicle) {
		return false;
	}
	
	public boolean addVehicle(Vehicle vehicle) {
		
	}
	
	public boolean saveVehicleList() {
		
	}
	
	private boolean isVehicleType(Vehicle v, Class clazz) {
		
	}
	
	public int getNumberOfVehichlesByType(Class clazz) {
		
	}
	
	public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
		
	}
	
	public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
		
	}
	
	public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice){
		
	}
	
	public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice){
		
	}
	
	public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice) {
		
	}

}
