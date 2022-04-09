package ss6_inheritance.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc;

import javax.jws.soap.SOAPMessageHandlers;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize() {
        return getWidth();
    }

    public void setSize(double size) {
        setWidth(size);
        setHeight(size);
    }

    @Override
    public void setWidth(double size) {
        setSize(getWidth());
    }

    @Override
    public void setHeight(double size) {
        setSize(getHeight());
    }

    @Override
    public String toString() {
        return "A square with side =" + getSize() + ", which is a subclass of " + super.toString();
    }
}
