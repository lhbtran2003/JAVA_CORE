import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        // tìm các số hoàn hảo nhỏ hơn n
        // số hoàn hảo là một số nguyên dương mà tổng các ước (trừ đó) bằng chính nó
        // vd: 1 + 2 + 4 + 7 + 12 = 28 => 28 là số nguyên dương hoàn hảo

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương");
        int n = sc.nextInt();


        System.out.printf("các số hoàn hảo nhỏ hơn %s là:\n", n);

        for (int i = 1; i < n; i++) {
            int total = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    total += j;
                }
            }
            if (total == i) {
                System.out.print(i + " ");
            }
        }
    }
}
