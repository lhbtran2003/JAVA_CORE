import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
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

        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if(arrInt[i] % 3 == 0) {
                sum += arrInt[i];
                count++;
            }
        }
        if(count > 0) {
            System.out.printf("Tổng các phần tử chia hết cho 3 = %d", sum);
        } else {
            System.out.println("Không có số chia hết cho 3");
        }
    }
}
