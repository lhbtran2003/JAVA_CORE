import java.util.Random;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        // tạo chuooix ngẫu nhiên
        System.out.println("Nhập độ dài chuỗi mong muốn:");
        int n = new Scanner(System.in).nextInt();

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        System.out.printf("%s\n", sb.toString());

    }
}
