package Service;

import Model.Motorcycle;
import Model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Does motorcycle hve side car? (yes/no): ");
        String answer = br.readLine();
        boolean hasSideCar;
        if (answer.equalsIgnoreCase("yes")) {
            hasSideCar = true;
        }else{
            hasSideCar = false;
        }
        Vehicle cycle = new Motorcycle(this.getVehicle(), hasSideCar);
        this.setVehicle(cycle);
    }
}
