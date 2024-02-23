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
}
