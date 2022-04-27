package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.Villa;
import case_study.furama_resort.services.FacilityVillaService;

import java.util.Scanner;

import static case_study.furama_resort.services.service_implement.FacilityServiceImpl.facilities;

public class FacilityVillaServiceImpl implements FacilityVillaService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        facilities.put(villaInformation(),0);
    }

    public Facility villaInformation() {
        String serviceName;
        double usableArea;
        int rentalFee;
        int maximumPax;
        String rentalType;
        String roomStandard;
        double poolArea;
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
            System.out.print("Enter pool's area: ");
            poolArea = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter number of floors: ");
            numOfFloors = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return villaInformation();
        }
        return new Villa(serviceName,usableArea,rentalFee,maximumPax,rentalType,roomStandard,poolArea,numOfFloors);
    }


}

