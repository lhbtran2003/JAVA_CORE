import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        String fullname;
        float score1, score2, score3, diemtb;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        fullname = sc.nextLine(); // nhập chuoi

        System.out.print("Enter your score1: ");
        score1 = sc.nextFloat();

        System.out.print("Enter your score2: ");
        score2 = sc.nextFloat();

        System.out.print("Enter your score3: ");
        score3 = sc.nextFloat();

        diemtb = (score1 + score2 + score3) / 3;


        System.out.printf("%sHien thi thong tin sinh vien%s\n", "-".repeat(10), "-".repeat(10));
        System.out.println(fullname);
        System.out.printf("Diem mon 1: %f | Diem mon 2: %f | Diem mon 3: %f\n", score1,score2,score3);
        System.out.println("Diem trung binh"+  diemtb);
        System.out.print("Danh gia: " + (diemtb > 5 ? "Len lop" : "Khong len lop"));
    }
}
