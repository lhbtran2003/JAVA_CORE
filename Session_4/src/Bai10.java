import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            print();

            System.out.print("Nhập chức năng bạn muốn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số bạn muốn kiểm tra: ");
                    int n1 = sc.nextInt();
                    findPrime(n1);
                    break;
                case 2:
                    System.out.print("Nhập số bạn muốn kiểm tra: ");
                    int n2 = sc.nextInt();
                    checkHappyNumber(n2);
                    break;
                case 3:
                    System.out.print("Nhập số bạn muốn kiểm tra: ");
                    int n3 = sc.nextInt();
                    sumUoc(n3);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Số không hợp lệ, vui lòng nhập lại!");

            }
        } while (choice != 4);
    }

    private static void print() {
        System.out.println("|---------------------MENU-----------------------|");
        System.out.println("|1.Kiểm tra một số có phải là số nguyên tố không.|");
        System.out.println("|2.Kiểm tra một số có phải là số hoàn hảo không. |");
        System.out.println("|3.Tìm và tính tổng tất cả các ước của một số.   |");
        System.out.println("|4.Thoát chương trình.                           |");
        System.out.println("|------------------------------------------------|");
    }

    private static void findPrime(int n) {
        if (n == 2) {
            System.out.println("2 là số nguyên tố");
        }
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // chia hết
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("đây là số nguyên tố");
        } else {
            System.out.println("đây không phải số nguyên tố");
        }
    }

    private static void checkHappyNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Đây là số happy number");
        } else {
            System.out.println("Đây không là số happy number");
        }
    }

    private static void sumUoc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.printf("Tổng các ước số của %d là %d", n, sum);
    }
}
