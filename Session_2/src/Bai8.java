import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sv");
        String masv = sc.nextLine();
        System.out.print("Nhap ho ten sv");
        String hoTen = sc.nextLine();
        System.out.print("Nhap sdt sv");
        String sdt = sc.nextLine();
        System.out.print("Nhap ngay sinh sv (dd/mm/yyyy)");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh sv (1: Nam, 0: Nu)");
        boolean sex = sc.next().equals("1");

        System.out.println("------Nhap diem cua sv------");
        System.out.println("Nhap diem toan:");
        float diemToan = sc.nextFloat();
        System.out.println("Nhap diem ly:");
        float diemLy = sc.nextFloat();
        System.out.println("Nhap diem sinh:");
        float diemSinh = sc.nextFloat();
        System.out.println("Nhap diem hoa:");
        float diemHoa = sc.nextFloat();
        System.out.println("Nhap diem ngoai ngu:");
        float diemNgoaingu = sc.nextFloat();

        // hiển thị thông tin sv
        System.out.println("------HIEN THI THONG TIN SV------");
        System.out.printf("Masv: %s | Ten sinh vien: %s | Gioi tinh %s\n", masv, hoTen, (sex ? "Nam" : "Nu"));
    }
}
