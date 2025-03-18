import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("Nhập vào môt mật khẩu bất kì: ");
        String str = new Scanner(System.in).nextLine();

        // Ít nhất 8 ký tự.
        // Có ít nhất một chữ cái viết hoa.
        // Có ít nhất một chữ cái viết thường.
        // Có ít nhất một ký tự số.
        // Có ít nhất một ký tự đặc biệt (ví dụ: @, #, $, !, %).
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*<>,./|]).{8,}$";
        boolean isMatch = Pattern.matches(regex, str);

        if (isMatch) {
            System.out.println("Mật khẩu được chấp thuận");
        } else {
            System.out.println("Mật khẩu ko được chấp thuận");
        }
    }
}
