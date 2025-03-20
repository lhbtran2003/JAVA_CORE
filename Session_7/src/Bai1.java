import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất");
        String str1 = sc.nextLine();

        System.out.println("Nhập chuỗi thứ nhất");
        String str2 = sc.nextLine();

        System.out.println("Nhập chuỗi thứ nhất");
        String str3 = sc.nextLine();

        StringBuilder strBuilder = new StringBuilder().append(str1).append(" ").append(str2).append(" ").append(str3);
//        strBuilder = strBuilder.append(str1).append(" ").append(str2).append(" ").append(str3);
        String str = strBuilder.toString().toUpperCase();
        System.out.println(str);

    }
}
