package ss4_OOP_class_and_object_in_java.thuc_hanh.thuc_hanh_lop_hinh_chu_nhat;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height of the rectangle: ");
        double height = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("The rectangle: " + rectangle.display());
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.getPerimeter());
    }
}
