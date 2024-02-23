package test;

public class Truck extends Vehicle{

	public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		
	}

	public double calculateMaintenanceCost(double distance) {
        // Implementation specific to calculating maintenance cost for a truck
        return (distance * mass * (2024 - modelYear)* cylinders * 0.002);
    }


    public double calculateFuelEfficiency(double distance, double fuelPrice) {
        // Implementation specific to calculating fuel efficiency for a truck
        return (cylinders * gasTankCapacity * fuelPrice / distance * 0.1);
    }

    
    public void startEngine() {
    	// prints how the vehicle starts
    	//System.out.println("Start Mechanism: KEYSTART"); ALTERNATIVE OPTION
        System.out.println("startType=" + startType);
    }
}
