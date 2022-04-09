package ss6_inheritance.bai_tap.bai_tap_3_lop_point_va_moveablepoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

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

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] speed = new float[2];
        speed[0] = this.xSpeed;
        speed[1] = this.ySpeed;
        return speed;
    }

    public MoveablePoint move() {
        x += this.xSpeed;
        y += this.ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "Now " + super.toString() + ", speed = (" + this.xSpeed + ", " + this.ySpeed + ")";
    }
}
