package exam_module_2.controllers;

import exam_module_2.services.MobileServiceImpl;

import java.util.Scanner;

public class MobileController {
    static Scanner scanner = new Scanner(System.in);
    static MobileServiceImpl mobileService = new MobileServiceImpl();

    public static void displayMainMenu() {
        int choice = 0;
        while (true) {
            System.out.println("-------MOBILES MANAGEMENT-------\n" +
                    "Choose function by number to continue:\n" +
                    "1. Add new mobile\n" +
                    "2. Delete mobile\n" +
                    "3. Display mobile list\n" +
                    "4. Search mobile\n" +
                    "5. Exit");
            System.out.print("Choose function: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Wrong number format. Enter again! ");
            }
            switch (choice) {
                case 1:
                    displayAddNewMenu();
                    break;
                case 2:
                    mobileService.delete();
                    break;
                case 3:
                    displayDisplayMenu();
                    break;
                case 4:
                    mobileService.search();
                    break;
                case 5:
                    System.exit(6);
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayAddNewMenu() {
        int choice = 0;

        while (true) {
            System.out.println("----- ADD NEW MOBILES -----\n" +
                    "1. Add authorized mobile\n" +
                    "2. Add foreign mobile");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Wrong number format. Enter again! ");
            }
            switch (choice) {
                case 1:
                    mobileService.addAuthorizedMobile();
                    displayMainMenu();
                    break;
                case 2:
                    mobileService.addForeignMobile();
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayDisplayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("----- DISPLAY MOBILES -----\n" +
                    "1. Display authorized mobile\n" +
                    "2. Display foreign mobile");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Wrong number format. Enter again! ");
            }
            switch (choice) {
                case 1:
                    mobileService.displayAuthorizedMobile();
                    displayMainMenu();
                    break;
                case 2:
                    mobileService.displayForeignMobile();
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}
