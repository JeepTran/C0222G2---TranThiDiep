package ss6_inheritance.bai_tap.bai_tap_4_lop_triangle;

import ss6_inheritance.thuc_hanh.thuc_hanh_he_cac_doi_tuong_hinh_hoc.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double peri = side1 + side2 + side3;
        return peri;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }

    public boolean isTriangle() {
        return side1 > 0 && side2 > 0 && side3 > 0
                && (side1 + side2) > side3
                && (side2 + side3) > side1
                && (side1 + side3) > side2;
    }

    @Override
    public String toString() {
        if (isTriangle()) {
            return "Triangle{" +
                    "side1=" + side1 +
                    ", side2=" + side2 +
                    ", side3=" + side3 +
                    ", color='" + super.getColor() + '\'' +
                    ", filled=" + super.isFilled() +
                    ", perimeter=" + getPerimeter() +
                    ", area=" + getArea() +
                    '}';
        } else {
            return "Not a triangle!";
        }
    }
}
