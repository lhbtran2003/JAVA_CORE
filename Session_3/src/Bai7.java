import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap do dai canh thu nhat: ");
        float canh_1 = sc.nextFloat();
        System.out.print("Nhap do dai canh thu hai: ");
        float canh_2 = sc.nextFloat();
        System.out.print("Nhap do dai canh thu ba: ");
        float canh_3 = sc.nextFloat();

        if (canh_1 + canh_2 > canh_3 && canh_2 + canh_3 > canh_1 && canh_3 + canh_1 > canh_2) {

            if (canh_1 == canh_2 && canh_2 == canh_3) {
                System.out.println("day la tam giac deu");
            } else if (canh_1 == canh_2 || canh_2 == canh_3 || canh_1 == canh_3) {
                System.out.println("day la tam giac can");
            } else if (
                    Math.pow(canh_1, 2) == Math.pow(canh_2, 2) + Math.pow(canh_3, 2) ||
                            Math.pow(canh_2, 2) == Math.pow(canh_1, 2) + Math.pow(canh_3, 2) ||
                            Math.pow(canh_3, 2) == Math.pow(canh_1, 2) + Math.pow(canh_2, 2)
            ) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("day la tam giac thuong");
            }
        } else {
            System.out.println("ba canh khong tao thanh tam giac");
        }
    }
}
