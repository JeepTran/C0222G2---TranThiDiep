package case_study.furama_resort.services.service_implement;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;
import case_study.furama_resort.services.FacilityService;
import case_study.furama_resort.utils.ReadAndWrite;
import case_study.furama_resort.utils.WriteAndRead;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilities = new LinkedHashMap<>();
    //    static ReadAndWrite readAndWrite = new ReadAndWrite();
    static WriteAndRead writeAndRead = new WriteAndRead();
    static List<Facility> maintenanceFacilities = new ArrayList<>();

//    static {
//        facilities.put(new Villa("SVVL-2001", "Villa1", "80", "2000000", "4", "days", "Luxury", "20", "2"), 5);
//        facilities.put(new House("SVHO-1001", "House1", "50", "1500000", "4", "days", "Standard", "2"), 5);
//        facilities.put(new Room("SVRO-0001", "Room1", "30", "500000", "2", "days", "Free spa"), 5);
//        facilities.put(new Room("SVRO-0002", "Room2", "40", "1000000", "3", "days", "Free breakfast"), 4);
//        facilities.put(new Villa("SVVL-2002", "Villa2", "100", "20000000", "6", "months", "Executive", "40", "3"), 0);
//        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
//            if (entry.getKey() instanceof Villa) {
//                villaList.add((Villa) entry.getKey());
//            } else if (entry.getKey() instanceof House) {
//                houseList.add((House) entry.getKey());
//            } else {
//                roomList.add((Room) entry.getKey());
//            }
//            readAndWrite.writeToCsvFile(ReadAndWrite.VILLA_PATH, villaList, false);
//            readAndWrite.writeToCsvFile(ReadAndWrite.HOUSE_PATH, houseList, false);
//            readAndWrite.writeToCsvFile(ReadAndWrite.ROOM_PATH, roomList, false);
//        }
//    }


    @Override
    public void display() {
        facilities.clear();
        Map<Villa, Integer> villaIntegerMap = WriteAndRead.readFileCsvToVillaList();
        for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
//        ReadAndWrite.readVillaCsvFileToList();

//        for (Villa villa : ReadAndWrite.villaList) {
//            if (facilities.containsKey(villa) && facilities.get(villa) < 5) {
//                facilities.put(villa, facilities.get(villa) + 1);
//            } else {
//                facilities.put(villa, 1);
//            }

//        }
//
//        ReadAndWrite.readHouseCsvFileToList();
//        for (House house : ReadAndWrite.houseList) {
//            if (facilities.containsKey(house) && facilities.get(house) < 5) {
//                facilities.put(house, facilities.get(house) + 1);
//            } else {
//                facilities.put(house, 1);
//            }
//        }
//
//        ReadAndWrite.readRoomCsvFileToList();
//        for (Room room : ReadAndWrite.roomList) {
//            if (facilities.containsKey(room) && facilities.get(room) < 5) {
//                facilities.put(room, facilities.get(room) + 1);
//            } else {
//                facilities.put(room, 1);
//            }
//        }

        if (facilities.isEmpty()) {
            System.out.println("No facilities to display!");
        } else {
            for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
                System.out.println(entry.getKey().getServiceId() + " - " + entry.getValue());
            }
        }

    }

    public void displayMaintenance() {
        checkMaintenance();
        if (maintenanceFacilities.isEmpty()) {
            System.out.println("No under-maintenance facility to display!");
        } else {
            for (Facility maintenance : maintenanceFacilities) {
                System.out.println("Facility '" + maintenance.toString() + "' is under maintenance!");
            }
        }
    }

    private List<Facility> checkMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilities.entrySet()) {
            if (entry.getValue() >= 5) {
                maintenanceFacilities.add(entry.getKey());
                facilities.put(entry.getKey(), 0);
            }
        }
        return maintenanceFacilities;
    }
}