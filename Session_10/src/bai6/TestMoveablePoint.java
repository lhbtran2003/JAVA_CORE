package bai6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        MoveablePoint moveablePoint = new MoveablePoint(1,2, 3,4);

        System.out.println(point.getX());
        System.out.println(point.getY());

        System.out.println("Thông tin của điểm sau khi di chuyển");
        System.out.println(moveablePoint.move());
        moveablePoint.setxSpeed(7);
        moveablePoint.setySpeed(9);
        System.out.println(moveablePoint.move());

    }
}
