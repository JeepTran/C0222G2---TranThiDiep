package ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(2, 5);
        shapes[2] = new Square(6);

        System.out.println("Area before and after resized: ");
        for (Shape item : shapes) {
            double percent = Math.floor(Math.random() * 100);
            if (item instanceof Circle) {
                Circle c = (Circle) item;
                System.out.print("Circle: ");
                System.out.print(c.getArea());
                c.resize(percent);
                System.out.println(" - " + c.getArea());

            } else if (item instanceof Rectangle) {
                Rectangle r = (Rectangle) item;
                System.out.print("Rectangle: ");
                System.out.print(r.getArea());
                r.resize(percent);
                System.out.println(" - " + r.getArea());

            } else {
                Square s = (Square) item;
                System.out.print("Square: ");
                System.out.print(s.getArea());
                s.resize(percent);
                System.out.println(" - " + s.getArea());
            }
        }

    }


}
