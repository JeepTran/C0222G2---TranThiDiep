package extra_assignment.service.service_implement;

import extra_assignment.model.Truck;
import extra_assignment.service.ITruckService;

import java.util.ArrayList;
import java.util.Scanner;

public class TruckServiceImplement implements ITruckService {
    static ArrayList<Truck> truckList = new ArrayList<Truck>();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.print("Enter number-plate: ");
        String newNumberPlate = scanner.nextLine();
        System.out.print("Choose company: ");
        // show companyList
        int company = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter manufacturing year: ");
        int newManufacturingYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner: ");
        String newOwner = scanner.nextLine();
        System.out.print("Enter loading-weight: ");
        int newLoadingWeight = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
