package ss15_exception_and_debug.thuc_hanh.thuc_hanh_3_su_dung_lop_numberformatexception;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter y: ");
        int y = Integer.parseInt(scanner.nextLine());
        NumberFormatException numberFormatException = new NumberFormatException();
        numberFormatException.calculate(x, y);
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Difference x - y = " + b);
            System.out.println("Product x * y = " + c);
            System.out.println("Factor x / y = " + d);
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
