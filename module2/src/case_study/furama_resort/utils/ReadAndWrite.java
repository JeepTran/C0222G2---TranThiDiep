package case_study.furama_resort.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String BOOKING_PATH = "src/case_study/furama_resort/utils/data/booking.csv";
    public static final String CONTRACT_PATH = "src/case_study/furama_resort/utils/data/contract.csv";
    public static final String CUSTOMER_PATH = "src/case_study/furama_resort/utils/data/customer.csv";
    public static final String EMPLOYEE_PATH = "src/case_study/furama_resort/utils/data/employee.csv";
    public static final String HOUSE_PATH = "src/case_study/furama_resort/utils/data/house.csv";
    public static final String ROOM_PATH = "src/case_study/furama_resort/utils/data/room.csv";
    public static final String VILLA_PATH = "src/case_study/furama_resort/utils/data/villa.csv";

    public static void writeToCsvFile(String path,List list,Boolean flag){
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Object item:list){
                bufferedWriter.write(item.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static List readCsvFileToList(String path){
        List list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
