package test;

public class Car extends Vehicle{

	public Car(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType,
			double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
		// TODO Auto-generated constructor stub
	}
	
	public double calculateMaintenanceCost(double distance) {
        // Implementation specific to calculating maintenance cost for a car
        return (distance * mass * (2024 - modelYear)* cylinders * 0.0005);
    }


    public double calculateFuelEfficiency(double distance, double fuelPrice) {
        // Implementation specific to calculating fuel efficiency for a car
        return (cylinders * gasTankCapacity * fuelPrice / distance * 0.003);
    }

    
    public void startEngine() {
    	// prints how the vehicle starts
        System.out.println("startType=" + startType);
    }

}
