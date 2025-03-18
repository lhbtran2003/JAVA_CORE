import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = sc.nextLine();
        System.out.println("Nhập vào từ cần tìm");
        String str2 = sc.nextLine();
        boolean isExit = str.contains(str2);
        if(isExit) {
            System.out.printf("Từ %s có tồn tại trong chuỗi tại vị trí thứ %d", str2, str.indexOf(str2));
        } else {
            System.out.println("Không tồn tại");
        }
    }
}
