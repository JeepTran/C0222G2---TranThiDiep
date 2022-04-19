package extra_assignment.service.service_implement;

import extra_assignment.model.Car;
import extra_assignment.model.Motorbike;
import extra_assignment.service.MotorbikeService;

import java.util.ArrayList;
import java.util.Scanner;

public class MotorbikeServiceImplement implements MotorbikeService {

    static ArrayList<Motorbike> motorbikeList = new ArrayList<Motorbike>();
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
        System.out.print("Enter capacity: ");
        int newCapacity = Integer.parseInt(scanner.nextLine());

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
