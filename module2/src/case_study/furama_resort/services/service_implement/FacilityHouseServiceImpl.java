package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.services.FacilityHouseService;

import java.util.Scanner;

import static case_study.furama_resort.services.service_implement.FacilityServiceImpl.facilities;

public class FacilityHouseServiceImpl implements FacilityHouseService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        facilities.put(houseInformation(),0);
    }

    public Facility houseInformation() {
        String serviceName;
        double usableArea;
        int rentalFee;
        int maximumPax;
        String rentalType;
        String roomStandard;
        int numOfFloors;

        try {
            System.out.print("Enter facility-service name: ");
            serviceName = scanner.nextLine();
            System.out.print("Enter facility usable area: ");
            usableArea = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter rental fee: ");
            rentalFee = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter maximum pax: ");
            maximumPax = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter rental type: ");
            rentalType = scanner.nextLine();
            System.out.print("Enter room standard: ");
            roomStandard = scanner.nextLine();
            System.out.print("Enter number of floors: ");
            numOfFloors = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return houseInformation();
        }
        return new House(serviceName,usableArea,rentalFee,maximumPax,rentalType,roomStandard,numOfFloors);
    }
}
