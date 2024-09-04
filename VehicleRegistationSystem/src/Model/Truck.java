package Model;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String brand,String model,double payloadCapacity) {
        super(brand,model);
        this.payloadCapacity = payloadCapacity;
    }

    public Truck(Vehicle vehicle,int payloadCapacity) {
        super(vehicle);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("***Truck Info***");
        super.displayInfo();
        System.out.println("Payload Capacity: "+this.payloadCapacity);
    }
}
