import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        // sắp xếp mảng cho các số chẵn đứng trước, số lẻ đứng sau
        // giữ nguyên thứ tự trong từng nhóm

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập kích thước cho mảng:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %d: \n", i + 1);
            arr[i] = sc.nextInt();
        }

//        ArrayList<Integer> evenArr = new ArrayList<Integer>();
//        ArrayList<Integer> oddArr = new ArrayList<Integer>();
//
//        for (int value: arr) {
//            if (value % 2 == 0) {
//               evenArr.add(value);
//            } else {
//                oddArr.add(value);
//            }
//        }
//
//        // ghep 2 mảng lại với nhau
//        int index = 0;
//
//        for(int value: evenArr) {
//            arr[index++] = value;
//        }
//        for(int value: oddArr) {
//            arr[index++] = value;
//        }
//
//        System.out.println(Arrays.toString(arr));


        // ko dùng đến các biến tham chiếu
        int evenCount = 0, oddCount = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex++] = arr[i];
            } else {
                oddArr[oddIndex++] = arr[i];
            }
        }
        int index = 0;

        for (int value : evenArr) {
            arr[index++] = value;
        }
        for (int value : oddArr) {
            arr[index++] = value;
        }
        System.out.println(Arrays.toString(arr));


    }
}
