import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.printf("Nhâp giá trị cho phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        for (int i = size-1; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
