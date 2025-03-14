import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n<2) System.out.printf("%d không phải số nguyên tố\n", n);

        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
              isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Đy là số nguyên tố");
        } else {
            System.out.println("Đây không phải số nguyên tố");
        }
    }
}
