package day3;

public class Animal {
    String name;
    int age;
    String species;
    static int animalCount;

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Species: "+species);
        System.out.println("-----------------------");
    }
}
