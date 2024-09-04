package Service;


import Model.Car;
import Model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{

    @Override
    public void registerProcess() throws IOException{
        System.out.print("Enter number of car doors: ");
        int doors = Integer.parseInt(br.readLine());
        Vehicle car = new Car(this.getVehicle(),doors);
        this.setVehicle(car);

    }
}
