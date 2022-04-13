package ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        double random = Math.random() * 100;
        circle.resize(random);
        System.out.println(circle);
    }
}