package test;

public class Main {

	public static void main(String[] args) {
		System.out.println("testing that main works");
		VehicleManager vm = VehicleManager.getInstance();
		boolean success = vm.initializeStock();

		if(success) {
			System.out.println("Vehicle stock initialized successfully");
			vm.displayAllCarInformation();
			vm.displayAllTruckInformation();
			vm.displayAllSUVInformation();
			vm.displayAllMotorBikeInformation();
			vm.displayVehicleInformation(null);
			vm.displayAllVehicleInformation();
			vm.removeVehicle(null);
			vm.addVehicle(null);
			vm.saveVehicleList();
			vm.getNumberOfVehiclesByType(null);
			


			

		} else {
			System.out.println("Vehicle stock initialization failed");
		}

	}

}
