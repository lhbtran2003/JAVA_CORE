package Bai5;

public class Vector2D {
    // x (Tọa độ x của vector) - kiểu double.
    double x;
    // y (Tọa độ y của vector) - kiểu double.
    double y;

    // Constructor có tham số để khởi tạo tọa độ x và y.
    Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calculateMagnitude(): Tính độ dài của vector
    public double calculateMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // :)))) IDE tự cho công thức luôn
    }


    // add(Vector2D v): Trả về vector tổng của vector hiện tại và v
    public Vector2D add(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    // subtract(Vector2D v): Trả về vector hiệu giữa vector hiện tại và v.
    public Vector2D subtract(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    // dotProduct(Vector2D v): Tính tích vô hướng giữa vector hiện tại và v
    public double dotProduct(Vector2D v) {
        return this.x * v.x + this.y * v.y;
    }

    // displayVector(): Hiển thị tọa độ của vector dưới dạng (x, y).
    public void displayVector(){
        System.out.printf("(%.2f,%.2f)\n", this.x, this.y);
    }

    public static void main(String[] args) {
        //Tạo ít nhất hai vector Vector2D với tọa độ khác nhau.
        Vector2D v1 = new Vector2D(1.0, 2.0);
        Vector2D v2 = new Vector2D(3.0, 4.0);
        v1.displayVector();
        v2.displayVector();

        // Tính và hiển thị độ dài, tổng, hiệu, tích vô hướng giữa hai vector
        System.out.println(String.format("%.2f, %.2f", v1.add(v2).x, v2.add(v2).y));
        System.out.println(String.format("%.2f, %.2f", v1.subtract(v2).x, v2.subtract(v2).y));
        System.out.printf("%,3f", v1.dotProduct(v2));
    }
}
