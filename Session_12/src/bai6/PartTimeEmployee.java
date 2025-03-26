package bai6;

public class PartTimeEmployee extends Employee{
    double hour;

    public PartTimeEmployee(String name, int age, double basicSalary, double hour) {
        super(name, age, basicSalary);
        this.hour = hour;
    }

    @Override
    double calculateSalary() {
        return ((basicSalary / 22)/8) * hour;
    }

    @Override
    void showInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ calculateSalary());
    }
}
