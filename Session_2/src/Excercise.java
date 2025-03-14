import java.sql.SQLOutput;
import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        // làm một bài toán tính toán giá trị biểu thức toán học
        // sử dụng Math
        // tính diện tích htron, hthoi, htamgiac, hcn

        Scanner sc = new Scanner(System.in);

        // HÌNH TRÒN
        System.out.println("Tính diện tích và chu vi hình tròn:");
        final float PI = 3.14f;
        System.out.print("Nhập bán kính hình tròn: ");
        float r = sc.nextFloat();
        System.out.printf("Diện tích hình tròn = %f | Chu vi hình tròn = %f\n",
                Math.pow(r, 2) * PI, r * 2 * PI
        );

        System.out.println("----------------------------------------------");

        // HÌNH THOI
        System.out.println("Tính diện tích và chu vi hình thoi:");
        System.out.print("Nhập độ dài 1 cạnh hình thoi: ");
        float canh_hthoi = sc.nextFloat();
        System.out.print("Nhập góc giữa 2 cạnh: ");
        float angle = sc.nextFloat();
        // chuyển từ góc sang radian
        float angleRad = (float) Math.toRadians(angle);
        float tichHaiDuongCheo = (float) (4 * Math.pow(canh_hthoi, 2) * Math.sin(angleRad));
        System.out.printf("Diện tích hình thoi = %f | Chu vi hình thoi = %f\n",
                tichHaiDuongCheo / 2, canh_hthoi * 4
        );

        System.out.println("----------------------------------------------");


        // HÌNH TAM GIÁC
        System.out.println("Tính diện tích và chu vi hình tam giác");
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ 2: ");
        double b = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ 3: ");
        double c = sc.nextDouble();

        // dựa vào công thức Heron
        double p = (a+b+c) / 2;
        double dienTich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        double chuVi = 2 * p;
        System.out.printf("Diện tích hình tam giác = %f | Chu vi hình tam giác = %f\n",
               dienTich, chuVi
        );

        System.out.println("----------------------------------------------");


        // HÌNH CHỮ NHẬT
        System.out.println("Tính diện tích và chu vi hình chữ nhật");
        System.out.print("Nhập chiều dài hcn: ");
        float chieuDai = sc.nextFloat();
        System.out.print("Nhập chiều rộng hcn: ");
        float chieuRong = sc.nextFloat();
        System.out.printf("Diện tích hình chữ nhật = %f | Chu vi hình chữ nhật = %f\n",
                chieuDai * chieuRong, (chieuDai + chieuRong) * 2
        );
    }
}
