package test;

public class SUV extends Vehicle{

	public SUV(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		
	}
	public double calculateMaintenanceCost(double distance) {
        // Implementation specific to calculating maintenance cost for an SUV
        return (distance * mass * (2024 - modelYear)* cylinders * 0.001);
    }


    public double calculateFuelEfficiency(double distance, double fuelPrice) {
        // Implementation specific to calculating fuel efficiency for an SUV
        return (cylinders * gasTankCapacity * fuelPrice / distance * 0.05);
    }

    
    public void startEngine() {
    	// prints how the vehicle starts
    	//System.out.println("Start Mechanism: PUSHSTART"); ALTERNATIVE OPTION
        System.out.println("startType=" + startType);
    }
}
