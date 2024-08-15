package day2;

public class Student {
    String name;
    int age;
    String address;
    static int studentCount = 0;


    public void display(){
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Address: "+address);
        System.out.println("-----------------------");
    }

}
