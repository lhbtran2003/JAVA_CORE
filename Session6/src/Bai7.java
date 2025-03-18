public class Bai7 {
    public static void main(String[] args) {
        String[] testEmails = {
                "john.doe@gmail.com",
                "invalid-email@",
                "user_123@example.org",
                "hello.world@domain.com",
                "wrong.email@domain"
        };

        for (String email : testEmails) {
            checkEmail(email);
        }
    }

    public static void checkEmail(String email) {
        // Kiểm tra email có hơp lệ hay ko
        String regex = "^[a-zA-Z0-9._]+@[]a-zA-Z0-9.]+\\.[a-zA-Z]{2,4}$";
        if (email.matches(regex)) {
            // Phân tách email thành hai phần: tên người dùng và tên miền.
            String[] arr = email.split("@");

            // In ra các thông tin này theo định dạng:
            // Tên người dùng: <tên người dùng>, Tên miền: <tên miền>.
            System.out.printf("Tên người dùng: %s, Tên miền: %s\n", arr[0], arr[1]);
        } else {
            System.out.println("Email ko hợp lệ!");
        }

    }
}
