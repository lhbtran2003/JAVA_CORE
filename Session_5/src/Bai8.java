import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng mong muốn:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d: \n", i + 1);
            arr[i] = sc.nextInt();
        }
        Integer[] passArr = new Integer[size];
        int [] markingArr = new int[size];
        System.out.println(Arrays.toString(passArr));
        for (int i = 0; i < size; i++) {
            boolean isExit = false;
            for (Integer value : passArr) {
                if (value != null && value == arr[i]) {
                    isExit = true;
                }
            }
            if (isExit) {
                continue;
            }
            passArr[i] = arr[i];

            //xác định tần suất xuất hiện
            int count = 0;
            for(int value: arr) {
                if (value == arr[i]) {
                    count++;
                }
            }
            markingArr[i] = count;

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(markingArr));

        for (int i = 0; i < size; i++) {
            if (markingArr[i] == 0) {
                continue;
            }
            System.out.printf("%d ", arr[i]);
        }


    }
}
