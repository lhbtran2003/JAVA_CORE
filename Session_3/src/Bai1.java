import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        }
        else if (n % 2 == 0) {
            System.out.printf("%d là số chẵn", n);
        }
        else {
            System.out.printf("%d là số lẻ", n);
        }
    }
}
