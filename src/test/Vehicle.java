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
 // Copy Constructor
    public Vehicle(Vehicle otherVehicle) {
        this.brand = otherVehicle.brand;
        this.make = otherVehicle.make;
        this.modelYear = otherVehicle.modelYear;
        this.price = otherVehicle.price;
        this.color = otherVehicle.color;
        this.fuelType = otherVehicle.fuelType;
        this.mileage = otherVehicle.mileage;
        this.mass = otherVehicle.mass;
        this.cylinders = otherVehicle.cylinders;
        this.gasTankCapacity = otherVehicle.gasTankCapacity;
        this.startType = otherVehicle.startType;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public long getModelYear() {
        return modelYear;
    }

    public void setModelYear(long modelYear) {
        this.modelYear = modelYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public VehicleColor getColor() {
        return color;
    }

    public void setColor(VehicleColor color) {
        this.color = color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getGasTankCapacity() {
        return gasTankCapacity;
    }

    public void setGasTankCapacity(double gasTankCapacity) {
        this.gasTankCapacity = gasTankCapacity;
    }

    public StartMechanism getStartType() {
        return startType;
    }

    public void setStartType(StartMechanism startType) {
        this.startType = startType;
    }
    
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", make='" + make + '\'' +
                ", modelYear=" + modelYear +
                ", price=" + price +
                ", color=" + color +
                ", fuelType=" + fuelType +
                ", mileage=" + mileage +
                ", mass=" + mass +
                ", cylinders=" + cylinders +
                ", gasTankCapacity=" + gasTankCapacity +
                ", startType=" + startType +
                '}';
    }
 // Abstract method to calculate maintenance cost for a specific vehicle
    public abstract double calculateMaintenanceCost(double distance);

    // Abstract method to calculate the engine efficiency
    public abstract double calculateFuelEfficiency(double distance, double fuelPrice);

    // Abstract method to print how the vehicle starts
    public abstract void startEngine();
}
