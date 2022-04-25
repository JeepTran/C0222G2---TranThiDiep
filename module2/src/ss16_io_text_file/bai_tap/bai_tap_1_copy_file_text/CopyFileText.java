package ss16_io_text_file.bai_tap.bai_tap_1_copy_file_text;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    private static String sourceFile = "src\\ss16_io_text_file\\bai_tap\\bai_tap_1_copy_file_text\\SourceFile.txt";
    private static String targetFile = "src\\ss16_io_text_file\\bai_tap\\bai_tap_1_copy_file_text\\TargetFile.txt";
    private static int count = 0;

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> stringList = copyFileText.readFile(sourceFile);
        writeFile(targetFile, stringList);
        System.out.println("The number of characters in the file is " + count);
    }

    public static List<String> readFile(String sourceFilePath) {
        List<String> stringList = new ArrayList<>();

        try {
            File file = new File(sourceFilePath);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found!");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
                count += line.length();
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringList;
    }

    public static void writeFile(String targetFilePath, List<String> stringList) {
        File file = new File(targetFilePath);
        if (file.exists()) {
            System.out.println("File already exists. Continue to copy?\n" +
                    "1. Yes\n" +
                    "2. No");
            int choice = Integer.parseInt((new Scanner(System.in).nextLine()));
            switch (choice) {
                case 1:
                default:
                    try {
                        FileWriter fileWriter = new FileWriter(targetFilePath);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        for (String s : stringList) {
                            bufferedWriter.write(s);
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        fileWriter.close();
                    } catch (FileAlreadyExistsException e) {
                        System.err.println(e);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    return;
            }

        } else {
            try {
                FileWriter fileWriter = new FileWriter(targetFilePath);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                for (String s : stringList) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();
            } catch (FileAlreadyExistsException e) {
                System.err.println(e);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
