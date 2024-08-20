package day6;

public class ContractEmployee extends Employee {
    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name,int employeeId,double salary,int contractDuration,double contractAmount) {
        super(name, employeeId, salary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;

    }
    @Override
    public double calculateSalary() {
        return this.contractAmount / this.contractDuration;
    }
    @Override
    public void display(){
        System.out.println("***ContractEmployee***");
        super.display();
    }
}
