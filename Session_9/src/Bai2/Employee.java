package Bai2;

public class Employee {
    //Thuộc tính của lớp
    int id;
    String name;
    String department;
    int salary;

    //Constructor
    Employee( int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Phương thức hiển thị thông tin(displayInfo())
    public void displayInfo() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee department: " + this.department);
    }

    //Getter và Setter
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Phương thức tăng lương(increaseSalary(double percentage))
    public void increaseSalary(double percentage) {
        this.salary += (int) (this.salary * (percentage/100));
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Tran", "Dev", 2000);
        emp.displayInfo();
        emp.increaseSalary(2);
        System.out.printf("%s", emp.salary);
    }
}
