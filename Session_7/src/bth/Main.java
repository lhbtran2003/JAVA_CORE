package bth;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] studentIdArray = new String[10];
        String[] studentNameArray = new String[10];
        String[] studentDobArray = new String[10];
        boolean[] studentSexArray = new boolean[10];
        int size = 0; // kích thươớc thực tế

        studentIdArray[0] = "SV001";
        studentNameArray[0] = "Luong Hoang Bao Tran";
        studentDobArray[0] = "20/03/2005";
        studentSexArray[0] = false;
        size++;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------Student Management--------------");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("0. Thoát");
            System.out.println("----------------------------------------------");
            System.out.println("Nhập lựa chọn ->>>>>");
            System.out.print("Nhập sự lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    showListStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    break;
                case 2:
                    boolean isAdd = addStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                   if (isAdd) {
                       size++;
                   }
                    break;
                case 3:
                    editStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    break;
                case 4:
                    break;
                case 5:
                    searchStudentByName(studentNameArray);
                    break;
                case 0:
                    break;
            }
        }
    }

    public static void showListStudent(String[] studentIdArray, String[] studentNameArray, String[] studentDobArray, boolean[] studentSexArray, int size) {
        if (size == 0) {
            System.out.println("Danh sách rỗng");
            return;
        }
        System.out.println("----------Danh sách học sinh-----------");
        System.out.printf("  +%s+%s+%s+%s+\n", "-".repeat(7), "-".repeat(20), "-".repeat(12), "-".repeat(5));
        System.out.printf("  |%-7s|%-20s|%-12s|%-5s|\n", "ID", "Tên sinh viên", "Ngày sinh", "Sex");
        System.out.printf("  +%s+%s+%s+%s+\n", "-".repeat(7), "-".repeat(20), "-".repeat(12), "-".repeat(5));
        for (int i = 0; i < size; i++) {
            System.out.printf("%s.|%-7s|%-20s|%-12s|%-5s|\n", i + 1, studentIdArray[i], formatString(studentNameArray[i], 20), studentDobArray[i], studentSexArray[i] ? "Nam" : "Nữ");
            System.out.printf("+%s+%s+%s+%s+\n", "-".repeat(7), "-".repeat(20), "-".repeat(12), "-".repeat(5));
        }
    }

    public static String formatString(String str, int maxLength) {
        if (str.length() > maxLength) {
            return str.substring(0, maxLength - 3).concat("...");
        }
        return str;
    }

    public static boolean addStudent(String[] studentIdArray, String[] studentNameArray, String[] studentDobArray, boolean[] studentSexArray, int size) {
        if (size == studentIdArray.length) {
            return false;
        }
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("Nhập id SV: ");
            id = sc.nextLine();
            if (validateId(id, studentIdArray)) {
                break;
            }
        }
        studentIdArray[size] = id;
        System.out.print("Nhập tên sv: ");
        studentNameArray[size] = sc.nextLine();
        System.out.print("Nhập ngày sinh sv: ");
        studentDobArray[size] = sc.nextLine();
        System.out.print("Nhập giới tính sv (Nam: true, Nữ: false): ");
        studentSexArray[size] = sc.nextBoolean();
        return true;

    }

    public static boolean validateId(String id, String[] studentIdArray) {

        if (id.matches("SV\\d{3}")) {
            for (int i = 0; i < studentIdArray.length; i++) {
                if (id.equals(studentIdArray[i])) {
                    System.out.println("Id đã tồn tại");
                    return false;
                }
            }
            return true;
        } else {
            System.err.println("Mã sinh viên ko đúng định dạng : ex : SV001");
            return false;
        }
    }

    public static void searchStudentByName(String[] studentNameArray) {
        System.out.println("Nhập tên bạn cần tìm");
        String name = new Scanner(System.in).nextLine();
        int count = 0;
        boolean findName = false;
        for (int i = 0; i < studentNameArray.length; i++) {
            String[] arr = studentNameArray[i].split(" ");
            String ten = arr[arr.length - 1];
            if (name.equals(ten)) {
                System.out.printf("%d. %s\n", ++count, name);
                findName = true;
            }
        }

        if (findName) {
            System.out.println("Done");
        } else {
            System.out.printf("Không tìm thấy tên %s trong danh sách", name);
        }
    }

    public static void editStudent(String[] studentIdArray, String[] studentNameArray, String[] studentDobArray, boolean[] studentSexArray, int size) {
        Scanner sc = new Scanner(System.in);
        showListStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
        System.out.print("Nhập thứ tự của học sinh muốn sửa thông tin: ");
        byte index = sc.nextByte();
        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. Id");
            System.out.println("2. Họ tên");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("-------------------------");

            System.out.println("Nhập mục bạn muốn sửa");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập id mới: ");
                        studentIdArray[index - 1] = sc.nextLine();
                        if (validateId(studentIdArray[index - 1], studentIdArray)) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên mới: ");
                    studentNameArray[index - 1] = sc.nextLine();
                    break;
                case 3:
                    System.out.print("Nhập ngày sinh mới: ");
                    studentDobArray[index - 1] = sc.nextLine();
                    break;
                case 4:
                    System.out.print("Nhập giới tính mới (Nam: true, Nữ: false): ");
                    studentNameArray[index - 1] = sc.nextLine();
                    break;
            }
        }
    }
}
