package case_study.furama_resort.controllers;

import case_study.furama_resort.services.service_implement.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
//    static FacilityVillaServiceImpl villaService = new FacilityVillaServiceImpl();
//    static FacilityRoomServiceImpl roomService = new FacilityRoomServiceImpl();
//    static FacilityHouseServiceImpl houseService = new FacilityHouseServiceImpl();

    public static void displayMainMenu() {

        while (true) {
            System.out.println("-------Management-------\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit");
            System.out.print("Choose function: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeManagementMenu();
                    break;
                case 2:
                    displayCustomerManagementMenu();
                    break;
                case 3:
                    displayFacilityManagementMenu();
                    break;
                case 4:
                    displayBookingManagementMenu();
                    break;
                case 5:
                    displayPromotionManagementMenu();
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayEmployeeManagementMenu() {
        while (true) {
            System.out.println("----- Employee Management -----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            int employeeManagementChoice = Integer.parseInt(scanner.nextLine());
            switch (employeeManagementChoice) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayCustomerManagementMenu() {
        while (true) {
            System.out.println("----- Customer Management -----\n" +
                    "1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            int customerManagementChoice = Integer.parseInt(scanner.nextLine());
            switch (customerManagementChoice) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayFacilityManagementMenu() {
        while (true) {
            System.out.println("----- Facility Management -----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            int customerManagementChoice = Integer.parseInt(scanner.nextLine());
            switch (customerManagementChoice) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    displayAddNewFacilityMenu();
                    break;
                case 3:
                    facilityService.displayMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    private static void displayAddNewFacilityMenu() {
        while (true) {
            System.out.println("Add new:\n" +
                    "1. Villa\n" +
                    "2. House\n" +
                    "3. Room\n" +
                    "4. Return facility menu");
            int addNewFacilityChoice = Integer.parseInt(scanner.nextLine());
            switch (addNewFacilityChoice) {
                case 1:
//                    villaService.add();
                    break;
                case 2:
//                    houseService.add();
                    break;
                case 3:
//                    roomService.add();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayBookingManagementMenu() {
        while (true) {
            System.out.println("----- Booking Management -----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            int customerManagementChoice = Integer.parseInt(scanner.nextLine());
            switch (customerManagementChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayPromotionManagementMenu() {
        while (true) {
            System.out.println("----- Promotion Management -----\n" +
                    "1. Display list customers using service\n" +
                    "2. Display list customers getting voucher\n" +
                    "3. Return main menu");
            int customerManagementChoice = Integer.parseInt(scanner.nextLine());
            switch (customerManagementChoice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}