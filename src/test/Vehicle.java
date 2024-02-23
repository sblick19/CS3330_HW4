package test;

public abstract class Vehicle {
	
	enum VehicleColor{
		RED, BLUE, GREEN, WHITE, BLACK
	}
	
	enum FuelType{
		GASOLINE, DIESEL, ELECTRIC, HYBRID
	}
	
	enum StartMechanism{
		KEY, PUSH_BUTTON, REMOTE
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
}
