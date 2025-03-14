import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhập số thứ nhất: ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.print("Nhập số thứ ba: ");
        int num3 = new Scanner(System.in).nextInt();

       int max = num1;

       if (num2 > max) max = num2;
       if (num3 > max) max = num3;

        System.out.printf("Max = %d", max);
    }
}

