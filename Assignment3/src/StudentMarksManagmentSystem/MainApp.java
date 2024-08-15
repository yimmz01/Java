package StudentMarksManagmentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentArr = new Student[100];

    public static Student getInfo() throws IOException {
        System.out.println("Enter details for a new student:");
        System.out.print("Name: ");
        String name = br.readLine();
        System.out.println("Enter marks for 6 subjects(or less,defaults to 0):");

        int[] marks = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            int subject = Integer.parseInt(br.readLine());
            marks[i] = subject;
        }

        System.out.print("Enter address 1: ");
        String address1 = br.readLine();
        System.out.print("Enter address 2 (or press Enter to skip): ");
        String address2 = br.readLine();

        Student student;
        if (address2.isEmpty()) {
            student = new Student(name, address1, marks);
        } else {
            student = new Student(name, address1, address2, marks);
        }
        return student;
    }

    public static void main(String[] args) throws IOException {
        String flag;
        do {
            Student student = getInfo();
            studentArr[Student.getStudentCount() - 1] = student;
            System.out.print("Do you want to enter another student? (yes/no): ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));
        display();
        MeanMarks();
        highestGPA();
    }

    public static void display() {
        System.out.println("All Students:");
        for (int i = 0; i < Student.getStudentCount(); i++) {
            studentArr[i].display();
        }
    }

    public static void MeanMarks() {
        int[] totalMarks = new int[6];
        for (int i = 0; i < Student.getStudentCount(); i++) {
            Student student = studentArr[i];
            for (int j = 0; j < 6; j++) {
                totalMarks[j] += student.getMarks()[j];
            }
        }
        double[] meanMarks = new double[6];
        for (int i = 0; i < 6; i++) {
            meanMarks[i] = totalMarks[i] / (double) Student.getStudentCount();
        }
        System.out.println("Mean marks: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("subject"+ (i + 1) +": "+meanMarks[i]);
        }
    }
    public static void highestGPA(){
        double max = 0;
        Student maxStudent = null;
        for (int i = 0; i < Student.getStudentCount(); i++) {
            Student student = studentArr[i];
            double gpa = student.calculateGPA();
            if(gpa > max) {
                max = gpa;
                maxStudent = student;
            }
        }
        System.out.println("Student with Highest GPA: "+max);
        if(maxStudent != null) {
            maxStudent.display();
        }else{
            System.out.println("No student with Highest GPA");
        }
    }
}