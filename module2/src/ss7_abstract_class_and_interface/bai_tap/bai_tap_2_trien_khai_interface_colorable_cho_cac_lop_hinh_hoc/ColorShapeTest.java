package ss7_abstract_class_and_interface.bai_tap.bai_tap_2_trien_khai_interface_colorable_cho_cac_lop_hinh_hoc;

import ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc.Circle;
import ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc.Rectangle;
import ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc.Shape;
import ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc.Square;

public class ColorShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(2, 4);
        shapes[3] = new Square(5);
        shapes[4] = new Square(7);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle: area = " + c.getArea());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("Rectangle: area = " + r.getArea());
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                System.out.print("Square: area = " + s.getArea() + ", colorable: ");
                s.howToColor();
            }
        }
    }
}
