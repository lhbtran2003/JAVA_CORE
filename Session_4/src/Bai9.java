import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một số");
        int number = new Scanner(System.in).nextInt();
        int temp = number;

        // tính độ dài của biến number
        int length = Integer.valueOf(number).toString().length();

        // đảo vị trí các chữ số bằng cách nhân nó tương ứng vị trí
        int pow = length - 1;
        int reverse = 0;

        while (temp != 0) {
            int mod = temp % 10;
            temp /= 10;
            reverse += mod * (int)Math.pow(10, pow);
            pow --;
        }

        if (reverse == number) {
            System.out.println("YES");
        }
    }
}
