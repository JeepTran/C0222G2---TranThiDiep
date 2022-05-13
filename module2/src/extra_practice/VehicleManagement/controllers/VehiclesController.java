package extra_practice.FuramaResort.controllers;

import java.util.Scanner;

public class VehiclesController {
    static Scanner scanner = new Scanner(System.in);
//    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//    static CustomerServiceImpl customerService = new CustomerServiceImpl();
//    static FacilityServiceImpl facilityService = new FacilityServiceImpl();

    public static void displayMainMenu() {

        while (true) {
            System.out.println("-------VEHICLES MANAGEMENT-------\n" +
                    "1. Add new vehicle\n" +
                    "2. Display vehicles\n" +
                    "3. Delete vehicle\n" +
                    "4. Search vehicle by signal-plate\n" +
                    "5. Exit");
            System.out.print("Choose function: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayAddNewVehicleMenu();
                    break;
                case 2:
                    displayDisplayVehiclesMenu();
                    break;
                case 3:
                    //delete
                    break;
                case 4:
                    //search
                    break;
                case 5:
                    System.exit(6);
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayAddNewVehicleMenu() {
        while (true) {
            System.out.println("----- ADD NEW VEHICLE -----\n" +
                    "1. Add truck\n" +
                    "2. Add car\n" +
                    "3. Add motorbike\n" +
                    "4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    public static void displayDisplayVehiclesMenu() {
        while (true) {
            System.out.println("----- DISPLAY VEHICLES -----\n" +
                    "1. Display trucks\n" +
                    "2. Display cars\n" +
                    "3. Display motorbikes\n" +
                    "4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }


}

