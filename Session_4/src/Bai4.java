import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n = -1;
        int sum = 0;

        while (n != 0) {
            System.out.print("Nhập một số nguyên: ");
            n = new Scanner(System.in).nextInt();
            sum += n;
        }
        System.out.printf("Tổng của các số đã nhập trước đó là %d\n", sum);


    }
}
