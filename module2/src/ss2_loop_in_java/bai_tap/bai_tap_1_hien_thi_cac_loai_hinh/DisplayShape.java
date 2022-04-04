package ss2_loop_in_java.bai_tap.bai_tap_1_hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class DisplayShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                "\n1. Print the rectangle" +
                "\n2. Print the square triangle" +
                "\n3. Print isosceles triangle" +
                "\n4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("1. Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("2. Print the square triangle");
                System.out.println("2.1 Bottom-left square corner:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                System.out.println("2.2 Top-left square corner:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                System.out.println("2.3 Bottom-right square corner:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 4; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }

                System.out.println("2.4 Top-right square corner:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 5; k > i; k--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                System.out.println("3. Print isosceles triangle");
                for (int i = 0; i < 5; i++) {
                    for (int j = 5; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i * 2 + 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}
