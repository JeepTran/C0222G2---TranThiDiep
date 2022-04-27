package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;
import case_study.furama_resort.services.FacilityRoomService;

import java.util.Scanner;

import static case_study.furama_resort.services.service_implement.FacilityServiceImpl.facilities;

public class FacilityRoomServiceImpl implements FacilityRoomService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        facilities.put(roomInformation(),0);
    }

    public Facility roomInformation() {
        String serviceName;
        double usableArea;
        int rentalFee;
        int maximumPax;
        String rentalType;
        String includedFreeService;


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
            System.out.print("Enter included free service: ");
            includedFreeService = scanner.nextLine();

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return roomInformation();
        }
        return new Room(serviceName,usableArea,rentalFee,maximumPax,rentalType,includedFreeService);
    }


}
