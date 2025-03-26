package bai6;

public class Intern extends Employee{
    String type;
    double hour;

    public Intern(String name, int age, double basicSalary, String type, double hour) {
        super(name, age, basicSalary);
        this.type = type;
        this.hour = hour;
    }

    @Override
    double calculateSalary() {
        if (type.equalsIgnoreCase("parttime")) {
            return ((basicSalary / 22)/8) * hour;
        } else {
            return basicSalary;
        }
    }

    @Override
    void showInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ calculateSalary());
    }

}
