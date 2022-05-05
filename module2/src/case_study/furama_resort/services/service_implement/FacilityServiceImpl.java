package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;
import case_study.furama_resort.services.FacilityService;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilities = new LinkedHashMap<>();

    static {
        facilities.put(new Villa("SVVL-2001","Villa1", "80", "2000000", "4", "days", "Luxury", "20", "2"), 5);
        facilities.put(new House("SVHO-1001","House1", "50", "1500000", "4", "days", "Standard", "2"), 5);
        facilities.put(new Room("SVRO-0001","Room1", "30", "500000", "2", "days", "Free spa"), 5);
        facilities.put(new Room("SVRO-0002","Room2", "40", "1000000", "3", "days", "Free breakfast"), 4);
        facilities.put(new Villa("SVVL-2002","Villa2", "100", "20000000", "6", "months", "Executive", "40", "3"), 0);
    }


    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }

    public void displayMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            if (entry.getValue() >= 5) {
                System.out.println(entry.getKey());
            }
        }

    }


}





