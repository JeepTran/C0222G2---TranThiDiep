package ss6_inheritance.bai_tap.bai_tap_4_lop_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.toString());


        Triangle triangle2 = new Triangle();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size1 of the triangle: ");
        double size1 = Double.parseDouble(scanner.nextLine());
        triangle2.setSide1(size1);

        System.out.print("Enter size2 of the triangle: ");
        double size2 = Double.parseDouble(scanner.nextLine());
        triangle2.setSide2(size2);

        System.out.print("Enter size3 of the triangle: ");
        double size3 = Double.parseDouble(scanner.nextLine());
        triangle2.setSide3(size3);

        System.out.print("Color of the triangle: ");
        String color = scanner.nextLine();
        triangle2.setColor(color);

        System.out.print("Fill the triangle? (yes/no): ");
        boolean filled = scanner.nextLine().equals("yes");
        triangle2.setFilled(filled);


        System.out.println(triangle2.toString());
    }
}
