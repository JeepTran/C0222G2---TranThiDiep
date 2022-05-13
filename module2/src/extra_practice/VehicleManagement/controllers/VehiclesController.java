package extra_practice.VehicleManagement.controllers;

import extra_practice.VehicleManagement.services.VehicleServiceImpl;

import java.util.Scanner;

public class VehiclesController {
    static Scanner scanner = new Scanner(System.in);
    //    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//    static CustomerServiceImpl customerService = new CustomerServiceImpl();
//    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static VehicleServiceImpl vehicleService = new VehicleServiceImpl();

    public static void displayMainMenu() {
        int choice = 0;
        while (true) {
            System.out.println("-------VEHICLES MANAGEMENT-------\n" +
                    "1. Add new vehicle\n" +
                    "2. Display vehicles\n" +
                    "3. Delete vehicle\n" +
                    "4. Search vehicle by signal-plate\n" +
                    "5. Exit");
            System.out.print("Choose function: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException n) {
                System.out.println("Wrong number format. Enter again! ");
            }
            switch (choice) {
                case 1:
                    displayAddNewVehicleMenu();
                    break;
                case 2:
                    displayDisplayVehiclesMenu();
                    break;
                case 3:
                    vehicleService.delete();
                    break;
                case 4:
                    vehicleService.search();
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
                    "1. Add car\n" +
                    "2. Add truck\n" +
                    "3. Add motorbike\n" +
                    "4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleService.addCar();
                    break;
                case 2:
                    vehicleService.addTruck();
                    break;
                case 3:
                    vehicleService.addMotorbike();
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
                    "1. Display cars\n" +
                    "2. Display trucks\n" +
                    "3. Display motorbikes\n" +
                    "4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    vehicleService.displayCars();
                    break;
                case 2:
                    vehicleService.displayTrucks();
                    break;
                case 3:
                    vehicleService.displayMotorbikes();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }


}

