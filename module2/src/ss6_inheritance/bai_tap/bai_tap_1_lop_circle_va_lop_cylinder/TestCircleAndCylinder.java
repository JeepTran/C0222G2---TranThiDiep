package ss6_inheritance.bai_tap.bai_tap_1_lop_circle_va_lop_cylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "blue");
        System.out.println(circle + " has an area of: " + circle.getArea());

        Cylinder cylinder = new Cylinder(3.5, "blue", 4);
        System.out.println(cylinder + " has a volume of: " + cylinder.getVolume());
    }
}
