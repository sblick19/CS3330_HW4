package test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import test.Vehicle.FuelType;
import test.Vehicle.StartMechanism;
import test.Vehicle.VehicleColor;

public class VehicleManager {
	private static VehicleManager instance = null;
	private final static double distance = 300;
	private final static double fuelPrice = 3.25;
	private final String vehicleFilePath;
	private ArrayList<Vehicle> vehicleList;
	
	private VehicleManager() {
		vehicleList = new ArrayList<Vehicle>();
		vehicleFilePath = "/path/to/vehicle/file.csv"; // Replace with the actual file path
		initializeStock();
	}

	public static synchronized VehicleManager getInstance() {
		if (instance == null) {
			instance = new VehicleManager();
		}
		return instance;
	}

	public boolean initializeStock() {
 try (BufferedReader reader = new BufferedReader(new FileReader(vehicleFilePath))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 13) { // Assuming CSV format: title,price,year,genre
					String brand = parts[0];
					String make = parts[1];
					long modelYear = Long.parseLong(parts[2]);
					double price = Double.parseDouble(parts[3]);
					VehicleColor color = VehicleColor.valueOf(parts[4]);
					FuelType fuelType = FuelType.valueOf(parts[5]);
					double mileage = Double.parseDouble(parts[6]);
					double mass = Double.parseDouble(parts[7]);
					int cylinders = Integer.parseInt(parts[8]);
					double gasTankCapacity = Double.parseDouble(parts[9]);
					StartMechanism startType = StartMechanism.valueOf(parts[10]);

					// Create a new vehicle object
					Vehicle vehicle;
					if (parts[11].equals("Car")) {
						vehicle = new Car(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
					} else if (parts[11].equals("Truck")) {
						vehicle = new Truck(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
					} else if (parts[11].equals("SUV")) {
						vehicle = new SUV(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
					} else if (parts[11].equals("MotorBike")) {
						vehicle = new MotorBike(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
					} else {
						// Handle the case when the vehicle type is unknown
						System.out.println("Unknown vehicle type: " + parts[11]);
						return false;
					}

					// Add the vehicle to the vehicleList
					vehicleList.add(vehicle);

					return true;
	            }
	        }
	        // Return true if vehicle is not empty
			return !vehicleList.isEmpty();

	    } catch (IOException e) {
	        e.printStackTrace();
	        return false; // Return false if an exception occurs (file not found, etc.)
	    }
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
		
<<<<<<< HEAD
		//Print info for all vehicles in the list
=======
		//print all vehicle data
>>>>>>> d077c9b7aa16125bc71da54ad6ac825b0b44ed22
		for(Vehicle v : vehicleList) {
			System.out.println(v.getModelYear() + " " + v.getBrand() + " " + v.getMake() + ": "
					+ "\nMatenence Cost: " + v.calculateMaintenanceCost(distance) 
					+ ", \nFuel Efficency: " + v.calculateFuelEfficiency(distance, fuelPrice)
					+ ", ");
			v.startEngine();
		}
		
	}
	
	public boolean removeVehicle(Vehicle vehicle) {
		//remove vehicle from list
		if(vehicleList.remove(vehicle)) {
			return true;
		}else {
			return false;
		}

	}
	
	public boolean addVehicle(Vehicle vehicle) {
		//add vehicle to list
		if(vehicleList.add(vehicle)) {
			return true;
		}else {
			return false;
		}

		
	}
	
	public boolean saveVehicleList() {


	}
	
	private boolean isVehicleType(Class<?> clazz) {
		//check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return false;
		}
		
		//check if the vehicle type is in the list
		for(Vehicle v : vehicleList) {
			if(clazz.isInstance(v)) {
				return true;
			}
		}
		return false;
	}
	
	public int getNumberOfVehiclesByType(Class<?> clazz) {
		//check if list is empty
		if(this.vehicleList.size() == 0) {
			System.out.println("Vehicle List is empty!");
			return 0;
		}
		
		//count the number of vehicles of the type
		int count = 0;
		for(Vehicle v : vehicleList) {
			if(isVehicleType(clazz)) {
				count++;
			}
		}
		return count;
		
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
