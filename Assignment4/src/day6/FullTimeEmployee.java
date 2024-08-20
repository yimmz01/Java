package day6;

public class FullTimeEmployee extends Employee{
    private double allowence;
    private double bonous;

    public FullTimeEmployee(String name,int employeeId,double salary,double allowence,double bonous){
        super(name,employeeId,salary);
        this.allowence = allowence;
        this.bonous = bonous;
    }
    @Override
    public double calculateSalary() {
        return this.allowence+this.bonous+ this.getSalary();
    }
    @Override
    public void display() {
        System.out.println("***Full Time Employee***");
        super.display();
    }
}
