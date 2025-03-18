package Baithuchanhtrenlop;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        final int MAX_STUDENT = 100;
        int size = 0;
        String[] students = new String[MAX_STUDENT];
        Scanner sc = new Scanner(System.in);

        students[0] = "Tran";
        students[1] = "Thao";
        students[2] = "Panh";
        students[3] = "Minh";
        size = 4;
        // tạo menu thực hiện các thao tác CRUD cơ bản trên mảng 1 chiều
        // quản lí tên các học sinh trong lớp

        while (true) {
            System.out.println("+--------------------------MENU------------------------+");
            System.out.println("|1. Hiển thị danh sách học sinh                        |");
            System.out.println("|2. Thêm mới học sinh                                  |");
            System.out.println("|3. Chỉnh sửa tên học sinh                             |");
            System.out.println("|4. Xóa học sinh                                       |");
            System.out.println("|5. Thoát                                              |");
            System.out.println("+------------------------------------------------------+");

            System.out.print("Chọn chức năng: ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch (choice) {
                case 1:
                    showListStudent(students,size);
                    break;
                case 2:
                    boolean isAdd = addStudent(students,size);
                    if (isAdd) {
                        size++;
                    }
                    break;
                case 3:
                    editStudent(students,size);
                    break;
                case 4:
                    boolean isDelete = deleteStudent(students,size);
                    if (isDelete) {
                        size--;
                    }
                    break;
                case 5:
                    sc.close();
                    return;
            }
        }
    }

    public static void showListStudent(String[] students, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d. %s\n", i+1, students[i]);
        }
        System.out.println("+------------------------------------------------------+");
    }

    public static boolean addStudent(String[] students, int size) {
        Scanner sc = new Scanner(System.in);
        if (size == students.length) {
            System.out.println("Danh sách học sinh đã đầy.");
            return false;
        }
        System.out.print("Nhập tên sinh vien");
        students[size] = sc.nextLine();
        return true;
    }

    public static void editStudent(String[] students, int size) {
        Scanner sc = new Scanner(System.in);
        showListStudent(students,size);
        System.out.print("Nhập vị trí cần sửa: ");
        int index = Integer.parseInt(sc.nextLine());
        System.out.printf("==> Đang thưc hiện chỉnh sửa trên thông tin học sinh %s\n", students[index-1]);
        System.out.print("Nhập thông tin mới cho học sinh này: ");
        String name = sc.nextLine();
        students[index - 1] = name;
        System.out.println("Chỉnh sửa thông tin học sinh thành công!");
    }

    public static boolean deleteStudent(String[] students, int size) {
        System.out.println("Chọn thứ tự của học sinh muốn xóa:");
        showListStudent(students,size);
        int index = Integer.parseInt(new Scanner(System.in).nextLine());

        for (int i = index - 1; i < students.length; i++) {
            students[i] = students[i+1];
        }
        System.out.println("Xóa học sinh thành công!");
        return true;
    }
}
