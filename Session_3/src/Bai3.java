import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập điểm trung bình:");
       float diemTb = new Scanner(System.in).nextFloat();

       if (diemTb >= 8.5) System.out.println("Gioi");
       else if (diemTb >= 6.5 && diemTb < 8.5) System.out.println("Khá");
       else if (diemTb >= 5 && diemTb < 6.5) System.out.println("Trung bình");
       else if (diemTb < 5 ) System.out.println("Yếu");

    }
}
