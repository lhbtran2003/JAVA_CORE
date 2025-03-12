import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập số đầu tiên từ bàn phím
        System.out.print("nhap so thu 1: ");
        int firstNum = sc.nextInt();

        // nhap kí tự phép toán
        System.out.print("nhap phep toan: ");
        String kitu = sc.next();

        // nhập số thứ hai từ bàn phím
        System.out.print("nhap so thu 2: ");
        int secondNum = sc.nextInt();

        //Dựa vào ký hiệu phép toán,
        // chương trình thực hiện phép tính tương ứng và hiển thị kết quả
//        if (kitu.equals("+")) {
//            System.out.println("Ket qua = " + (firstNum + secondNum));
//        } else if (kitu.equals("-")) {
//            System.out.println("Ket qua = " + (firstNum - secondNum));
//        } else if (kitu.equals("*")) {
//            System.out.println("Ket qua = " + (firstNum * secondNum));
//        } else if (kitu.equals( "/")) {
//            if (secondNum == 0) {
//                System.out.println("khong the chia cho 0");
//            } else {
//                System.out.println("Ket qua = " + (firstNum / secondNum));
//            }
//        } else {
//            System.out.println("Phep toan khong hop le");
//        }

        // thử sử dụng switch case
        switch (kitu) {
            case "+":
                System.out.println("Ket qua = " + (firstNum + secondNum));
                break;
            case "-":
                System.out.println("Ket qua = " + (firstNum - secondNum));
                break;

            case "*":
                System.out.println("Ket qua = " + (firstNum * secondNum));
                break;

            case "/":
                if (secondNum == 0) {
                    System.out.println("khong the chia cho 0");
                } else {
                    System.out.println("Ket qua = " + (firstNum / secondNum));
                }
                break;

            default:
                System.out.println("Phep toan khong hop le");
        }
    }
}