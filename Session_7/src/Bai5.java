import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi bất kì:");
        String str = new Scanner(System.in).nextLine().trim().replaceAll("\\s+", " ");
        // tách thành từng từ
        String [] arr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        // tiến hành đảo ngược
        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]).append(" ");
        }
        System.out.println(stringBuilder);

    }
}
