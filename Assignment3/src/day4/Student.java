package day4;

import java.util.Arrays;

public class Student {
    private String name;
    private String address1;
    private String address2;
    private int[] marks;
    private static int studentCount = 0;
    private static int allTotalMarks;

    public Student(String name, String address1, int[] marks) {
        this.name = name;
        this.address1 = address1;
        this.marks = marks;
        studentCount++;
        allTotalMarks += this.totalMark();
    }

    public Student(String name, String address1, String address2, int[] marks) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.marks = marks;
        studentCount++;
    }

    private int totalMark() {
        int total = 0;
        for (int mark : this.marks) {
            total += mark;
        }
        return total;
    }

    public double calculateGPA() {
        int total = this.totalMark();
        return total / 6.0;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public int[] getMarks() {
        return this.marks;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + Arrays.toString(this.marks));
        System.out.println("GPA: " + this.calculateGPA());
        System.out.println("Address1: " + this.address1);
        if (this.address2 == null) {
            System.out.println("Address2: Not provided");
        } else {
            System.out.println("Address2: " + this.address2);
        }
    }
}