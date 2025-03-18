import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào email");
        String email = sc.nextLine();


        if(email.contains(" ")) {
            email =  email.replaceAll("\\s+", "");
        }
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z.]+(\\.[a-zA-Z]{2,6})+$";

        boolean isMatches = Pattern.matches(regex, email);
        if(isMatches) {
            System.out.println("Hợp lệ");
        } else  {
            System.out.println("ko Hợp lệ");

        }

    }
}
