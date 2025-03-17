import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhâp giá trị cho phần tử thứ %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
        int maxOdd = 1;
        int minOdd = 1;

        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                if (maxOdd < arr[i]) {
                    maxOdd = arr[i];
                }
                if (minOdd > arr[i]) {
                    maxOdd = arr[i];
                }
                flag = true;
            }
        }
        if (flag) {
            System.out.printf("Số nguyên dương nhỏ nhất là %d\n", minOdd);
            System.out.printf("Số nguyên dương lớn nhất là %d\n", maxOdd);
        } else {
            System.out.println("Không có số duyên dương lẻ trong mảng");
        }
    }
}
