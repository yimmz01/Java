package day6;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    public double calculateSalary() {
        return this.salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void display(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Salary: " + this.salary);
        System.out.println("Actual Salary: " + this.calculateSalary());
        System.out.println();
    }
}
