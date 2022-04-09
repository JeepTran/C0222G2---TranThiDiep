package ss6_inheritance.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("yellow", true, 4);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(5, 7);
        System.out.println(rectangle);
        rectangle = new Rectangle("blue", true, 9, 3);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
        square = new Square(3.5);
        System.out.println(square);
        square = new Square("black", false, 5);
        System.out.println(square);
    }
}
