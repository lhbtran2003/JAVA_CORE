import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi bấtkifi:");
        String str = new Scanner(System.in).nextLine();
        StringBuilder stringBuilder = new StringBuilder(str.length() + 50);
        stringBuilder.append(str);

        String firstChar = stringBuilder.substring(0,1);
        if (firstChar.matches("[A-Z]")) {
            stringBuilder.replace(0,1,firstChar.toLowerCase());

        }
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            if (i < stringBuilder.length() && stringBuilder.substring(i, i + 1).matches("[A-Z]")) {
                stringBuilder.insert(i, "_");
                i--;
            }

        }

        System.out.printf("%s", stringBuilder.toString().toLowerCase());


    }
}
