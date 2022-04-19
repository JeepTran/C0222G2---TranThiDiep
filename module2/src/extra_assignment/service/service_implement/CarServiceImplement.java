package extra_assignment.service.service_implement;

import extra_assignment.model.Car;
import extra_assignment.service.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarServiceImplement implements CarService {

    static ArrayList<Car> carList = new ArrayList<Car>();
    Scanner scanner = new Scanner(System.in);
static {
    carList.add(new Car("11H1-11111","Honda",2000,"A",4,"Du lịch"));
    carList.add(new Car("11H1-11115","Marda",2001,"C",7,"Xe khách"));
    carList.add(new Car("11H1-11114","Vinfast",2002,"D",9,"Du lịch"));
    carList.add(new Car("11H1-11113","Ford",2003,"E",21,"Du lịch"));
    carList.add(new Car("11H1-11112","Mercedes",2004,"F",16,"Xe khách"));
}


    @Override
    public void add() {
        System.out.print("Enter number-plate: ");
        String newNumberPlate = scanner.nextLine();
        System.out.print("Choose company: ");
        String newCompany = scanner.nextLine();
        System.out.print("Enter manufacturing year: ");
        int newManufacturingYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter owner: ");
        String newOwner = scanner.nextLine();
        System.out.println("Enter car type: ");
        String newCarType = scanner.nextLine();
        System.out.println("Enter the number of seats: ");
        int newSeatTotal = Integer.parseInt(scanner.nextLine());

        carList.add(new Car(newNumberPlate,newCompany,newManufacturingYear,newOwner,newSeatTotal,newCarType));

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
