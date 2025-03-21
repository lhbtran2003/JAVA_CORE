import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int n = 0;
        while (true) {
            System.out.println();
            System.out.println("****************MENU****************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng (`n` nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (`>0`) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng `k` trong mảng (`k` nhập từ bàn phím)");
            System.out.println("5. Tính số lượng các phần tử là **số nguyên tố** trong mảng");
            System.out.println("6. Thoát chương trình");
            System.out.println("************************************");

            System.out.print("Nhập sự lựa chọn: ");
            byte choice = Byte.parseByte(sc.nextLine());
            System.out.println("_____________________________________");

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập độ dài n: ");
                        n = Integer.parseInt(sc.nextLine());
                        if (n > 0 && n <= 100) {
                            break;
                        }
                        System.out.println("Độ dài ko hợp lệ. Vui lòng nhập lại");
                    }
                    input(arr, n, sc);
                    break;
                case 2:
                    printArray(arr, n);
                    break;
                case 3:
                    calculatePosAvg(arr, n);
                    break;
                case 4:
                    findPositions(arr, n, sc);
                    break;
                case 5:
                    calculateCountOfPrime(arr, n);
                    break;
                case 6:
                    sc.close();
                    return;
            }
        }
    }

    public static void input(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị cho phần tử thứ %s: ", i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public static void printArray(int[] arr, int n) {
        System.out.println("Gía trị các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void calculatePosAvg(int[] arr, int n) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.printf("Trung bình các phần tử dương trong mảng = %s\n", sum / count);
    }

    public static void findPositions(int[] arr, int n, Scanner sc) {
        System.out.print("Nhập gía trị `k`: ");
        int k = Integer.parseInt(sc.nextLine());
        boolean findIndex = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.printf("Vị trí của %d trong mảng là: %d ", arr[i], i);
                findIndex = true;
            }
        }
        if (!findIndex) {
            System.out.printf("Không có vị trí nào có giá trị khớp với %d\n", k);
        }
    }

    public static void calculateCountOfPrime(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 2) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
        }
        System.out.printf("Số lượng số nguyên tố trong mảng là %s\n", count);
    }

}
