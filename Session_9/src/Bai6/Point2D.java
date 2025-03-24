package Bai6;

public class Point2D {
    double x;
    double y;

    Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double distanceTo(Point2D p) {
        double dx = p.x - this.x;
        double dy = p.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void displayPoint() {
        System.out.println(String.format("(%.2f, %.2f)", x, y));
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1.0, 2.0);
        Point2D p2 = new Point2D(3.0, 4.0);
        System.out.printf("Khoảng cách giữa 2 điểm là %.2f\n", p1.distanceTo(p2) );

        p1.setX(5);
        p1.setY(5);
        p1.displayPoint();
    }
}
