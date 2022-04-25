package ss16_io_text_file.bai_tap.bai_tap_1_copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    private static String sourceFile = "E:\\CodeGym 02.2022\\C0222G2\\C0222G2_TranThiDiep\\module2\\src\\ss16_io_text_file\\bai_tap\\bai_tap_1_copy_file_text\\SourceFile.txt";
    private static String targetFile = "E:\\CodeGym 02.2022\\C0222G2\\C0222G2_TranThiDiep\\module2\\src\\ss16_io_text_file\\bai_tap\\bai_tap_1_copy_file_text\\TargetFile.txt";


    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> stringList = CopyFileText.readFile(sourceFile);
        writeFile(targetFile, stringList);
        System.out.println("The number of characters in the file is "+stringList.size());
    }

    public static List<String> readFile(String sourceFilePath) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(sourceFilePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }

    public static void writeFile(String targetFilePath, List<String> stringList) {
        try {
            FileWriter fileWriter = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
