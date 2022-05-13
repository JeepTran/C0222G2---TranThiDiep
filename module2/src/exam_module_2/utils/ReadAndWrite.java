package exam_module_2.utils;

import exam_module_2.models.AuthorizedMobile;
import exam_module_2.models.ForeignMobile;
import exam_module_2.models.Mobile;
import extra_practice.VehicleManagement.models.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static final String AUTHORIZED_MOBILE_PATH = "src/exam_module_2/utils/data/authorizedMobile.csv";
    public static final String FOREIGN_MOBILE_PATH = "src/exam_module_2/utils/data/foreignMobile.csv";
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
    public static void writeAuthorizedMobile(List<AuthorizedMobile> authorizedMobileList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (AuthorizedMobile mobile:authorizedMobileList) {
            stringList.add(mobile.getInfo(DELIMITER));
        }
        writeDataToCsv(stringList, AUTHORIZED_MOBILE_PATH, flag);
    }
    public static void writeForeignMobile(List<ForeignMobile> foreignMobileList, boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (ForeignMobile mobile:foreignMobileList) {
            stringList.add(mobile.getInfo(DELIMITER));
        }
        writeDataToCsv(stringList, FOREIGN_MOBILE_PATH, flag);
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
    public static List<AuthorizedMobile> readAuthorizedMobile() {
        List<String> stringList = readFileCsvToListString(AUTHORIZED_MOBILE_PATH);
        List<AuthorizedMobile> authorizedMobileList = new ArrayList<>();
        String[] array = null;
        AuthorizedMobile authorizedMobile = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            authorizedMobile = new AuthorizedMobile(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]), array[4], Integer.parseInt(array[5]),array[6]);
            authorizedMobileList.add(authorizedMobile);
        }
        return authorizedMobileList;
    }
    public static List<ForeignMobile> readForeignMobile() {
        List<String> stringList = readFileCsvToListString(FOREIGN_MOBILE_PATH);
        List<ForeignMobile> foreignMobileList = new ArrayList<>();
        String[] array = null;
        ForeignMobile foreignMobile = null;
        for (String string : stringList) {
            array = string.split(DELIMITER);
            foreignMobile = new ForeignMobile(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]),
                    Integer.parseInt(array[3]), array[4], array[5],array[6]);
            foreignMobileList.add(foreignMobile);
        }
        return foreignMobileList;
    }
}
