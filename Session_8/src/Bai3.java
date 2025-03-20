import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;
        while (true) {
            System.out.print("Nhập địa chỉ email của bạn: ");
            email = sc.nextLine();
            if(email.matches("^[a-zA-Z0-9._]+@[]a-zA-Z0-9.]+\\.[a-zA-Z]{2,4}$")) {
                break;
            }
            System.out.println("Email không hợp lệ, vui lòng nhap lai!");
            System.out.println("--------------------------------------");
        }

        String password;
        while (true) {
            System.out.print("Nhập mật khẩu của bạn: ");
            password = sc.nextLine();
            if (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*<>,./|]).{8,}$")) {
                break;
            }
            System.out.println("Mật khẩu không hợp lệ, vui lòng nhap lai!");
            System.out.println("--------------------------------------");
        }

        System.out.println("Email và mật khẩu hợp lệ!");

    }
}
