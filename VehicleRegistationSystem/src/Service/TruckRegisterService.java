package Service;

import Model.Truck;
import Model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{

    @Override
    public void registerProcess() throws IOException {
        System.out.print("Enter payloadCapacity of Truck : ");
        int payloadCapacity = Integer.parseInt(br.readLine());
        Vehicle truck = new Truck(this.getVehicle(), payloadCapacity);
        this.setVehicle(truck);
    }

}
