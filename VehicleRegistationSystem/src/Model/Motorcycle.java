package Model;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(Vehicle vehicle, boolean hasSideCar) {
        super(vehicle);
        this.hasSideCar = hasSideCar;
    }
    @Override
    public void displayInfo(){
        System.out.println("***Motorcycle Info***");
        super.displayInfo();
        if(this.hasSideCar){
            System.out.println("The motorcycle has Side Car");
        }
        else{
            System.out.println("The motorcycle has no Side Car");
        }
    }
}
