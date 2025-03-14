import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên bất kì:");
        int n = sc.nextInt();
        if (n < 0) {
            n = Math.abs(n);
        }
        int total = 0;
        while (n != 0) {
            int unit = n % 10;
            total += unit;
            n /= 10;
        }
        System.out.printf("Tổng cộng : %s",total);


    }
}
