package day6;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name,int employeeId,double salary,int hoursWorked,double hourlyRate) {
        super(name,employeeId,salary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return this.hourlyRate * this.hoursWorked;
    }
    @Override
    public void display(){
        System.out.println("***Part Time Employee***");
        super.display();
    }
}
