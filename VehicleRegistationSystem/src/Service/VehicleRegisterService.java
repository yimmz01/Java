package Service;

import Model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {

    private Vehicle vehicle;
    public static Vehicle[] vehicles = new Vehicle[100];

    public BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void create() throws IOException {
        getCommonInfo();
        registerProcess();
        vehicles[Vehicle.getCount()-1] = this.vehicle;
    }
    public void getCommonInfo() throws IOException {
        System.out.print("Enter Vehicle Brand: ");
        String brand = br.readLine();
        System.out.print("Enter Vehicle Model: ");
        String model = br.readLine();

        this.vehicle = new Vehicle(brand, model);
    }
    public void registerProcess() throws IOException {

    }
    public void display(){
        for (int i = 0; i < Vehicle.getCount(); i++) {
            vehicles[i].displayInfo();
        }
        System.out.println();
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
