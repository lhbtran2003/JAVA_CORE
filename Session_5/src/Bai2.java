import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhâp giá trị cho phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.printf("Tổng các phần tử trong mảng = %d", sum);
    }
}
