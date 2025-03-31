package bai1;

public class Bai1 {
    public static void main(String[] args) {
        int numberA = 5;
        int numberB = 10;
        int result = calculateResult(numberA, numberB);
        System.out.println("Result: " + result);
    }

    public static int calculateResult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber + (firstNumber + secondNumber);
    }
}
