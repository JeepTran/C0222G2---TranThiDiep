package case_study.furama_resort.utils;

import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WriteAndRead<E> {
    public static final String VILLA_PATH = "src/case_study/furama_resort/utils/new_data/villa.csv";
    public static final String HOUSE_PATH = "src/case_study/furama_resort/utils/new_data/house.csv";
    public static final String ROOM_PATH = "src/case_study/furama_resort/utils/new_data/room.csv";
    static List<String> villaString = new ArrayList<>();
    static List<String> houseString = new ArrayList<>();
    static List<String> roomString = new ArrayList<>();
    public static final String DELIMITER = ";";

//    public void writeToCsvFile(String path, List<E> list, Boolean flag) {
//        File file = new File(path);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else {
//            FileWriter fileWriter = null;
//            BufferedWriter bufferedWriter = null;
//            try {
//                fileWriter = new FileWriter(file, flag);
//                bufferedWriter = new BufferedWriter(fileWriter);
//                for (E e : list) {
//                    bufferedWriter.write(e.toString());
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }

    public static void writeDataToCsv(List<String> stringList, String path, boolean flag) {
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeVillaToCsv(Map<Villa, Integer> villaIntegerMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {
            stringList.add(entry.getKey().toString() + DELIMITER + entry.getValue());
        }
        writeDataToCsv(stringList, VILLA_PATH, flag);
    }
    public static void writeHouseToCsv(Map<House, Integer> houseIntegerMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<House, Integer> entry : houseIntegerMap.entrySet()) {
            stringList.add(entry.getKey().toString() + DELIMITER + entry.getValue());
        }
        writeDataToCsv(stringList, HOUSE_PATH, flag);
    }
    public static void writeRoomToCsv(Map<Room, Integer> roomIntegerMap, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {
            stringList.add(entry.getKey().toString() + DELIMITER + entry.getValue());
        }
        writeDataToCsv(stringList, ROOM_PATH, flag);
    }


    private static List<String> readFileCsvToListString(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static Map<Villa,Integer> readFileCsvToVillaList() {
        List<String> stringList = readFileCsvToListString(VILLA_PATH);
       Map <Villa,Integer> villas = new HashMap<>();
        String[] array = null;
        Villa villa = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            villa = new Villa(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]);
            villas.put(villa,Integer.parseInt(array[9]));
        }
        return villas;
    }

    public static Map<House, Integer> readFileCsvToHouseList() {
        List<String> stringList = readFileCsvToListString(HOUSE_PATH);
        Map <House,Integer> houses = new HashMap<>();
        String[] array = null;
        House house = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            house = new House(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
            houses.put(house,Integer.parseInt(array[8]));
        }
        return houses;
    }

    public static Map<Room,Integer> readFileCsvToRoomList() {
        List<String> stringList = readFileCsvToListString(ROOM_PATH);
        Map<Room,Integer> rooms = new HashMap<>();
        String[] array = null;
        Room room = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            room = new Room(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
            rooms.put(room,Integer.parseInt(array[7]));
        }
        return rooms;
    }
}
