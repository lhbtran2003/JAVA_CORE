package bai6;

public class FullTimeEmployee extends Employee {
    double bonus;

    public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
        super(name, age, basicSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Bonus: " + bonus);
    }
}
