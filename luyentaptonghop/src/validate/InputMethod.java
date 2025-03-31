package validate;

import java.util.Scanner;

public class InputMethod {
    public static final String ERROR_EMPTY_STRING = "Chuỗi ko được để trống";
    public static final String ERROR_INTEGER = "Chuỗi phải là một so nguyên";
    public static final String ERROR_FLOAT = "Chuỗi phải là một so thực";
    public static final String ERROR_STATUS = "Trạng thái phải là 'true' hoặc 'false'";
    // quy định các phương thức nhập xuất cơ ban

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

    public static int inputInt(Scanner sc, String title) {
        System.out.println(title);
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println(ERROR_INTEGER);
                sc.nextLine();
                continue;
            }
            return Integer.parseInt(sc.nextLine());
        }
    }

    public static float inputFloat(Scanner sc, String title) {
        System.out.println(title);
        while (true) {
            if (!sc.hasNextFloat()) {
                System.out.println(ERROR_INTEGER);
                sc.nextLine();
                continue;
            }
            return Float.parseFloat(sc.nextLine());
        }
    }

    public static boolean inputBoolean(Scanner sc, String title) {
        while (true) {
            System.out.println(title + ": yes/no");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                return input.equalsIgnoreCase("yes");
            }
            System.out.println(ERROR_STATUS);
        }
    }


}
