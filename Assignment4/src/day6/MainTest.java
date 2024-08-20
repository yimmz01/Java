package day6;

public class MainTest {
    public static void main(String[] args) {
        Employee emp1 = new PartTimeEmployee("Mg Mg",3423,0.0,30,1000);//upcasting
        Employee emp2 = new FullTimeEmployee("Ni Ni",2545,5000,0.0,500);
        Employee emp3 = new ContractEmployee("Zaw Zaw",4546,0.0,6,60000);
        Employee emp4 = new FullTimeEmployee("Mie Mie",7788,3000,1000,0.0);
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}
