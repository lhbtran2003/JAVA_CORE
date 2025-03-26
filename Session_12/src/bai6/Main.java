package bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> allEmp = new ArrayList<>();
        allEmp.add(new FullTimeEmployee("A", 20, 10000, 5500));
        allEmp.add(new PartTimeEmployee("B", 20, 10000, 5));
        allEmp.add(new Intern("C", 22, 3000, "parttime", 3));

        for (Employee emp : allEmp) {
            System.out.println( emp.calculateSalary());
            emp.showInfo();
        }
    }
}
