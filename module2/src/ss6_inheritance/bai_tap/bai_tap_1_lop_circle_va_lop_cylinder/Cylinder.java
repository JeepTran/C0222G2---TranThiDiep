package ss6_inheritance.bai_tap.bai_tap_1_lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                ", color='" + super.getColor() + '\'' +
                ", height=" + height +
                '}';
    }
}
