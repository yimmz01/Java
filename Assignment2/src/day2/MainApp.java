package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentArray = new Student[100];

    public static void getInfo() throws IOException {
        System.out.print("Enter Student Name: ");
        String name = br.readLine();
        System.out.print("Enter Student Age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("Enter Student Address: ");
        String address = br.readLine();

        Student stu = new Student();
        stu.name = name;
        stu.age = age;
        stu.address = address;

        studentArray[Student.studentCount] = stu;
        Student.studentCount++;
    }
    public static void main(String[] args) throws IOException {
        String flag = "";
        do{
            getInfo();
            System.out.println("Do you want to add new student? yes/no : ");
            flag = br.readLine();
        }while(flag.equalsIgnoreCase("yes"));
        System.out.println("Student Information");
        for(int i = 0;i < Student.studentCount;i++){
            studentArray[i].display();
        }
        System.out.println("StudentCount: "+Student.studentCount);
    }
}
