package ss6_inheritance.bai_tap.bai_tap_3_lop_point_va_moveablepoint;

import java.util.Arrays;
import java.util.Scanner;

public class TestPointAndMoveablePoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter y: ");
        float y = Float.parseFloat(scanner.nextLine());
        Point point = new Point();
        point.setXY(x, y);
        System.out.println(point.toString());

        System.out.print("Enter speed x: ");
        float xSpeed = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter speed y: ");
        float ySpeed = Float.parseFloat(scanner.nextLine());

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setSpeed(xSpeed, ySpeed);
        moveablePoint.move();
        System.out.println(moveablePoint.toString());


    }
}
