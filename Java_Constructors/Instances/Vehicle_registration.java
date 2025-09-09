package Instance;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType +
                           ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class Vehicle_registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Priya", "Bike");

        // Display initial details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee (applies to all vehicles)
        Vehicle.updateRegistrationFee(800.0);

        System.out.println("\nAfter updating registration fee:\n");

        // Display details again
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

	}

}
