package bai9;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Trân", "tran123", 10000.01);
        Manager mana = new Manager("Hùng", "hung456", 2000000.01, 1010101);
        Developer dev = new Developer("Phước", "phuoc789", 1029495.95, "JS");

        System.out.println(emp.getSalary());
        System.out.println(mana.getSalary());
        System.out.println(dev.getSalary());

        System.out.println(emp);
        System.out.println(mana);
        System.out.println(dev);

        emp.increaseSalary(30000);
        System.out.println(emp);
    }
}
