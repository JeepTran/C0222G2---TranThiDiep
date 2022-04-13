package ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3);
        System.out.println(square);

        square = new Square("pink", false,2);
        System.out.println(square);

        square.resize(Math.random()*100);
        System.out.println(square);
    }
}
