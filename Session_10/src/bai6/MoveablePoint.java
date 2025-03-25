package bai6;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public String move() {
       setX(getX() + xSpeed);
       setY(getY() + ySpeed);
       return toString();
    }

    @Override
    public String toString() {
        return String.format("(%.2f,%.2f) with speed (%.2f, %.2f)", getX(), getY(), getxSpeed(), getySpeed());
    }
}
