import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        float width, height, area, circumference;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai hcn: ");
        width = sc.nextFloat();
        System.out.println("Nhap chieu rong hcn: ");

        height = sc.nextFloat();
        System.out.printf("Dien tich hcn = %.2f", width * height);
        System.out.printf("Chu vi hcn = %.2f", (width + height)*2);



    }
}