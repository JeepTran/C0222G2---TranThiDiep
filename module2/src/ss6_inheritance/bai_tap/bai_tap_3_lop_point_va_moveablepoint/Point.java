package ss6_inheritance.bai_tap.bai_tap_3_lop_point_va_moveablepoint;

public class Point {
    private static float x = 0.0f;
    private static float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arrayXY = new float[2];
        arrayXY[0] = this.x;
        arrayXY[1] = this.y;
        return arrayXY;
    }

    @Override
    public String toString() {
        return "(x,y) = (" + x + ", " + y + ")";
    }
}
