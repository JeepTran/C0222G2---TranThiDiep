package ss1_java_overview.bai_tap.bai_tap_2_ung_dung_doc_so_thanh_chu;

import java.util.Scanner;

public class ReadingNumber {
    public static void main(String[] args) {
        System.out.print("Enter a not-negative integer (3 digits at most): ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundreds = num / 100;
        String result;

        if (num == 0) {
            result = "zero";
        } else if (num < 1000 && num >= 100) {
            if (num % 100 == 0) {
                result = readHundreds(hundreds);
            } else {
                int tens = num - hundreds * 100;
                result = readHundreds(hundreds) + " and " + readTens(tens);
            }
        } else if (num < 100 && num > 0) {
            result = readTens(num);
        } else {
            result = "Out of ability!";
        }
        System.out.println(result);
    }

    public static String readOnes(int ones) {
        String readOnes = "";
        switch (ones) {
            case 1:
                readOnes = "one";
                break;
            case 2:
                readOnes = "two";
                break;
            case 3:
                readOnes = "three";
                break;
            case 4:
                readOnes = "four";
                break;
            case 5:
                readOnes = "five";
                break;
            case 6:
                readOnes = "six";
                break;
            case 7:
                readOnes = "seven";
                break;
            case 8:
                readOnes = "eight";
                break;
            case 9:
                readOnes = "nine";
                break;
        }
        return readOnes;
    }

    public static String readTens(int tens) {
        String readTens = "";
        if (tens > 10 && tens < 20) {
            switch (tens) {
                case 11:
                    readTens = "eleven";
                    break;
                case 12:
                    readTens = "twelve";
                    break;
                case 13:
                    readTens = "thirteen";
                    break;
                case 14:
                    readTens = "fourteen";
                    break;
                case 15:
                    readTens = "fifteen";
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    int ones = tens - 10;
                    readTens = readOnes(ones) + "teen";
            }
        } else {
            int quotient = tens / 10;
            int ones = tens - quotient * 10;
            switch (quotient) {
                case 0:
                    readTens = readOnes(ones);
                    break;
                case 1:
                    readTens = "ten";
                    break;
                case 2:
                    readTens = "twenty " + readOnes(ones);
                    break;
                case 3:
                    readTens = "thirty " + readOnes(ones);
                    break;
                case 4:
                    readTens = "forty " + readOnes(ones);
                    break;
                case 5:
                    readTens = "fifty " + readOnes(ones);
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    readTens = readOnes(quotient) + "ty " + readOnes(ones);
                    break;
            }
        }
        return readTens;
    }

    public static String readHundreds(int hundreds) {
        String readHundreds = "";
        switch (hundreds) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                readHundreds = readOnes(hundreds) + " hundred";
                break;
        }
        return readHundreds;
    }
}







