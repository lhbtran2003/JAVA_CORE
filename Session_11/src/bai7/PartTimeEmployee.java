package bai7;

public class PartTimeEmployee extends Employee {
    double workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, double workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * paymentPerHour;
    }
}
