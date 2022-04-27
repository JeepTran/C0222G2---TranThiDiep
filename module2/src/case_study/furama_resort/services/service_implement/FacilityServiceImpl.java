package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;
import case_study.furama_resort.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    static Map<Facility, Integer> facilities = new LinkedHashMap<>();

    static {
        facilities.put(new Villa("Villa1", 80d, 2000000, 4, "days", "Luxury", 20d, 2), 0);
        facilities.put(new House("House1", 50d, 1500000, 4, "days", "Standard", 2), 0);
        facilities.put(new Room("Room1", 20d, 500000, 2, "days", "Free spa"), 0);
        facilities.put(new Room("Room2", 30d, 1000000, 3, "days", "Free breakfast"), 0);
        facilities.put(new Villa("Villa2", 100d, 20000000, 6, "months", "Executive", 40d, 3), 0);
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            System.out.println(entry.getKey().toString() + " - " + entry.getValue());
        }
    }
}




