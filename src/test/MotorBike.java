package test;

public class MotorBike extends Vehicle{

	public MotorBike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		
	}
	public double calculateMaintenanceCost(double distance) {
        // Implementation specific to calculating maintenance cost for a motor bike
        return (distance * mass * (2024 - modelYear)* cylinders * 0.0002);
    }


    public double calculateFuelEfficiency(double distance, double fuelPrice) {
        // Implementation specific to calculating fuel efficiency for a motor bike
        return (cylinders * gasTankCapacity * fuelPrice / distance * 0.001);
    }

    
    public void startEngine() {
    	// prints how the vehicle starts
    	//System.out.println("Start Mechanism: KICKSTART"); ALTERNATIVE OPTION
        System.out.println("startType=" + startType);
    }
}
