package App;

import Service.CarRegisterService;
import Service.MotorcycleRegisterService;
import Service.TruckRegisterService;
import Service.VehicleRegisterService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        VehicleRegisterService service = null;
        String flag;
        do{
            System.out.print("Enter Vehicle Type (Car,Truck,Motorcycle): ");
            String type = br.readLine();
            if(type.equalsIgnoreCase("Car")){
                service = new CarRegisterService();
            }else if(type.equalsIgnoreCase("Truck")){
                service = new TruckRegisterService();
            }else if(type.equalsIgnoreCase("Motorcycle")){
                service = new MotorcycleRegisterService();
            }
            service.create();
            System.out.print("Do you want to continue? (Y/N): ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("Y"));

        service.display();
    }
}
