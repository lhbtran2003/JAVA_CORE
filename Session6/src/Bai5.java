import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kì ");
        String str = sc.nextLine();
        // tách chuỗi thành các từ
        // Một "từ" được định nghĩa là một chuỗi liên tiếp các ký tự không phải khoảng trắng.
        String [] arr = str.split(" ");

        int count = 0;

        System.out.println("Từ chứa kí tự đặc biệt trong chuỗi là");
        for (int i = 0; i < arr.length; i++) {
            boolean isSpecialChar = arr[i].matches(".*[!@#$%^&*<>?:;'].*");
            if (isSpecialChar) {
                System.out.printf("%s\n", arr[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có kí tự đặc biệt");
        }
        System.out.printf("số lượng các từ trong chuỗi là: %d", count);
    }
}
