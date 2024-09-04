package Dao;

import Model.Vehicle;

public class VehicleDao {

    private static Vehicle[] vehicleDB = new Vehicle[Vehicle.MaxVehicleCount];

    public void create(Vehicle vehicle){
        vehicleDB[Vehicle.getCount()-1] = vehicle;
    }
    public void delete(Vehicle vehicle){

    }
    public void update(Vehicle vehicle){

    }
    public Vehicle[] getAll(){
        return vehicleDB;
    }
    public Vehicle findById(int id){
        for(int i = 0;i < Vehicle.getCount();i++){
            if( vehicleDB[i].getId() == id){
                return vehicleDB[i];
            }
        }
        return null;
    }
}
