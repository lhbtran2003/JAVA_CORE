import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();

        System.out.print("Nhap ngay sau do: ");
        int anotherDay = sc.nextInt();
        System.out.print("Nhap thang sau do: ");
        int anotherMonth = sc.nextInt();
        System.out.print("Nhap nam sau do: ");
        int anotherYear = sc.nextInt();

        System.out.printf("Ngay hien tai: %d-%d-%d\n", day, month, year);

        // tính ngày tiếp theo
        day += 1;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 9 || month == 11) {
            month += day / 31;
            day %= 31;
        } else if (year % 4 == 0 && month == 2) {
            month += day / 29;
            day %= 29;
        } else if (month == 2) {
            month += day / 28;
            day %= 28;
        } else {
            month += day / 30;
            day %= 30;
        }

        year += month / 12;
        month %= 12;

        System.out.printf("Ngay tiep theo: %d-%d-%d", day, month, year);

        // tính số ngày (Khoảng cách) giữa 2 ngày
        int thutuNgay1 , thutuNgay2 ;


    }
}
