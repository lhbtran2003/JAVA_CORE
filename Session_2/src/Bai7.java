import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int hour, minute, second;
        int plus_hour, plus_minute, plus_second;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gio: ");
        hour = sc.nextInt();
        System.out.print("Nhap phut: ");
        minute = sc.nextInt();
        System.out.print("Nhap giay: ");
        second = sc.nextInt();

        System.out.print("Nhap gio cong them: ");
        plus_hour = sc.nextInt();
        System.out.print("Nhap phut cong them: ");
        plus_minute = sc.nextInt();
        System.out.print("Nhap giay cong them: ");
        plus_second = sc.nextInt();

        second += plus_second;
        // chuyển giây sang phút
        minute += second / 60;
        second = second % 60;

        // chuyển phút sang giờ
        minute += plus_minute;
        hour += minute / 60;
        minute = minute % 60;

        hour += plus_hour;


        System.out.printf("Tổng thời gian: %d giờ %d phút %d giây", hour, minute, second);

    }
}
