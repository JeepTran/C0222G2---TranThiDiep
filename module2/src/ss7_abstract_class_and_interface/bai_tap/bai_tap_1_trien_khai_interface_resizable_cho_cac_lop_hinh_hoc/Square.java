package ss7_abstract_class_and_interface.bai_tap.bai_tap_1_trien_khai_interface_resizable_cho_cac_lop_hinh_hoc;

import ss7_abstract_class_and_interface.bai_tap.bai_tap_2_trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Colorable;

public class Square extends Shape implements Resizable, Colorable {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    public double getPerimeter() {
        return this.size * 4;
    }

    @Override
    public String toString() {
        return "A Square with size="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.size = this.size * percent;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
