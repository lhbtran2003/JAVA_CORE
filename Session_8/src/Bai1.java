import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        //Viết chương trình để tìm ra giá trị lớn nhất và giá trị nhỏ nhất của một mảng các số nguyên.
        // Chương trình vẫn hoàn toàn chạy tốt ngay cả với số âm

        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (true) {
            System.out.print("Nhập vào kích thước mảng: ");
            n = sc.nextInt();
            if(n > 0) {
                break;
            }
            System.out.println("Kích thước không hợp lệ!");
            System.out.println("-------------------------");
        }

        //Nhập vào các phần tử mảng(có cả giá trị âm, dương và bằng 0)
        int [] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %s\n", i+1);
            arrInt[i] = sc.nextInt();
        }

        //in ra giá trị lớn nhất và nhỏ nhất trong mảng
        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {
            if(arrInt[i] > max) {
                max = arrInt[i];
            }
            if(arrInt[i] < min) {
                min = arrInt[i];
            }
        }
        System.out.printf("Max = %d\n", max);
        System.out.printf("Min = %d", min);


    }
}
