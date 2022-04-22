package ss15_exception_and_debug.bai_tap.su_dung_lop_illegaltriangleexception;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                flag = false;
                System.out.print("Enter size a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter size b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter size c: ");
                int c = Integer.parseInt(scanner.nextLine());
                Triangle triangle = new Triangle(a, b, c);
                System.out.println("Triangle perimeter: " + triangle.getPerimeter());
            } catch (IllegalTriangleException e) {
                System.err.println(e.getMessage());
                flag = true;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
                flag = true;
            }
            System.out.println("End up program!");
        }
    }

}
