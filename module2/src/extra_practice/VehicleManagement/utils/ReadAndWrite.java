package extra_practice.VehicleManagement.utils;

import case_study.furama_resort.models.facility_models.Villa;
import extra_practice.VehicleManagement.models.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String CAR_PATH = "src/extra_practice/VehicleManagement/utils/data/car.csv";
    public static final String TRUCK_PATH = "src/extra_practice/VehicleManagement/utils/data/truck.csv";
    public static final String MOTORBIKE_PATH = "src/extra_practice/VehicleManagement/utils/data/motorbike.csv";
    public static final String DELIMITER = ",";

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
 public static void writeCarToCsv(List<Car> carList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Car car : carList) {
            stringList.add(car.getInfo(DELIMITER));
        }
        writeDataToCsv(stringList, CAR_PATH, flag);
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

    public static List<Car> readFileCsvToCarList() {
        List<String> stringList = readFileCsvToListString(CAR_PATH);
        List<Car> carList = new ArrayList<>();
        String[] array = null;
       Car car = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
            carList.add(car);
        }
        return carList;
    }


}
