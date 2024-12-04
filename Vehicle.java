//Ryan Callahan
public class Vehicle {
    private String manufacturerName;
    private int numberOfCylinders;
    private String ownerName;

    // Default constructor
    public Vehicle() {
        this.manufacturerName = "Unknown";
        this.numberOfCylinders = 1; // must be greater than 0
        this.ownerName = "Unknown";
    }

    // Parameterized constructor
    public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
        if (numberOfCylinders <= 0) throw new IllegalArgumentException("Number of cylinders must be greater than 0");
        this.manufacturerName = manufacturerName;
        this.numberOfCylinders = numberOfCylinders;
        this.ownerName = ownerName;
    }

    // Accessors and Mutators
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders <= 0) throw new IllegalArgumentException("Number of cylinders must be greater than 0");
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfCylinders == vehicle.numberOfCylinders &&
                manufacturerName.equals(vehicle.manufacturerName) &&
                ownerName.equals(vehicle.ownerName);
    }

    @Override
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName +
                "\nNumber of Cylinders: " + numberOfCylinders +
                "\nOwner's Name: " + ownerName;
    }
}
