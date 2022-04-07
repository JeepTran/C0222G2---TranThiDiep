package ss5_access_modifier_and_static_method_and_static_property.bai_tap.bai_tap_1_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle radius = " + circle.getRadius());
        System.out.println("Circle area = " + circle.getArea());
    }
}
