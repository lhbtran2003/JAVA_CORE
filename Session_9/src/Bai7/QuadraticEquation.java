package Bai7;

public class QuadraticEquation {
    // a (hệ số bậc 2): Kiểu double.
    // b (hệ số bậc 1): Kiểu double.
    // c (hệ số tự do): Kiểu double.
    double a,b,c;

    // Constructor có tham số để khởi tạo các giá trị của a, b, và c.
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // getDiscriminant(): Tính và trả về biệt thức (discriminant) của phương trình bậc 2, sử dụng công thức: delta = b2 – 4ac
    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    // hasRealRoots(): Kiểm tra xem phương trình có nghiệm thực hay không (khi biểu thức delta >= 0
    public boolean hasRealRoots() {
        if (getDiscriminant() < 0) {
            return false;
        }
        return true;
    }

    // getRoot1(): Tính và trả về nghiệm thứ nhất của phương trình nếu biệt thức delta >= 0, nếu không trả về NaN (Not a Number).
    public double getRoot1() {
        if (hasRealRoots()) {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    // getRoot2(): Tính và trả về nghiệm thứ hai nếu biệt thức delta >= 0, nếu không trả về NaN.
    public double getRoot2() {
        if (hasRealRoots()) {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    // display(): Hiển thị nghiệm của phương trình (nếu có), và thông báo nếu phương trình không có nghiệm thực.
    public void display() {
        if (hasRealRoots()) {
            System.out.println("Root 1: " + getRoot1());
            System.out.println("Root 2: " + getRoot2());
        } else {
            System.out.println("Pt ko co nghiệm thực");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, -3.0, 2.0);
        quadraticEquation.display();
    }
}
