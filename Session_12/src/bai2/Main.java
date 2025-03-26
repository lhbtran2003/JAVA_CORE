package bai2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,2,3);

        System.out.println( calculator.add(calculator.a,calculator.b));
        System.out.println( calculator.add(calculator.a,calculator.b, calculator.c));
    }
}
