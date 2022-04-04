package ss2_loop_in_java.thuc_hanh.thuc_hanh_4_thiet_ke_menu_cho_ung_dung;

import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu:" +
                "\n1. Draw a triangle." +
                "\n2. Draw a square." +
                "\n3. Draw a rectangle." +
                "\n0. Exit.");
        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(input.nextLine());
        switch (choice){
            case 1:
                System.out.println("Draw a triangle");
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw a square");
                System.out.println("*  *  *  *  *");
                System.out.println("*  *  *  *  *");
                System.out.println("*  *  *  *  *");
                System.out.println("*  *  *  *  *");
                System.out.println("*  *  *  *  *");

                break;
            case 3:
                System.out.println("Draw a rectangle");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                System.out.println("* * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
