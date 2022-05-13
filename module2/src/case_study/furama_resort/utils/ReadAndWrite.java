package case_study.furama_resort.utils;

import case_study.furama_resort.models.facility_models.House;
import case_study.furama_resort.models.facility_models.Room;
import case_study.furama_resort.models.facility_models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite<E> {
    public static final String BOOKING_PATH = "src/case_study/furama_resort/utils/data/booking.csv";
    public static final String CONTRACT_PATH = "src/case_study/furama_resort/utils/data/contract.csv";
    public static final String CUSTOMER_PATH = "src/case_study/furama_resort/utils/data/customer.csv";
    public static final String EMPLOYEE_PATH = "src/case_study/furama_resort/utils/data/employee.csv";
    public static final String HOUSE_PATH = "src/case_study/furama_resort/utils/data/house.csv";
    public static final String ROOM_PATH = "src/case_study/furama_resort/utils/data/room.csv";
    public static final String VILLA_PATH = "src/case_study/furama_resort/utils/data/villa.csv";
    static List<String> villaStr = new ArrayList<>();
    static List<String> houseStr = new ArrayList<>();
    static List<String> roomStr = new ArrayList<>();
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();

    public void writeToCsvFile(String path, List<E> list, Boolean flag) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, flag);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (E e : list) {
                    bufferedWriter.write(e.toString());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static List<String> readCsvFileToList(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public static List<Villa> readVillaCsvFileToList() {
        villaList.clear();
        villaStr = readCsvFileToList(VILLA_PATH);
        for (String item : villaStr) {
            String[] info = item.split(";");
            villaList.add(new Villa(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        return villaList;
    }

    public static List<House> readHouseCsvFileToList() {
        houseList.clear();
        houseStr = readCsvFileToList(HOUSE_PATH);
        for (String item : houseStr) {
            String[] info = item.split(";");
            houseList.add(new House(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7]));
        }
        return houseList;
    }

    public static List<Room> readRoomCsvFileToList() {
        roomList.clear();
        roomStr = readCsvFileToList(ROOM_PATH);
        for (String item : roomStr) {
            String[] info = item.split(";");
            roomList.add(new Room(info[0], info[1], info[2], info[3], info[4], info[5], info[6]));
        }
        return roomList;
    }
}
