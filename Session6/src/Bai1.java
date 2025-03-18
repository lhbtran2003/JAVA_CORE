import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = sc.nextLine();
        System.out.printf("Từ nhập vào : %s\n", str);
        System.out.printf("Độ dài chữ: %d", str.length());
    }
    // kết luận: có dấu tiếng việt thì vẫn ko tính dấu nhê hêhê
}
