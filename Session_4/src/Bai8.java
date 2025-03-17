import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int [] arr = {10, 100, 1000, 10000};

        for(int n : arr) {
            printAmstrong(n);
            System.out.println();
        }

    }

    private static void printAmstrong(int n) {
        for (int i= 1; i < n; i++) {
            int count = Integer.valueOf(i).toString().length();
            int sum = 0;
            int temp = i;
            while (temp!= 0) {
                int unit = temp% 10;
                sum += (int) Math.pow(unit, count);
                temp= temp/ 10;
            }
            if (sum == i) {
                System.out.printf("%d ", i);
            }
        }
    }
}
