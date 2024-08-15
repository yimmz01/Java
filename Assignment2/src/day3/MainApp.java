package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Animal> animals = new ArrayList<>();
    public static void inputData() throws IOException {
        System.out.print("Enter Animal Name: ");
        String name = br.readLine();
        System.out.println("Enter Animal Age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Animal Species: ");
        String species = br.readLine();

        Animal animal = new Animal();
        animal.name = name;
        animal.age =  age;
        animal.species = species;

        animals.add(animal);
        Animal.animalCount++;
    }

    public static void main(String[] args) throws IOException {
        String flag;
        do{
            inputData();
            System.out.println("Do you want to enter another animal? yes/no: ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
        System.out.println("Animal Information");
        for(int i = 0;i < Animal.animalCount;i++){
            System.out.println("Animals: "+(i+1));
            animals.get(i).display();
        }
        System.out.println("Animal Count: " + Animal.animalCount);
    }
}
