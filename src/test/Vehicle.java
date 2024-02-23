package test;

public abstract class Vehicle {
	
	enum VehicleColor{
		BLACK, RED, BLUE, BROWN, WHITE, YELLOW, GRAY
	}
	
	enum FuelType{
		GASOLINE, DIESEL, ELECTRIC, HYBRID
	}
	
	enum StartMechanism{
		KEYSTART, PUSHSTART, KICKSTART
	}
	
	protected String brand;
    protected String make;
    protected long modelYear;
    protected double price;
    protected VehicleColor color;
    protected FuelType fuelType;
    protected double mileage;
    protected double mass;
    protected int cylinders;
    protected double gasTankCapacity;
    protected StartMechanism startType;
    
    //constructor
    public Vehicle(String brand, String make, long modelYear, double price, VehicleColor color,
            FuelType fuelType, double mileage, double mass, int cylinders,
            double gasTankCapacity, StartMechanism startType) {
    	this.brand = brand;
    	this.make = make;
    	this.modelYear = modelYear;
    	this.price = price;
    	this.color = color;
    	this.fuelType = fuelType;
    	this.mileage = mileage;
    	this.mass = mass;
    	this.cylinders = cylinders;
    	this.gasTankCapacity = gasTankCapacity;
    	this.startType = startType;
}
}
