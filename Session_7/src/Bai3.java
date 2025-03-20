import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        System.out.println("Nhập một chuỗi bất kì");
        String str = new Scanner(System.in).nextLine();
        StringBuilder strBuilder = new StringBuilder(str).reverse();
        System.out.println(strBuilder);

    }
}
