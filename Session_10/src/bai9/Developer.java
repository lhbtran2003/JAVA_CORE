package bai9;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f, %s", getName(), getId(), getSalary(), programmingLanguage);
    }
}
