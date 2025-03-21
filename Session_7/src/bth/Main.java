package bth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] studentIdArray = new String[10];
        String[] studentNameArray = new String[10];
        String[] studentDobArray = new String[10];
        boolean[] studentSexArray = new boolean[10];
        int size = 0; // kích thươớc thực tế

        // dữ liệu mẫu
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
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị danh sách sinh viên
                    showListStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    break;
                case 2:
                    // thêm mới sv
                    boolean isAdd = addStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    if (isAdd) {
                        size++;
                    }
                    break;
                case 3:
                    // chỉnh sửa thông tin sinh viên
                    editStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    break;
                case 4:
                    // xóa sv
                    boolean isDelete = deleteStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);
                    if (isDelete) {
                        size--;
                    }
                    break;
                case 5:
                    // tìm kiếm theo tên
                    searchStudentByName(studentNameArray);
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc");
                    break;
            }
        }
    }

    //function hiển thị danh sách sv
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
        // nếu chuỗi dài hơn 20 kí tự thìchiri lấy 17 kí tu kèm theo 3 dấu "."
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

    // hàm kiểm tra : 1. mã có đúng định dạng ko, 2. mã đã tồn tại chưa
    public static boolean validateId(String id, String[] studentIdArray) {
        if (id.matches("SV\\d{3}")) {
            for (int i = 0; i < studentIdArray.length; i++) {
                // nếu đã tồn tại thì từ chối
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

    // function tìm kiếm sv theo tên
    public static void searchStudentByName(String[] studentNameArray) {
        System.out.println("Nhập tên bạn cần tìm");
        String name = new Scanner(System.in).nextLine();
        boolean findName = false; // xác định có tìm thấy tên phù hợp ko

        for (int i = 0; i < studentNameArray.length; i++) {
            if (studentNameArray[i] != null) {
                String[] arr = studentNameArray[i].split(" ");

                // kiểm tra bằng tên, ko lấy họ và tên đệm
                String ten = arr[arr.length - 1];

                if (name.equals(ten)) {
                    System.out.printf("- %s\n", name);
                    findName = true;
                }
            }
        }

        if (findName) {
            System.out.println("Done");
        } else {
            System.out.printf("Không tìm thấy tên %s trong danh sách", name);
        }
    }

    // function chỉnh sửa thông tin sv
    public static void editStudent(String[] studentIdArray, String[] studentNameArray, String[] studentDobArray, boolean[] studentSexArray, int size) {
        showListStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thứ tự của học sinh muốn sửa thông tin: ");
        byte index = Byte.parseByte(sc.nextLine());

        while (true) {
            System.out.println("-------------------------");
            System.out.println("1. Id");
            System.out.println("2. Họ tên");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("5. Thoát");
            System.out.println("-------------------------");

            System.out.println("Nhập mục bạn muốn sửa");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập id mới: ");
                        String temp = sc.nextLine();
                        if (validateId(temp, studentIdArray)) {
                            studentIdArray[index - 1] = temp;
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
                case 5:
                    break;
            }
            break;
        }
    }

    // function xóa sv
    public static boolean deleteStudent(String[] studentIdArray, String[] studentNameArray, String[] studentDobArray, boolean[] studentSexArray, int size) {
        if (size == 0) {
            System.out.println("Danh sách trông");
            return false;
        }
        showListStudent(studentIdArray, studentNameArray, studentDobArray, studentSexArray, size);

        System.out.print("Chọn thứ tự học sinh muốn xóa: ");
        byte index = Byte.parseByte(new Scanner(System.in).nextLine());

        for (int i = index - 1; i < size; i++) {
            studentIdArray[i] = studentIdArray[i + 1];
            studentNameArray[i] = studentNameArray[i + 1];
            studentDobArray[i] = studentDobArray[i + 1];
            studentSexArray[i] = studentSexArray[i + 1];
        }
        System.out.println("Đã xóa xong.");
        return true;
    }
}
