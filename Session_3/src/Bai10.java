import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số thứ nhất: ");
        float a = sc.nextFloat();

        System.out.print("Nhập hệ số thứ hai: ");
        float b = sc.nextFloat();

        System.out.print("Nhập hệ số thứ ba: ");
        float c = sc.nextFloat();

        System.out.print("Nhập hệ số thứ tư");
        float d = sc.nextFloat();

        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    if(d == 0) {
                        System.out.println("Phuương trình có vô số nghiệm");
                    }
                    else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                }
                else {
                    float x = -d/c;
                    System.out.println("Phương trình có nghiệm x = " + x);
                }
            }
            else {
                float delta = b * b - 4 * a * c;

                if (delta > 0) {
                    float x1 = (float) (-b + Math.sqrt(delta)) / 2;
                    float x2 = (float) (-b - Math.sqrt(delta)) / 2;
                    System.out.println("Phương trình có 2 nghiệm phân biệt");
                    System.out.println("x1 = " +x1 + " x2 = " +x2);
                } else if (delta == 0) {
                    float x= (-c) / (2 * b);
                    System.out.println("Phương trình có nghiệm kép x = "+ x);
                }
                else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
        }
        else {

        }
    }
}
