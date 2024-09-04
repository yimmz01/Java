package Model;

public class Vehicle {
    private String brand;
    private String model;
    private static int Count;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        Count++;
    }

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.getBrand();
        this.model = vehicle.getModel();
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public static int getCount() {
        return Count;
    }
}
