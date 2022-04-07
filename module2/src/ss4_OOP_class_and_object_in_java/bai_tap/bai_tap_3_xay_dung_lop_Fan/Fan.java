package ss4_OOP_class_and_object_in_java.bai_tap.bai_tap_3_xay_dung_lop_Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public Fan() {

    }

    public Fan(final int SPEED, boolean isOn, double radius, String color) {
        this.speed = SPEED;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isOn) {
            return "{" +
                    "SLOW=" + SLOW +
                    ", MEDIUM=" + MEDIUM +
                    ", FAST=" + FAST +
                    ", speed=" + speed +
                    ", isOn=" + isOn +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}' +
                    "\nFan is on.";
        } else {
            return "{" +
                    "isOn=" + isOn +
                    ", radius=" + radius +
                    ", color='" + color +
                    "'}" + "\nFan is off.";
        }
    }
}
