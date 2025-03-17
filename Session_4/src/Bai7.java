import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập một số nguyên bất kì:");
//        int n = sc.nextInt();
        int [] arr =  {20,50,100,1,4};

        for (int n : arr) {
            printHappyNumbers(n);
            System.out.println();
        }


    }

    private static void printHappyNumbers(int n) {
        for (int i = 1; i < n; i++) {
            int temp = i;
//            boolean flag = true;
            while (true) {
                int sum = 0;

                //19
                // tính tổng bình phương các chữ số
                while (temp != 0) {
                    int unit = temp % 10;
                    temp /= 10;
                    sum += (int) Math.pow(unit, 2);
                }

                if (sum == 1) {
//                    flag = false;
                    System.out.printf("%d ", i);
                    break;

                } else if (sum > 1 && sum <= 4) {
                    break;
                }
                temp = sum;

            }
        }
    }
}
