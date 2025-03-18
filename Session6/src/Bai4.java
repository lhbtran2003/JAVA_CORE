import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kì");
        String str = sc.nextLine();
        str = str.replaceAll("[0-9]", "*");
        System.out.println(str);
    }
}
