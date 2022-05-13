package extra_practice.VehicleManagement.services;

import extra_practice.VehicleManagement.controllers.VehiclesController;
import extra_practice.VehicleManagement.models.Car;
import extra_practice.VehicleManagement.utils.ReadAndWrite;
import extra_practice.VehicleManagement.utils.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleServiceImpl implements IVehicleService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Car> carList = new ArrayList<>();

    @Override
    public void addCar() {
        carList = ReadAndWrite.readFileCsvToCarList();

        // method 'input data' using regex
        String signalPlate = inputSignalPlate();

        System.out.print("Enter car manufacturer: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Enter car manufacturing year: ");
        int manufacturingYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter car owner: ");
        String owner = scanner.nextLine();
        System.out.print("Enter car seats in total: ");
        int seatTotal = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter car type (tourism/coach): ");
        String carType = scanner.nextLine();
        // System.out.print("Enter birthday: ");
        // String birthday = Regex.checkAgeRegex(String input, Regex.BIRTHDAY_REGEX)

        Car car = new Car(signalPlate, manufacturer, manufacturingYear,
                owner, seatTotal, carType);
        carList.add(car);
        ReadAndWrite.writeCarToCsv(carList, false);
    }

    private String inputSignalPlate() {
        System.out.print("Enter signal-plate: ");
        String input = scanner.nextLine();
        return Regex.checkRegex(input, Regex.SIGNAL_PLATE, "Wrong format! Signal-plate should be in form of xxY-xxxx or xxY-xxxxx");
    }
    @Override
    public void addTruck() {

    }

    @Override
    public void addMotorbike() {

    }

    @Override
    public void displayCars() {
        carList = ReadAndWrite.readFileCsvToCarList();
        if (carList.isEmpty()) {
            System.out.println("No car to display!");
        } else {
            for (Car car : carList) {
                System.out.println(car.toString());
            }
        }
    }

    @Override
    public void displayTrucks() {

    }

    @Override
    public void displayMotorbikes() {

    }

    @Override
    public void delete() {
        carList = ReadAndWrite.readFileCsvToCarList();
        System.out.print("Enter car signal-plate to delete: ");
        String signalPlate = scanner.nextLine();
        int count = 0;
        for (Car car : carList) {
            if (car.getSignalPlate().equals(signalPlate)) {
                count++;
                System.out.println("Delete?\n" +
                        "1. Yes\n" +
                        "2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    carList.remove(car);
                    System.out.println("Successfully deleted!\n" +
                            "Press Enter to return main menu!");
                    String enter = scanner.nextLine();
                    if (enter.equals("")) {
                        VehiclesController.displayMainMenu();
                    }

                } else if (choice == 2) {
                    System.out.println("Not deleted!\n");
                    VehiclesController.displayMainMenu();
                }
            }
        }
        if (count == 0) {
            System.out.println("Not found signal-plate!");
        }
        ReadAndWrite.writeCarToCsv(carList, false);
    }

    @Override
    public void search() {
        carList = ReadAndWrite.readFileCsvToCarList();
        System.out.print("Enter car signal-plate to search: ");
        String signalPlate = scanner.nextLine();
        int count = 0;
        for (Car car : carList) {
            if (car.getSignalPlate().contains(signalPlate)) {
                count++;
                System.out.println("Searching result: " + car.toString());
            }
        }
        if (count == 0) {
            System.out.println("Not found signal-plate!");
        }
        ReadAndWrite.writeCarToCsv(carList, false);
    }
}

