package ss4_OOP_class_and_object_in_java.thuc_hanh.thuc_hanh_lop_hinh_chu_nhat;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "{width = " + this.width + ", height = " + this.height + "}";
    }
}
