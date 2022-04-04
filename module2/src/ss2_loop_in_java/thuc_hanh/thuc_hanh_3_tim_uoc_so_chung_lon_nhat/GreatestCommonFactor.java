package ss2_loop_in_java.thuc_hanh.thuc_hanh_3_tim_uoc_so_chung_lon_nhat;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number b: ");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor.");
        } else if (a == 0 && b != 0) {
            System.out.println("The greatest common factor is: " + b);
        } else if (b == 0 && a != 0) {
            System.out.println("The greatest common factor is: " + a);
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.println("The greatest common factor is: " + a);
        }
    }
}
