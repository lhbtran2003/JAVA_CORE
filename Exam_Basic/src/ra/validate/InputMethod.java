package ra.validate;

import java.util.Scanner;

public class InputMethod {
    public static final String ERROR_EMPTY_STRING = "Chuỗi ko được để trống";
    public static final String ERROR_FLOAT = "Gía trị nhập vào không phải là số thực dương";
    public static final String ERROR_BOOLEAN_STATUS = "Lựa chọn không hợp leej, vui lòng nhập lại";

    // đảm bảo chuỗi nhập vào ko phải chuỗi rỗng
    public static String inputString(Scanner sc, String title) {
        while (true) {
            System.out.println(title);
            String input = sc.nextLine();
            if (input.isBlank()) {
                System.out.println(ERROR_EMPTY_STRING);
            } else {
                return input;
            }
        }
    }

    // phải là số thực
    public static float inputFloat(Scanner sc, String title) {
        System.out.println(title);
        do {
            if (!sc.hasNextFloat()) {
                System.out.println(ERROR_FLOAT);
                sc.nextLine();
                continue;
            }
            return Float.parseFloat(sc.nextLine());
        } while (true);
    }



    public static boolean inputBoolean(Scanner scanner, String title) {
        System.out.println(title);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("true") || input.equals("false")) {
                return input.equals("true");
            }
            System.err.println(ERROR_BOOLEAN_STATUS);
        }
    }
}
