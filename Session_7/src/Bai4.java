import java.util.Scanner;

public class Bai4 {
    // kiểm tra chuỗi đối xứng

    public static void main(String[] args) {
        System.out.println("Nhập một chuỗi bất kì");
        String str = new Scanner(System.in).nextLine();
        str = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        if (str.equals(stringBuilder.toString())) { // có thể sử dụng contentEquals để ko phải dùng đến toString()
            System.out.println("Chuỗi đối Xứng");
        } else {
            System.out.println("Chuỗi ko đối xứng");
        }

    }
}
