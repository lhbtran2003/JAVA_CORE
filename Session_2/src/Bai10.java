import java.math.BigInteger;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen lon thu 1: ");
        String x = sc.nextLine();
        System.out.print("Nhap so nguyen lon thu 2: ");
        String y = sc.nextLine();

        // chuyển đổi thành đối tượng BigInteger
        BigInteger A = new BigInteger(x);
        BigInteger B = new BigInteger(y);

        // phép cộng
        BigInteger C = A.add(B);

        // phép trừ
        BigInteger D = A.subtract(B);

        // phép nhân
        BigInteger E = A.multiply(B);

        // phép chia
        BigInteger F = C.divide(B);

        // phép chia lấy dư
        BigInteger G = D.mod(B);

        // phép lũy thừa
        BigInteger H = A.pow(10);

        // in kết quả ra màn hình
        System.out.println("x + y = " + C);
        System.out.println("x - y = " + D);
        System.out.println("x * y = " + E);
        System.out.println("x / y = " + F);
        System.out.println("x % y = " + G);
        System.out.println("x^10 = " + H);

    }
}
